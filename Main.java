public class Main{
  public static void main(String [ ] args) {
    // test default constructor
    /*Node myNode = new Node();
    System.out.println(myNode.getData());
    System.out.println(myNode.getNext());*/
    /*Node myOtherNode = new Node(5);
    System.out.println(myOtherNode.getData());
    System.out.println(myOtherNode.getNext());
    // test print
    myOtherNode.print();*/
    
    SinglyLinkedList ll = new SinglyLinkedList();
    /*System.out.println(ll);
    System.out.println(ll.getHead());
    System.out.println(ll.getSize());
    ll.setHead(new Node(2));
    System.out.println(ll.getHead());
    //ll.getHead().print();
    //System.out.println(ll.getSize());
    ll.print();*/
    
    // test isEmpty works
    ll.print();
    ll.setHead(new Node(5));
    ll.print();
    
    
  }
}