/**
 * Generic version of our Stack Linked List
 * @param <T> the type of object in the list
 */

public class StackLinkedList<T> {
  
  private Node firstNode = null;
  
  private class Node {
    T item;
    Node next;
  }
  
  public boolean isEmpty(){
    return firstNode == null;
  }
  
  public void push(T item){
  
    Node oldFirstNode = firstNode;
    firstNode = new Node();
    firstNode.item = item;
    firstNode.next = oldFirstNode;
  }
  
  public T pop(){
    
    T item = firstNode.item;
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
    
    Node oldFirstNode = firstNode;
    firstNode = firstNode.next;
    Node nextNode = firstNode.next;

    oldFirstNode.next = null;
    firstNode.next = oldFirstNode;

    while(nextNode != null){
      oldFirstNode = firstNode;
      firstNode = nextNode;
      nextNode = nextNode.next;
      firstNode.next = oldFirstNode;
    }
  }
}