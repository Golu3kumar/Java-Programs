package data_structure.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class BinarySearchTreeNode {
    private int data;
    private BinarySearchTreeNode left;
    private BinarySearchTreeNode right;

    public BinarySearchTreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinarySearchTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTreeNode left) {
        this.left = left;
    }

    public BinarySearchTreeNode getRight() {
        return right;
    }

    public void setRight(BinarySearchTreeNode right) {
        this.right = right;
    }
}

public class BinarySearchTree {

    BinarySearchTreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void createBST() {

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

    // finding node recursive approach
    public BinarySearchTreeNode find(BinarySearchTreeNode root, int data) {
        if (root == null)
            return null;

        if (root.getData() == data) {
            return root;
        } else if (data < root.getData())
            return find(root.getLeft(), data);
        return find(root.getRight(), data);
    }



    // finding node iterative mode
    public BinarySearchTreeNode findNode(BinarySearchTreeNode root, int data) {
        if (root == null)
            return null;

        while (root != null) {
            if (root.getData() == data)
                return root;
            else if (data < root.getData())
                root = root.getLeft();
            else
                root = root.getRight();

        }
        return null;
    }

    // finding minimum node
    public BinarySearchTreeNode findMin(BinarySearchTreeNode root) {
        if (root == null)
            return null;
        else {
            if (root.getLeft() == null)
                return root;
            else
                return findMin(root.getLeft());
        }
    }

    // finding the max node
    public BinarySearchTreeNode findMax(BinarySearchTreeNode root) {
        if (root == null)
            return null;
        else {
            if (root.getRight() == null)
                return root;
            else
                return findMax(root.getRight());
        }
    }

    // inorder traversal : It gives sorted BST
    public void inorderTraversal(BinarySearchTreeNode root) {
        if (root == null)
            return;
        inorderTraversal(root.getLeft());
        System.out.print(root.getData() + " ");
        inorderTraversal(root.getRight());
    }

    // I am just doing for practice
    public void inorderTraversalIterative(BinarySearchTreeNode root) {
        if (root == null)
            return;
        Stack<BinarySearchTreeNode> stk = new Stack<>();
        BinarySearchTreeNode temp = root;
        while (!stk.isEmpty() || temp != null) {
            if (temp != null) {
                stk.push(temp);
                temp = temp.getLeft();
            } else {
                temp = stk.pop();
                System.out.print(temp.getData() + " ");
                temp = temp.getRight();
            }
        }
    }

    // Level order traversal
    public void leverOrderTraversal(BinarySearchTreeNode root) {
        if (root == null)
            return;
        Queue<BinarySearchTreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            BinarySearchTreeNode temp = q.poll();
            System.out.print(temp.getData() + " ");

            if (temp.getLeft() != null)
                q.offer(temp.getLeft());
            if (temp.getRight() != null)
                q.offer(temp.getRight());
        }
    }

    // Inserting a node in BST
    public BinarySearchTreeNode insertNode(BinarySearchTreeNode root, int data) {
        if (root == null) {
            root = new BinarySearchTreeNode(data);
        } else {
            if (data < root.getData())
                root.setLeft(insertNode(root.getLeft(), data));
            else if (data > root.getData())
                root.setRight(insertNode(root.getRight(), data));
        }
        return root;
    }

    // Deleting a particular node in BST
    public BinarySearchTreeNode deleteNode(BinarySearchTreeNode root, int data) {
        if (root == null)
            return null;

        if (data < root.getData()) {
            root.setLeft(deleteNode(root.getLeft(), data));
        } else if (data > root.getData()) {
            root.setRight(deleteNode(root.getRight(), data));
        } else {
            // data is found
            // deleting node has both left and right child
            if (root.getLeft() != null && root.getRight() != null) {
                int max = findMax(root.getLeft()).getData();
                root.setData(max);
                root.setLeft(deleteNode(root.getLeft(), max));
                return root;
            } else if (root.getLeft() != null) {
                return root.getLeft();
            } else if (root.getRight() != null) {
                return root.getRight();
            } else {
                return null;
            }
        }
        return root;
    }

