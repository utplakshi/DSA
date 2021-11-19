/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Node{
    int data;
    Node next;
    Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
}
public class Pop
{
    // Helper function to print a given linked list
    public static void printList(Node head){
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+"-->");
            ptr=ptr.next;
        }
        System.out.println("Null");
    }
    // The opposite of `push()`. Takes a non-empty list, removes the front
    // node, and prints the data in that node.
    public static Node pop(Node headref){
        // underflow condition
        if(headref==null){
            return null;
        }
       int result = headref.data;  // pull out data before the node is deleted
        headref = headref.next;     // unlink the head node for the caller
        System.out.println("The node popped out is: "+ result);
        return headref;
    }
    
	public static void main(String[] args) {
		  // input keys
        int[] keys = {1, 2, 3, 4};
 
        // points to the head node of the linked list
        Node head = null;
 
        // construct a linked list
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
 
        head = pop(head);
 
        // print remaining linked list
        printList(head);
	}
}
