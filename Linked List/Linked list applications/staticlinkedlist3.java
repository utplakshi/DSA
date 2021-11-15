// A Linked List Node
class Node
{
    int data;
    Node next;
 
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}
 
public class staticlinkedlist3
{
    public static final int N = 5;
    private static Node[] node = new Node[N];
 
    // Helper function to print a given linked list
    public static void printList(Node head)
    {
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
 
        System.out.println("null");
    }
 
    public static Node createStaticList(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            node[i] = new Node(arr[i], null);
 
            if (i > 0) {
                node[i - 1].next = node[i];
            }
        }
 
        return node[0];
    }
 
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 5 };
 
        Node head = createStaticList(arr);
        printList(head);
    }
}
