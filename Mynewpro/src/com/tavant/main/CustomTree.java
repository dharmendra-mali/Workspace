package com.tavant.main;

class Node {

	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right = null;
	}
}

public class CustomTree {
	Node root;

	public static void main(String[] args) {

		CustomTree tree = new CustomTree();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(7);
		tree.commanOpration();

	}

	private void commanOpration() {
		TreeOpration obj = new TreeOpration();
		obj.levalOrderTravarsal(root);
		
	}

	public void iterativePreorder() {
		TreeOpration obj = new TreeOpration();
		obj.iterativePreorder(root);
	}

}
