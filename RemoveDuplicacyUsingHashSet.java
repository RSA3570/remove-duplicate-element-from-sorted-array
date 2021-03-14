import java.util.HashSet;

public class RemoveDuplicacyUsingHashSet {
    public static void main(String[] args) {
      
        int arr[] = {1,2,2,3,4,5,5};
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i<arr.length-1; i++){
          hs.add(arr[i]);
        }
        
         
         for(int num: hs){
           System.out.print(hs+", ");
         }
      }
}
