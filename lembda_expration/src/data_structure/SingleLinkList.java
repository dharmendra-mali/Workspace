package data_structure;

public class SingleLinkList {
	
	int data;
	SingleLinkList next;
	public SingleLinkList(int data) {
				
		this.data=data;
		this.next=null;
	}
	
	public static void printList(SingleLinkList head){
		while(head!=null){
			System.out.println(head.data);
			head=head.next;
			
		}
		
	}

}
