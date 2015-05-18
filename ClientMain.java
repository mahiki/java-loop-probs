public class ClientMain{

  public static void main(String args[]){
    
    LinkedListOfIntegers list = new LinkedListOfIntegers();
    
    int[] array = {1,2,3,4,5};
    
    for(int i = 0; i < 5; i++){
      list.push(array[i]);
    }

    while(!list.isEmpty()) System.out.println(list.pop());

  }
  
}