class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}
class Main{
    //helper fucntion 
    public static void PrintList(String msg, Node head){
        
        System.out.print(msg);
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+"-->");
            ptr=ptr.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args){
        //input keys
        int[] keys={1,2,3,4,5,6};
        //construct the first linked list
        Node a = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            a = new Node(keys[i], a);
        }
        // construct a second linked list
        Node b = null;
        for (int i = 0; i < keys.length; i++) {
            b = new Node(2 * keys[i], b);
        }
        if(b!=null){
            Node newNode= b;
            b=b.next;
            
           newNode.next=a;
           a=newNode;
        }
           // print both lists
        PrintList("First List: ", a);
        PrintList("Second List: ", b);
    }
}
