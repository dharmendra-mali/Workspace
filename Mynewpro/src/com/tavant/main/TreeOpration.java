package com.tavant.main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeOpration {

	public void levalOrderTravarsal(Node root) {
		if (root == null)
			return;
		Queue<Object> tack = new LinkedList<>();
		tack.add(root);
		while (tack.isEmpty() == false) {
			root = (Node) tack.remove();
			System.out.print(root.data + " ");
			
			if (root.left != null) {
				tack.add(root.left);
			}
			if (root.right != null) {
				tack.add(root.right);
			}
		}

	}

	
	public void iterativePreorder(Node root) {

		if (root == null) {
			return;
		}
		Stack<Node> stackNode = new Stack<Node>();

		while (root != null || stackNode.size() > 0) {

			while (root != null) {
				stackNode.push(root);
				root = root.left;

			}
			root = stackNode.pop();
			System.out.print(root.data + " ");

			root = root.right;

		}

	}

	public void iterativeinorder(Node root) {

		if (root == null) {
			return;
		}
		Stack<Node> stackNode = new Stack<Node>();
		stackNode.push(root);
		while (stackNode.empty() == false) {
			Node myNode = stackNode.peek();

			if (myNode.left != null) {
				stackNode.push(myNode.left);
			}
			System.out.print(myNode.data + " ");
			stackNode.pop();
			if (myNode.right != null) {
				stackNode.push(myNode.right);
			}
		}

	}
}
