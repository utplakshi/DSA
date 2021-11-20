
# Insert a node to its correct sorted position in a sorted linked list 

Given a sorted list in increasing order and a single node, insert the node into the list&#8217;s correct sorted position. The function should take an existing node and rearranges pointers to insert it into the list.

![Logo](https://github.com/utplakshi/DSA/blob/main/Linked%20List/Insert%20and%20Sort%20Linked%20list/Photos/InsertionLinkedList.png?raw=true)

There are many possible solutions to this problem. The basic strategy is to iterate down the list looking for the place to insert the new node. That could be the end of the list or a point just before a larger node than the new node. The three solutions presented handle the &#8220;head end&#8221; case in different ways.
## Naive's Method

The naive implementation can be seen below in JAVA:

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
        this.data = data;
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
 
    // Function to insert a given node at its correct sorted position into
    // a given list sorted in increasing order
    public static Node sortedInsert(Node head, Node newNode)
    {
        // special case for the head end
        if (head == null || head.data >= newNode.data)
        {
            newNode.next = head;
            head = newNode;
            return head;
        }
 
        // locate the node before the point of insertion
        Node current = head;
        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }
 
        newNode.next = current.next;
        current.next = newNode;
 
        return head;
    }
 
    public static void main(String[] args)
    {
        // input keys
        int[] keys = {2, 4, 6, 8};
 
        // points to the head node of the linked list
        Node head = null;
 
        // construct a linked list
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
 
        head = sortedInsert(head, new Node(5));
        head = sortedInsert(head, new Node(9));
        head = sortedInsert(head, new Node(1));
 
        // print linked list
        printList(head);
    }
}

```
#### Output
```
1 —> 2 —> 4 —> 5 —> 6 —> 8 —> 9 —> NULL
```

## Using Dummy Node

Another strategy is to use a temporary dummy node to take care of the first node case – the dummy node nothing but temporarily the first node in the list. Following is the Java program that demonstrates it:
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
        this.data = data;
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
 
    // Function to insert a given node at its correct sorted position into a given
    // list sorted in increasing order
    public static Node sortedInsert(Node head, Node newNode)
    {
        Node dummy = new Node();
        Node current = dummy;
        dummy.next = head;
 
        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }
 
        newNode.next = current.next;
        current.next = newNode;
        return dummy.next;
    }
 
    public static void main(String[] args)
    {
        // input keys
        int[] keys = {2, 4, 6, 8};
 
        // points to the head node of the linked list
        Node head = null;
 
        // construct a linked list
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
 
        head = sortedInsert(head, new Node(5));
        head = sortedInsert(head, new Node(9));
        head = sortedInsert(head, new Node(1));
 
        // print linked list
        printList(head);
    }
}



```
#### Output
```
1 —> 2 —> 4 —> 5 —> 6 —> 8 —> 9 —> NULL
```