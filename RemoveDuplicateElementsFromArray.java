public class RemoveDuplicateElementsFromArray {

    public static void main(String[] args) {
      
        int arr[] = {1,2,2,3,4,5,5,6,6,10,10};
        int[] temp = new int[arr.length];
        int j = 0;
        
        for(int i = 0; i<arr.length-1; i++){
          if(arr[i] != arr[i+1]){
            temp[j] = arr[i];
            j++;
          }
        }
        
         temp[j] = arr[arr.length-1];
         
         for(int k = 0; k<temp.length; k++){
           if(temp[k] != 0){
             System.out.print(temp[k]+", ");
           }
         }
      }
    
}
