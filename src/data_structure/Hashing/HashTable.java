package data_structure.Hashing;


public class HashTable {
    private final HashNode[] bucket;
    private final int sizeOfBucket;
    private int size;

    public HashTable() {
        this(10);
    }

    public HashTable(int capacity) {
        this.bucket = new HashNode[capacity];
        this.sizeOfBucket = capacity;
        this.size = 0;
    }

    private static class HashNode {
        private final Integer key;
        private String value;
        private HashNode next;

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(Integer key, String value) throws Exception {
        if (key == null || value == null)
            throw new Exception("One of the element is null");
        int index = getIndex(key);
        HashNode head = bucket[index];
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        head = bucket[index];
        HashNode newNode = new HashNode(key, value);
        newNode.next = head;
        bucket[index] = newNode;
        size++;
    }

    private int getIndex(Integer key) {
        return key % sizeOfBucket;
    }

    public String get(Integer key) {
        int index = getIndex(key);
        HashNode temp = bucket[index];
        while (temp != null) {
            if (temp.key.equals(key)) {
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    public String remove(Integer key) {
        int index = getIndex(key);
        HashNode head = bucket[index];
        HashNode prev = null;
        while (head != null){
            if (head.key.equals(key)){
                break;
            }
            prev = head;
            head = head.next;
        }
        if (head == null) return null;
        size--;
        if (prev != null)
            prev.next = head.next;
        else
            bucket[index] = head.next;

        return head.value;
    }

    public void print() {
        for (HashNode hashNode : bucket) {
            while (hashNode != null) {
                System.out.println(hashNode.key + " -> " + hashNode.value);
                hashNode = hashNode.next;
            }
        }
    }


    public static void main(String[] args) {

        HashTable student = new HashTable();
        try {
            student.put(80, "Samrat Kumar");
            student.put(85, "Nikhil Kumar");
            student.put(95, "Niranjan Kumar");
            student.put(90, "Pintu Kumar");
            student.put(90, "Golu kumar");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Marks -> Student Name");
        student.print();

        System.out.println(student.get(90));
        //student.print();

        System.out.println(student.remove(90));
        System.out.println();
        student.print();

    }
}
