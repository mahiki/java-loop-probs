public class TestBubble{

   public static void main(String[] args){

      int N = 24;
      int[] testArray = new int[N];
      int[] sortArray = new int[N];
      
      for(int i = 0; i < N; i++){
         testArray[i] = (int) (Math.random()*50);
         sortArray[i] = testArray[i];
      }
 
      BubbleSortInt.sortArray(sortArray);
      
      System.out.println("BubbleSort: Initializing random array");
      
      System.out.println("testArray:");
      for(int i = 0; i < N; i++){
         System.out.print(testArray[i]+"\t");
      }
      
      System.out.println("\nsortArray:");
      for(int i = 0; i < N; i++){
         System.out.print(sortArray[i]+"\t");
      }
      
      System.out.println("\nBubbleSort dunzo.\n");
 
   }
   
}
      
      