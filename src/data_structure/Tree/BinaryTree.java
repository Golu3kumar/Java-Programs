package data_structure.Tree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Tree : A Tree is non-linear data structure that is used to store data in Hierarchical order
// It never form cycle.
// It is a collection of nodes and edges that represent hierarchical structure
// The first node of Tree is Called root Node
public class BinaryTree {

    public TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    void createBinaryTree() {
        // create some nodes
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        // assign first node to root
        root = first;            //      1
        first.left = second;    //     /   \
        first.right = third;    //    2     3
        second.left = fourth;   //   / \   / \
        third.right = fifth;    //  4  6 null 5
        second.right = sixth;

    }

    void preorderTraversal(TreeNode root) {
        // In Preorder traversal we first print the root node then traverse to left till we found null
        // and print nodes value one by one then we traverse in right side and print node value.
        // algo :
        // print(root.data)
        // preOrder(root.left)
        // preOrder(root.right)
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    void inorderTraversal(TreeNode root) {
        // algo :
        // inorderTraversal(root.left)
        // print(root.data)
        // inorderTraversal(root.right)
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    void postOrderTraversal(TreeNode root) {
        // algo :
        // inorderTraversal(root.left)
        // inorderTraversal(root.right)
        // print(root.data)
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    // Iterative Preorder Traversal
    public void iterativePreorderTraversal() {
        if (root == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.data + " ");

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    // Iterative Inorder Traversal
    public void iterativeInorderTraversal() {
        if (root == null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    // Iterative PostOrder Traversal
    // TODO : This function needs to be completed.
    public void iterativePostOrderTraversal() {

    }

    // Level Traversal with Maximum Element
    public int levelOrderTraversal() {
        if (root == null)
            return Integer.MIN_VALUE;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int max = Integer.MIN_VALUE;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.data > max)
                max = temp.data;
            // we add the next level into the queue
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }

        return max;
    }

    // Reverse level order traversal with sum of Binary tree.
    public int levelOrderTraversalReverse(TreeNode root) {

        int sum = 0;
        if (root == null)
            return sum;

        Stack<TreeNode> stack = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode currNode = queue.poll();
            sum += currNode.data;
            if (currNode.right != null) {
                queue.offer(currNode.right);
            }
            if (currNode.left != null) {
                queue.offer(currNode.left);
            }
            stack.push(currNode);
        }

        while (!stack.isEmpty())
            System.out.print(stack.pop().data + " ");

        return sum;
    }

    // find maximum element in Binary tree(Recursive)
    public int getMax(TreeNode root) {
        if (root == null)
            return Integer.MIN_VALUE;
        int max = root.data;
        int leftValue = getMax(root.left);
        int rightValue = getMax(root.right);

        if (leftValue > max)
            max = leftValue;

        if (rightValue > max)
            max = rightValue;

        return max;
    }

    // search an element in Binary Tree(Recursive)
    // For Iterative use LevelOrderTraversal and compare with your key value.
    public boolean isAvailable(TreeNode root, int val) {
        if (root == null)
            return false;

        if (root.data == val)
            return true;

        return isAvailable(root.left, val) || isAvailable(root.right, val);

    }

    // We can Insert a New Node in the left or right wherever the NULL takes placed(Left is preferred)
    // Here We used LevelOrderTraversal
    public void insertNode(int data) {
        if (root == null)
            return;

        TreeNode newNode = new TreeNode(data);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode currNode = queue.poll();

            if (currNode.left != null)
                queue.offer(currNode.left);
            else {
                currNode.left = newNode;
                return;
            }

            if (currNode.right != null)
                queue.offer(currNode.right);
            else {
                currNode.right = newNode;
                return;
            }

        }
    }

    // find the size of Binary tree(Recursively)
    // To perform iteratively used Level Order Traversal.
    public int size(TreeNode root) {
        // ternary operator
        int leftCount = root.left == null ? 0 : size(root.left);
        int rightCount = root.right == null ? 0 : size(root.right);
        return 1 + leftCount + rightCount;
    }

    

    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        bTree.createBinaryTree();

        System.out.println("Preorder Traversal : ");
        bTree.preorderTraversal(bTree.root);
        System.out.println();
        System.out.println("Inorder Traversal : ");
        bTree.inorderTraversal(bTree.root);
        System.out.println();
        System.out.println("Post order Traversal : ");
        bTree.postOrderTraversal(bTree.root);
        System.out.println();
        System.out.println("Preorder Traversal Iterative : ");
        bTree.iterativePreorderTraversal();
        System.out.println();
        System.out.println("Inorder Traversal Iterative : ");
        bTree.iterativeInorderTraversal();
        System.out.println();
        System.out.println("Lever Order Traversal Iterative : ");
        int max = bTree.levelOrderTraversal();
        System.out.println("\nMax element in tree(Iterative) : " + max);
        System.out.println("Max element in Tree : " + bTree.getMax(bTree.root));

        System.out.println("Is 6 available? : " + bTree.isAvailable(bTree.root, 6));
        System.out.println("Is 8 available? : " + bTree.isAvailable(bTree.root, 8));
        System.out.println();

        System.out.println("Size of tree : " + bTree.size(bTree.root));
        // inserting new node
        bTree.insertNode(8);
        System.out.println("Is 8 available? : " + bTree.isAvailable(bTree.root, 8));
        System.out.println("Size of tree(After inserting a node) : " + bTree.size(bTree.root));

        System.out.println("Level order traversal reverse : ");
        int sum = bTree.levelOrderTraversalReverse(bTree.root);
        System.out.println("\nSum of the tree : " + sum);

    }
}
