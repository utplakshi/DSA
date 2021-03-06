
# Linked List
## Defination of Linked List
Linked lists are among the simplest and most common data structures. The principal benefits of a linked list over a conventional array are:

* The list elements can easily be inserted or removed without reallocation or reorganization of the entire structure because the data items need not be stored contiguously in memory. Simultaneously, an array has to be declared in the source code before compiling and running the program.
* 
* Linked lists allow the insertion and removal of nodes at any point in the list. They can do so with a constant number of operations if the link to the previous node is maintained during the list traversal.

## Types of Linked List

* Singly Linked List 
* Doubly Linked List
* Circular Linked List

### How is Linked List different than array
* Arrays are suitable for:
   * Inserting/deleting an element at the end.
   * Randomly accessing any element.
   * Searching the list for a particular value.
* Linked lists are suitable for:
   * Inserting/deleting are easier  
   * Applications where sequential access is required.
   * In situations where the number of elements cannot be predicted beforehand, so no memory wastage

## Usage/Examples in java

#### Creation of Node

```java
// A Linked List Node
class Node
{
    int data;
    Node next;
 
    // constructor
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}
```
#### Helper Function

```java
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
```

## Acknowledgements

 - [Techiedelight](https://www.techiedelight.com/linked-list-implementation-java/)
 - [Geeksforgeeks](https://www.geeksforgeeks.org/data-structures/linked-list/)


