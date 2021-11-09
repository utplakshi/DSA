class Node{
	int data;
	Node next;
	Node(int data, Node next_node){
		this.data=data;
		this.next=next_node;
	}
}
public class NaivesMethod1 {
    // Helper function to print a given linked list
    public static void printList(Node head) {
    	Node ptr= head;
    	while(ptr!=null) {
    		System.out.print(ptr.data+"-->");
    		ptr=ptr.next;
    	}
    	System.out.println("null");
    }
    // Naive function for linked list implementation containing three nodes
    public static Node constructList() {
    	Node head=new Node(1, new Node(2, new Node(3,null)));
    	return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// `head` points to the head node of the linked list
        Node head=constructList();

        // print linked list
        printList(head);
	}
}
