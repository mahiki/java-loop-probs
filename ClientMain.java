public class ClientMain{

  public static void main(String args[]){
    
    LinkedListOfIntegers list = new LinkedListOfIntegers();
    
    System.out.println("Size of list is: " + list.size());

    for(int i = 1; i < 100051; i++){
      list.push(i);
    }
    
    System.out.println("Size of list is: " + list.size());

    while(!list.isEmpty()) System.out.println(list.pop());
    
    System.out.println("Size of list is: " + list.size());

    for(int i = 1; i < 100051; i++){
      list.push(i);
    }
    System.out.println("Size of list is: " + list.size());

    System.out.println("Reversing list now");

    list.reverseList();

    System.out.println("Size of list is: " + list.size());
    
    int listSize = list.size();
    for(int i = 0; i < listSize - 1; i++){
      System.out.println(list.pop());
    }
    
    System.out.println("Size of list is: " + list.size());
    while(!list.isEmpty()) System.out.println(list.pop());
    System.out.println("Size of list is: " + list.size());
  
    System.out.println("Good Job!\n");
    
  }
  
}