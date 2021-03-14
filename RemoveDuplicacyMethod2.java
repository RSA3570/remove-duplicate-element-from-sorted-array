public class RemoveDuplicacyMethod2 {
    public static void main(String[] args) {
      
      int arr[] = {1,2,2,3,4,5,5};
      //int[] temp = new int[arr.length];
      int j = 0;
     
      //using single array
      for(int i = 0; i<arr.length-1; i++){
        if(arr[i] != arr[i+1]){
          //temp[j] = arr[i];
          arr[j] = arr[i];
          j++;
        }
      }
      
       //temp[j] = arr[arr.length-1];
       arr[j] = arr[arr.length-1];
       
    //    for(int k = 0; k<arr.length; k++){
    //      if(arr[k] != 0){
    //        System.out.print(arr[k]+", ");
    //      }
    //    }

       for(int k = 0; k<j+1; k++){
        if(arr[k] != 0){
          System.out.print(arr[k]+", ");
        }
      }
    }
}