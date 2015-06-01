public class TestIntLL{

  public static void main(String args[]){
    
    int N = 16;
    StackLinkedList<Integer> intList = new StackLinkedList<>();
    
    System.out.println("Size of list is: " + intList.size());

    for(int i = 1; i < N; i++){
      intList.push(i);
    }
    
    System.out.println("Size of list is: " + intList.size());

    while(!intList.isEmpty()) System.out.println(intList.pop());
    
    System.out.println("Size of list is: " + intList.size());

    System.out.println("reloading list now");
    for(int i = 1; i < N; i++){
      intList.push(i);
    }
    
    System.out.println("Size of list is: " + intList.size());

    System.out.println("Reversing list now");
    intList.reverseList();

    System.out.println("Size of list is: " + intList.size());

    N = intList.size();
    for(int i = 0; i < N - 1; i++){
      System.out.println(intList.pop());
    }

    System.out.println("Size of list is: " + intList.size());
  
    System.out.println("Good Job!\n");
    
  }
  
}