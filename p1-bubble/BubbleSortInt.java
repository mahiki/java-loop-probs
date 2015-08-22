public class BubbleSortInt {
   
   private BubbleSortInt() {}
   
   public static void sortArray(int[] array){
      
      int N = array.length;
      int tmp;
      for(int j = 0; j < N; j++){

         for(int i = 0; i < N-1; i++){
            
            if(array[i] > array[i+1]){
               tmp        = array[i];
               array[i]   = array[i+1];
               array[i+1] = tmp;
            }
         }
      }
   }
}