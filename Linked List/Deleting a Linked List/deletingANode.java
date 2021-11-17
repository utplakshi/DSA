public class LinkedList
{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void push(int new_data){
        Node new_node= new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    void deleteNode(int position){
        if(head==null){
            return;
        }
        Node temp=head;
        if(position==0){
            return;
        }
        for(int i=0; temp!=null && i<position-1;i++){
            temp=temp.next;
        }
        if(temp==null || temp.next==null){
            return;
        }
        Node next=temp.next.next;
        temp.next=next;
    }
    public void printList(){
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
    }
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.push(7);
		l.push(1);
		l.push(2);
		l.push(4);
		l.push(5);
		
		System.out.println("Created Linked List Before Removing: ");
		l.printList();
		
		l.deleteNode(4); //delete node at 3rd position
		
		System.out.println("\n Linked List after Deletion at position 4: ");
        l.printList();
	}
}