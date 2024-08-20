package tn;

public class BinarySearchTree2 {

		// Method to create a new node
	    public static TreeNode createNewNode(int data) {
	        return new TreeNode(data);
	    }

	    // Method to insert a new node into the BST
	    public static TreeNode insertNode(TreeNode root, int data) {
	        if (root == null) {
	            return createNewNode(data); // Create a new node if root is null
	        }

	        // If data to insert is less than the current node, insert in left subtree
	        if (data < root.data) {
	            root.left = insertNode(root.left, data);
	        } 
	        // If data to insert is greater than the current node, insert in right subtree
	        else if (data > root.data) {
	            root.right = insertNode(root.right, data);
	        }

	        return root; // Return the unchanged node pointer
	    }

	    // Method to print the tree (Inorder Traversal)
	    public static void printInOrder(TreeNode root) {
	        if (root != null) {
	            printInOrder(root.left);
	            System.out.print(root.data + " ");
	            printInOrder(root.right);
	        }
	    }

	    public static void main(String[] args) {
	        // Create the original tree with the new values
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

	        System.out.println("Original BST (Inorder Traversal):");
	        printInOrder(root); // Print the original tree
	        System.out.println();

	        // Insert new nodes with values consistent with the previous tree
	        root = insertNode(root, 7);
	        root = insertNode(root, 2);

	        System.out.println("BST after inserting 7 and 2 (Inorder Traversal):");
	        printInOrder(root); // Print the tree after insertion
	    }
	}

	