public class TestStrLL{

  public static void main(String args[]){
    
    int N = 200;
    System.out.println("Now for a list of strings\n");

    StackLinkedList<String> strList = new StackLinkedList<>();
    
    System.out.println("new string list instantiated");
    System.out.println("Size of list is: " + strList.size());
    
    for(int i = 0; i < N; i++){
      strList.push("ABC00" + i);
    }

    System.out.println("Size of list is: " + strList.size());
    
    while(!strList.isEmpty()) System.out.println(strList.pop());
    
    System.out.println("Size of list is: " + strList.size());

    System.out.println("reloading list now");
    System.out.println("Size of list is: " + strList.size());

    for(int i = 0; i < N; i++){
      strList.push("ABC00" + i);
    }

    System.out.println("Reversing list now");
    strList.reverseList();

    System.out.println("Size of list is: " + strList.size());

    int M = strList.size();
    for(int i = 0; i < M - 1; i++){
      System.out.println(strList.pop());
    }

    System.out.println("Size of list is: " + strList.size());
    while(!strList.isEmpty()) System.out.println(strList.pop());
    System.out.println("Size of list is: " + strList.size());
  
    System.out.println("Good Job!\n");
    
  }
  
}