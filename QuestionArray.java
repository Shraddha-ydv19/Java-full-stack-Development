import java.util.Arrays;
public class QuestionArray {
    public static void main(String[] args){
        //find minimum and maximum element in array..
        int arr[]={12,5,2,6,78,56,34};
       
        int maxi=arr[0];
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]);
           
        }
        System.out.println("Maximum = " +maxi);
        int mini =arr[0];
        for(int i=0;i<arr.length;i++){
            mini=Math.min(mini,arr[i]);
        }
        System.out.println("Minimum = " +mini);


        
         // II method....
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    int p=arr.length;
    System.out.println(arr[p-1]); //max
    System.out.println(arr[0]);//min
    }

   
    
}
