class N{
	int data;
	N next;
}
public class ReturnHeadNode {
	//helper function to print a given linked list
    public static void printList(N head) {
    	N ptr=head;
    	while(ptr!=null) {
    		System.out.print(ptr.data+"-->");
    		ptr=ptr.next;
    	}
    	System.out.println("null");
    }
    public static N push(N head, int data) {
    	//allocate a new node in a heap and set it's data
    	N newNode=new N();
    	newNode.data=data;
    	// set the next field of the new node to point to the current
        // first node of the list.
    	newNode.next=head;
    	
    	return newNode;
    }
   // Function for linked list implementation from the given set of keys
    public static N constructList(int[] keys) {
    	N head=null;
    	
    	// start from the end of the array
    	for(int i=keys.length-1;i>=0;i--) {
    		head=push(head,keys[i]);
    	}
    	return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //input keys
		int[] keys= {1,2,3,4};
		N head=constructList(keys);
		printList(head);
	}

}
