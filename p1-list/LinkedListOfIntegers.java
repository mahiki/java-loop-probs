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
  
  public int sizeRecursive(){
    return this.sizeR(firstNode);
  }
  
  private int sizeR(Node node){
    if (node == null) return 0;
    else return 1 + this.sizeR(node.next);
  }

  public void reverseList(){
    
    Node oldFirstNode = firstNode;
    firstNode = firstNode.next;
    Node nextNode = firstNode.next;

    oldFirstNode.next = null;
    firstNode.next = oldFirstNode;
      // now the first two Node pointers are reversed

    while(nextNode != null){
      oldFirstNode = firstNode;
      firstNode = nextNode;
      nextNode = nextNode.next;
      firstNode.next = oldFirstNode;
    }
      // when nextNode is null the firstNode will be in right spot
  }
}