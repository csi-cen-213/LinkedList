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
/*
+ isEmpty():Boolean
+ find(int): Node
+ add(int, Node) : void
+ add(int, int) : void
+ print() : void*/
}