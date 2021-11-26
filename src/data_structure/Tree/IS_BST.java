package data_structure.Tree;

public class IS_BST {

    BinarySearchTreeNode root;

    public IS_BST() {
        root = null;
    }

    public void createBST(){

        BinarySearchTreeNode b1 = new BinarySearchTreeNode(10);
        BinarySearchTreeNode b2 = new BinarySearchTreeNode(16);
        BinarySearchTreeNode b3 = new BinarySearchTreeNode(3);
        BinarySearchTreeNode b4 = new BinarySearchTreeNode(6);
        BinarySearchTreeNode b5 = new BinarySearchTreeNode(8);
        BinarySearchTreeNode b6 = new BinarySearchTreeNode(11);
        BinarySearchTreeNode b7 = new BinarySearchTreeNode(5);
        BinarySearchTreeNode b8 = new BinarySearchTreeNode(4);

        // linking nodes
        b1.setLeft(b4);  //              10
        b1.setRight(b2); //         6          16
        b4.setLeft(b3);  //      3     8   11
        b4.setRight(b5); //         5
        b2.setLeft(b6); //       4
        b3.setRight(b7);
        b7.setLeft(b8);
        this.root = b1;
    }
}
