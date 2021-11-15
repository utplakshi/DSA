
# Naive's Method

The idea is to iterate over the original list in the usual way and maintain two pointers to keep track of the new list: one head pointer and one tail pointer, which always points to the last node of the new list. The first node is done as a special case, and then the tail pointer is used in the standard way for the others.

```java
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
 
    Node() {}
}
 
class Main
{
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
 
    // Function takes a linked list and returns its complete copy
    public static Node copyList(Node head)
    {
        Node current = head;    // used to iterate over the original list
        Node newList = null;    // head of the new list
        Node tail = null;       // point to the last node in a new list
 
        while (current != null)
        {
            // special case for the first new node
            if (newList == null)
            {
                newList = new Node(current.data, null);
                tail = newList;
            }
            else {
                tail.next = new Node();
                tail = tail.next;
                tail.data = current.data;
                tail.next = null;
            }
            current = current.next;
        }
 
        return newList;
    }
 
    public static void main(String[] args)
    {
        // input keys
        int[] keys = {1, 2, 3, 4};
 
        // points to the head node of the linked list
        Node head = null;
 
        // construct a linked list
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
 
        // copy linked list
        Node copy = copyList(head);
 
        // print duplicate linked list
        printList(copy);
    }
}
```
### output
```
1 —> 2 —> 3 —> 4 —> NULL
```
# Using push() function
The above implementation is a little unsatisfying because the 3–step link-in is repeated – once for the first node and once for all the other nodes. The following Java implementation uses push() to allocate and insert the new nodes and avoid repeating that code.

```java
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
 
class Main
{
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
 
    // Function takes a linked list and returns a complete copy of that
    // list using a dummy node using the `push()` function
    public static Node copyList(Node head)
    {
        Node current = head;    // used to iterate over the original list
        Node newList = null;    // head of the new list
        Node tail = null;       // point to the last node in a new list
 
        while (current != null)
        {
            // special case for the first new node
            if (newList == null)
            {
                newList = new Node(current.data, newList);
                tail = newList;
            }
            else {
                // add each node at the tail
                tail.next = new Node(current.data, tail.next);
 
                // advance the tail to the new last node
                tail = tail.next;
            }
            current = current.next;
        }
 
        return newList;
    }
 
    public static void main(String[] args)
    {
        // input keys
        int[] keys = {1, 2, 3, 4};
 
        // points to the head node of the linked list
        Node head = null;
 
        // construct a linked list
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
 
        // copy linked list
        Node dup = copyList(head);
 
        // print duplicate linked list
        printList(dup);
    }
}
```
### output
```
1 —> 2 —> 3 —> 4 —> NULL
```
# Using dummy node
Another strategy is to use a temporary dummy node to take care of the first node case. The dummy node is temporarily the first node in the list, and the tail pointer starts off pointing to it. All nodes are added off the tail pointer.

```java
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
 
    Node() {}
}
 
class Main
{
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
 
    // Function takes a linked list and returns a complete copy of that
    // list using a dummy node
    public static Node copyList(Node head)
    {
        Node current = head;        // used to iterate over the original list
        Node tail;                  // point to the last node in the new list
        Node dummy = new Node();    // build the new list of this dummy node
 
        tail = dummy;               // start the tail pointing at the dummy
 
        while (current != null)
        {
            // add each node at the tail
            tail.next = new Node(current.data, tail.next);
 
            // advance the tail to the new last node
            tail = tail.next;
            current = current.next;
        }
        return dummy.next;
    }
 
    public static void main(String[] args)
    {
        // input keys
        int[] keys = {1, 2, 3, 4};
 
        // points to the head node of the linked list
        Node head = null;
 
        // construct a linked list
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
 
        // copy linked list
        Node dup = copyList(head);
 
        // print duplicate linked list
        printList(dup);
    }
}
```

### output
```
1 —> 2 —> 3 —> 4 —> NULL
```
# Recursive Solution

Finally, for completeness, following is the recursive version of copyList() in C, Java, and Python. It has the pleasing shortness that recursive code often has. However, it is probably not good for production code since it uses stack space proportional to its list length.

```java
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
 
    Node(int data) {
        this(data, null);
    }
}
 
class Main
{
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
 
    // Recursive function that takes a linked list and returns a complete
    // copy of that list
    public static Node copyList(Node head)
    {
        if (head == null) {
            return null;
        }
 
        // allocate a new node in a heap and set its data
        Node newNode = new Node(head.data);
 
        // recursively set the next field of the new node by recurring
        // for the rest nodes
        newNode.next = copyList(head.next);
 
        return newNode;
    }
 
    public static void main(String[] args)
    {
        // input keys
        int[] keys = {1, 2, 3, 4};
 
        // points to the head node of the linked list
        Node head = null;
 
        // construct a linked list
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
 
        // copy linked list
        Node dup = copyList(head);
 
        // print duplicate linked list
        printList(dup);
    }
}
```
### output
```
1 —> 2 —> 3 —> 4 —> NULL
```