package tn;

public class BinarySearchTree {
	public static TreeNode createNewNode(int data) {
        return new TreeNode(data);
    }

    // Method to search for a node with the given data
    public static boolean findNode(TreeNode root, int value) {
        if (root == null) {
            return false; // Base case: if the root is null, the node is not found
        }

        if (root.data == value) {
            return true; // Node found
        } else if (value < root.data) {
            return findNode(root.left, value); // Search in the left subtree
        } else {
            return findNode(root.right, value); // Search in the right subtree
        }
    }

    public static void main(String[] args) {
        // Create nodes with different values
        TreeNode root = createNewNode(15);
        TreeNode node5 = createNewNode(5);
        TreeNode node20 = createNewNode(20);
        TreeNode node3 = createNewNode(3);
        TreeNode node10 = createNewNode(10);
        TreeNode node8 = createNewNode(8);
        TreeNode node12 = createNewNode(12);
        TreeNode node25 = createNewNode(25);
        TreeNode node18 = createNewNode(18);

        // Construct the binary search tree
        root.left = node5;
        root.right = node20;

        node5.left = node3;
        node5.right = node10;

        node10.left = node8;
        node10.right = node12;

        node20.right = node25;
        node20.left = node18;

        // Print values to verify structure
        System.out.println("root.right.data: " + root.right.data);  // Should print 20
        System.out.println("root.left.right.data: " + root.left.right.data);  // Should print 10
        System.out.println("root.right.right.data: " + root.right.right.data);  // Should print 25
        System.out.println("root.left.left.data: " + root.left.left.data);  // Should print 3

        // Search for specific nodes
        int searchValue = 12;
        if (findNode(root, searchValue)) {
            System.out.println("Node " + searchValue + " found in the BST.");
        } else {
            System.out.println("Node " + searchValue + " not found in the BST.");
        }

        searchValue = 7;
        if (findNode(root, searchValue)) {
            System.out.println("Node " + searchValue + " found in the BST.");
        } else {
            System.out.println("Node " + searchValue + " not found in the BST.");
        }
    }
}