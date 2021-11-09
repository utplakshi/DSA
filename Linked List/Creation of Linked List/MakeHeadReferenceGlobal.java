class Nod{
	int data;
	Nod next;
}
public class MakeHeadReferenceGlobal {
	// Helper function to print a given linked list
    public static void printList(Nod head) {
    	Nod ptr=head;
    	while(ptr!=null) {
    		System.out.print(ptr.data+"-->");
    		ptr=ptr.next;
    	}
    	System.out.println("null");
    }
    //global head
    public static Nod head;
    // Takes a list and a data value, creates a new link with the given
    // data and pushes it onto the list's front.
    public static Nod push(int data) {
    // allocate a new Nod in a heap and set its data
       Nod newNod=new Nod();
       newNod.data=data;
       // set the next field of the new Nod to point to the current
       // head Nod of the list.
       newNod.next=head;

       // change the head to point to the new Nod, so it is
       // now the first Nod in the list.
       return newNod;
    	
    }

    // Function for linked list implementation from the given set of keys
    public static void constructList(int[] keys)
    {
        // start from the end of the array
        for (int i = keys.length - 1; i >= 0; i--) {
            head = push(keys[i]);
        }
    }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] keys= {1,2,3,4,5,6};
       
       //points to the head Nod of the linked list
       constructList(keys);
       
       //Print linked list
       printList(head);
	}

}
