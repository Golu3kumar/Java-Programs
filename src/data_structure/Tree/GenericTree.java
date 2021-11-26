package data_structure.Tree;


class GTreeNode {
    int data;
    GTreeNode firstChild;
    GTreeNode nextSiblings;

    public GTreeNode(int data) {
        this.data = data;
        firstChild = null;
        nextSiblings = null;
    }

}

public class GenericTree {
    GTreeNode root;

    public void createGTree() {
        GTreeNode zero = new GTreeNode(0);
        GTreeNode first = new GTreeNode(1);
        GTreeNode second = new GTreeNode(2);
        GTreeNode third = new GTreeNode(3);
        GTreeNode fourth = new GTreeNode(4);

        zero.firstChild = first;                //     0
        first.nextSiblings = second;            //  1 - 2 - 3
        second.nextSiblings = third;            //        4
        third.firstChild = fourth;
        root = zero;
    }

    public int sumOfGTree(GTreeNode root) {
        if (root == null)
            return 0;

        return root.data + sumOfGTree(root.firstChild) + sumOfGTree(root.nextSiblings);
    }

    public int depthOfGTree(int[] parentArray) {
        int maxDepth = -1, currentDepth = -1, j;
        for (int i = 0; i < parentArray.length; i++) {
            currentDepth = 0;
            j = i;
            while (parentArray[j] != -1) {
                currentDepth++;
                j = parentArray[j];
            }
            if (currentDepth > maxDepth)
                maxDepth = currentDepth;
        }

        return maxDepth;

    }

    public static void main(String[] args) {

        GenericTree genericTree = new GenericTree();
        genericTree.createGTree();

        System.out.println("Sum of tree : " + genericTree.sumOfGTree(genericTree.root));
        System.out.println("Max depth of GTree : "+genericTree.depthOfGTree(new int[]{-1,0,0,0,3}));
    }
}
