public class SinglyLinkedList{
  // Properties
  private Node head = null;
  private int size = 0;

  // Constructor: Using default constructor
  
  // Getter/Setter Methods
  
  public Node getHead() {
    return this.head;
  }
  
  public void setHead(Node newNode) {
    this.head = newNode;
    // TEST: will this work in all circumstances?
    this.size = 1;
  }

  public int getSize() {
    return this.size;
  }
  
  /* Traverses & prints list */
  public void print() {
    if (this.isEmpty()) {
      System.out.println("List is empty.");
    }
    else {
      Node tmp = this.head;
      while (tmp != null) {
        tmp.print();
        tmp = tmp.getNext();
      }
      System.out.println("");
    }
  }
  
  public boolean isEmpty() {
    return this.head==null;
  }
  
  public void add(int index, int data) {
    // simple version: assume index is 0
    // write pseudocode to add data to
    // the front of the list
    Node newNode = new Node(data);
    Node current = this.head;
    if (this.isEmpty()) {
      this.head = newNode;
    }
    else {
      newNode.setNext(head);
      this.head = newNode;
    }
    // add to end of list
    while (current.getNext() != null) {
      current = current.getNext();
    }
    current.setNext(newNode);
    }
    // Write pseudocode to do entire add method
    // use addToBeginning, addToEnd to stand in
    // for the stuff we already have done
    this.size++;

  }
  
/*
+ add(int, int) : void
+ find(int): Node
+ delete(int): void
+ add(int, Node) : void
*/
}