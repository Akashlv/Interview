public class BST {

	class Node {
		int key;
		Node left, right;
		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	static Node root;
	public BST() {
		root = null;
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key) {
			root.left = insertRec(root.left, key);
		} else if (key > root.key) {
			root.right = insertRec(root.right, key);
		}
		return root;
	}

	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}

	public Node search(Node root, int key) {
		if (root == null || root.key == key)
			return root;

		if (root.key < key)
			return search(root.right, key);

		return search(root.left, key);
	}

	public static void main(String[] args) {

		BST bt = new BST();

		System.out.println(bt.search(root, 80));

		bt.insert(80);
		bt.insert(70);
		bt.insert(60);
		System.out.println("Binary search tree after insertion:");
		bt.inorderRec(root);

	}
}