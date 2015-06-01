public class ClientMain{

  public static void main(String args[]){
    
    int N = 51;
    LinkedListOfIntegers list = new LinkedListOfIntegers();
    
    System.out.println("Size of list is: " + list.size());

    for(int i = 1; i < N; i++){
      list.push(i);
    }
    
    System.out.println("Size of list is: " + list.size());
    //System.out.println("Size (Recursive method) of list is: " + list.sizeRecursive());

    while(!list.isEmpty()) System.out.println(list.pop());
    
    System.out.println("Size of list is: " + list.size());
    //System.out.println("Size (Recursive method) of list is: " + list.sizeRecursive());

    for(int i = 1; i < N; i++){
      list.push(i);
    }
    System.out.println("Size of list is: " + list.size());
    //System.out.println("Size (Recursive method) of list is: " + list.sizeRecursive());

    System.out.println("Reversing list now");

    list.reverseList();

    System.out.println("Size of list is: " + list.size());
    //System.out.println("Size (Recursive method) of list is: " + list.sizeRecursive());
    
    int listSize = list.size();
    for(int i = 0; i < listSize - 1; i++){
      System.out.println(list.pop());
    }
    
    System.out.println("Size of list is: " + list.size());
    //System.out.println("Size (Recursive method) of list is: " + list.sizeRecursive());
    while(!list.isEmpty()) System.out.println(list.pop());
    System.out.println("Size of list is: " + list.size());
    //System.out.println("Size (Recursive method) of list is: " + list.sizeRecursive());
  
    System.out.println("Good Job!\n");
    
  }
  
}