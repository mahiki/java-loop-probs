public class LinkedListOfIntegers {
  
  private Node firstNode = null;
  
  private class Node {
    int item;
    Node next;
  }
  
  public boolean isEmpty(){
    return firstNode == null;
  }
  
  public void push(int item){
  
    Node oldFirstNode = firstNode;
    firstNode = new Node();
    firstNode.item = item;
    firstNode.next = oldFirstNode;
  }
  
  public int pop(){
    
    int item = firstNode.item;
    firstNode = firstNode.next;
    return item;
  }

  public int size(){
  
    int nodeCount = 0;
    Node nodeCheck = firstNode;
    while(nodeCheck != null){
      nodeCount++;
      nodeCheck = nodeCheck.next;
    }
    return nodeCount;
    
  }
  
  public void reverseList(){
    
    // need to reverse direction of references
    // Node1.next = Nodetmp
    // Node lastnode = firstNode
   
    //while()
  }
  
}