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
    /*ll.print();
    ll.setHead(new Node(5));
    ll.print();*/
    
    // test adding to font of list
    ll.add(0,1);
    ll.add(0,2);
    ll.add(0,3);
    ll.add(0,4);
    ll.add(0,5);
    ll.add(5, 20);
    ll.add(6, 21);
    //ll.add(100, 5);
    
    ll.add(5, 10);
    ll.add(3, 1000);
    
    
    ll.print();
    System.out.println("size: " + ll.getSize());
    
  }
}