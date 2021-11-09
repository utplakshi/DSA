
# Naive's Method

A simple solution would be to allocate memory for all individual nodes of the linked list, set their data, and rearrange their references to build the complete list.

![Logo](https://github.com/utplakshi/DSA/blob/main/Linked%20List/Creation%20of%20Linked%20List/Photos/NaivesMethod.png?raw=true)

## Java Code

```java
// A Linked List Node
class Node
{
    int data;
    Node next;
 
    Node(int data)
    {
        this.data = data;
        this.next = null;
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
 
    // Naive function for linked list implementation containing three nodes
    public static Node constructList()
    {
        // construct linked list nodes
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
 
        // rearrange the references to construct a list
        Node head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
 
        // return reference to the first node in the list
        return head;
    }
 
    public static void main(String[] args)
    {
        // `head` points to the head node of the linked list
        Node head = constructList();
 
        // print linked list
        printList(head);
    }
}
```
We can write the above code in a single line by passing the next node as an argument to the Node constructor:

```java

// A Linked List Node
class Node
{
    int data;
    Node next;
 
    Node(int data, Node next_node)
    {
        // Set data
        this.data = data;
 
        // set the next field to point to a given node of the list
        this.next = next_node;
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
 
    // Naive function for linked list implementation containing three nodes
    public static Node constructList()
    {
        Node head = new Node(1, new Node(2, new Node(3, null)));
        return head;
    }
 
    public static void main(String[] args)
    {
        // `head` points to the head node of the linked list
        Node head = constructList();
 
        // print linked list
        printList(head);
    }
}
```
# Return Head Node Method
The standard solution adds a single node to the head end of any list. This function is called push() since we are adding the link to the head end, making a list look a bit like a stack.
![Logo](https://github.com/utplakshi/DSA/blob/main/Linked%20List/Creation%20of%20Linked%20List/Photos/ReturnHead.png?raw=true)
This is demonstrated below, where we return the head node from the push() function and update the head in the caller.
```java
// A Linked List Node
class Node
{
    int data;
    Node next;
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
 
    public static Node push(Node head, int data)
    {
        // allocate a new node in a heap and set its data
        Node newNode = new Node();
        newNode.data = data;
 
        // set the next field of the new node to point to the current
        // first node of the list.
 
        newNode.next = head;
 
        // change the head to point to the new node, so it is
        // now the first node in the list.
 
        return newNode;
    }
 
    // Function for linked list implementation from the given set of keys
    public static Node constructList(int[] keys)
    {
        Node head = null;
 
        // start from the end of the array
        for (int i = keys.length - 1; i >= 0; i--) {
            head = push(head, keys[i]);
        }
 
        return head;
    }
 
    public static void main(String[] args)
    {
        // input keys
        int[] keys = { 1, 2, 3, 4 };
 
        // points to the head node of the linked list
        Node head = constructList(keys);
 
        // print linked list
        printList(head);
    }
}
```
# Make head reference global
We can construct a linked list by making the head reference global, but this approach is not recommended since global variables are usually considered bad practice.

```java
// A Linked List Node
class Node
{
    int data;
    Node next;
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
 
    // global head
    public static Node head;
 
    // Takes a list and a data value, creates a new link with the given
    // data and pushes it onto the list's front.
    public static Node push(int data)
    {
        // allocate a new node in a heap and set its data
        Node newNode = new Node();
        newNode.data = data;
 
        // set the next field of the new node to point to the current
        // head node of the list.
        newNode.next = head;
 
        // change the head to point to the new node, so it is
        // now the first node in the list.
 
        return newNode;
    }
 
    // Function for linked list implementation from the given set of keys
    public static void constructList(int[] keys)
    {
        // start from the end of the array
        for (int i = keys.length - 1; i >= 0; i--) {
            head = push(keys[i]);
        }
    }
 
    public static void main(String[] args)
    {
        // input keys
        int[] keys = { 1, 2, 3, 4 };
 
        // points to the head node of the linked list
        constructList(keys);
 
        // print linked list
        printList(head);
    }
}
```