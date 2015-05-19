public class ClientMain{

  public static void main(String args[]){
    
    LinkedListOfIntegers list = new LinkedListOfIntegers();
    
    int[] array = {1,2,3,4,5};
    int numbero = 1;
    
    System.out.println("Size of list is: " + list.size());

    for(int i = 0; i < 5; i++){
      list.push(array[i]);
    }
    
    System.out.println("Size of list is: " + list.size());

    int[] arrayB = {99,1092,8888888,718278109};

    for(int i = 0; i < 4; i++){
      list.push(arrayB[i]);
    }

    System.out.println("Size of list is: " + list.size());

    while(!list.isEmpty()) System.out.println(list.pop());

    System.out.println("Size of list is: " + list.size());

    for(int i = 0; i < 100; i++){
      numbero = (int)Math.sqrt(i*5300)*2111;
      list.push(numbero);
    }

    System.out.println("Size of list is: " + list.size());

    while(!list.isEmpty()) System.out.println(list.pop());

    System.out.println("Size of list is: " + list.size());
  
  }
  
}