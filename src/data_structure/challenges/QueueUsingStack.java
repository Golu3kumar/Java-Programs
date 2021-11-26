package data_structure.challenges;


public class QueueUsingStack {

    StackUsingLinkedList enqueue;
    StackUsingLinkedList dequeue;
    public QueueUsingStack() {
        this.enqueue = new StackUsingLinkedList();
        this.dequeue = new StackUsingLinkedList();
    }

    public boolean isEmpty(){
        return (enqueue.getLength() + dequeue.getLength()) == 0;
    }
    public void offer(int data){
        enqueue.push(data);

    }
    public int remove(){
        shiftStacks();
        return dequeue.pop();
    }
    private void shiftStacks() {
        if (dequeue.isEmpty()){
            while (!enqueue.isEmpty()){
                dequeue.push(enqueue.pop());
            }
        }
    }

    public int peek() throws Exception {
        shiftStacks();
        return dequeue.peek();
    }

    public static void main(String[] args) throws Exception {

        QueueUsingStack qus = new QueueUsingStack();

        qus.offer(45);
        qus.offer(3);
        qus.offer(7);
        qus.offer(90);
        qus.offer(34);

        System.out.println(qus.peek());
        System.out.println(qus.remove());
        System.out.println(qus.peek());

    }
}