    // finding the distance between two nodes in BSTs
    // the approach is we first find the LCA of those nodes and then calculate the distance
    // It's little bit difficult
    public int distance(BinarySearchTreeNode root, int a, int b) {
        if (root == null)
            return 0;
        // first we get the LCA for these nodes (a and b)
        BinarySearchTreeNode lca = findLca(root, a, b);
        System.out.println(lca.getData());
        // now we need to get the distance from lca
        int d1 = findLevel(lca, a, 0);
        int d2 = findLevel(lca, b, 0);
        return d1 + d2;
    }

    private int findLevel(BinarySearchTreeNode root, int node, int level) {
        if (root == null)
            return -1;
        if (root.getData() == node)
            return level;
        int left = findLevel(root.getLeft(), node, level + 1);
        if (left == -1)
            return findLevel(root.getRight(), node, level + 1);
        return left;
    }

    private BinarySearchTreeNode findLca(BinarySearchTreeNode root, int a, int b) {
        if (root == null)
            return null;

        // if any one has same data then return that node
        if (root.getData() == a || root.getData() == b) {
            return root;
        }
        // logic for Binary Tree
        //        BinarySearchTreeNode left_node = findLca(root.getLeft(), a, b);
//        BinarySearchTreeNode right_node = findLca(root.getRight(), a, b);
//
//        // if both of these node are NOT_NULL then one has in left and other is in right
//        // so we get the node (LCA)
//        if (left_node != null && right_node != null)
//            return root;
//
//        if (left_node != null)
//            return left_node;
//        else
//            return right_node;

        if (a < root.getData() && b < root.getData()) {
            return findLca(root.getLeft(), a, b);
        } else if (a > root.getData() && b > root.getData())
            return findLca(root.getRight(), a, b);
        else
            return root;
    }

    // let's check a Binary Tree is BST or not
    public boolean isBST(BinarySearchTreeNode root, int min, int max) {
        if (root == null)
            return true;

        return (root.getData() > min && root.getData() < max
                && isBST(root.getLeft(), min, root.getData())
                && isBST(root.getRight(), root.getData(), max));
    }

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        bst.createBST();

        BinarySearchTreeNode foundedNode = bst.find(bst.root, 14);
        if (foundedNode != null)
            System.out.println(foundedNode.getData());
        else
            System.out.println("Sorry Node not found!");
        BinarySearchTreeNode foundedNode2 = bst.findNode(bst.root, 3);
        if (foundedNode2 != null)
            System.out.println(foundedNode2.getData());
        else
            System.out.println("Sorry Node not found!");

        BinarySearchTreeNode min = bst.findMin(bst.root);
        BinarySearchTreeNode max = bst.findMax(bst.root);
        System.out.println("Min Node : " + min.getData());
        System.out.println("Max Node : " + max.getData());

        System.out.println("Inorder traversal of BST: ");
        bst.inorderTraversal(bst.root);
        System.out.println();
        System.out.println("Inorder traversal of BST: ");
        bst.inorderTraversalIterative(bst.root);
        System.out.println();

        System.out.println("Inserting 29 and 1 into the BST: ");
        bst.insertNode(bst.root, 29);
        bst.insertNode(bst.root, 1);
        bst.inorderTraversal(bst.root);
        System.out.println();

        System.out.println("Level Order traversal : ");
        bst.leverOrderTraversal(bst.root);
        System.out.println();

        System.out.println("Deleting node 16 : ");
        BinarySearchTreeNode deletedNode = bst.deleteNode(bst.root, 16);
        bst.leverOrderTraversal(bst.root);
        System.out.println();
        // let's find some distance
        int distance = bst.distance(bst.root, 10, 4);
        System.out.println("Distance between 10 and 4 : " + distance);
        //System.out.println(bst.root.getData());
        distance = bst.distance(bst.root, 4, 11);
        System.out.println("Distance between 4 and 11 : " + distance);

        // now we gonna check the tree is BST or not
        boolean isBst = bst.isBST(bst.root, Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.println("Is BST : "+isBst);

    }
}
