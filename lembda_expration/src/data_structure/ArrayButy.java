package data_structure;

public class ArrayButy {

	public static void main(String[] args) {

	}

	static int count(SinglyLinkedListNode thead) {
		SinglyLinkedListNode temp = thead;
		int c = 0;
		while (temp != null) {
			c++;
			temp = temp.next;
		}
		return c;
	}

	static int _getIntesectionNode(int d, SinglyLinkedListNode node1, SinglyLinkedListNode node2) {
		int i;
		SinglyLinkedListNode current1 = node1;
		SinglyLinkedListNode current2 = node2;
		for (i = 0; i < d; i++) {
			if (current1 == null) {
				return -1;
			}
			current1 = current1.next;
		}
		while (current1 != null && current2 != null) {
			if (current1.data == current2.data) {
				return current1.data;
			}
			current1 = current1.next;
			current2 = current2.next;
		}

		return -1;
	}

	static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
		int l1 = count(head1);
		int l2 = count(head2);
		int deff;
		if (l1 > l2) {
			deff = l1 - l2;
			return _getIntesectionNode(deff, head1, head2);
		} else {
			deff = l2 - l1;
			return _getIntesectionNode(deff, head2, head1);
		}

	}

}

class SinglyLinkedListNode {
	public int data;
	public SinglyLinkedListNode next;

	public SinglyLinkedListNode(int nodeData) {
		this.data = nodeData;
		this.next = null;
	}
}
