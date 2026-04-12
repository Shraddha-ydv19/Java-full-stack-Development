import java.util.Arrays;
import java.util.Scanner;
//import java.util.Collection;
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


    //find sum of all the elemant...\
    int sum=0;
    for(int i=0;i<p;i++){
        sum+=arr[i];


    }
    System.out.println(sum);


    //count even and odd...
    int countEven=0;
    int countOdd=0;
    for(int i=0;i<p;i++){
        if(arr[i]%2==0){
            countEven++;
        }
        else{
            countOdd++;
        }
    }
    System.out.println("Even number " +countEven);
    System.out.println("Odd number " + countOdd);


    //Reverse the array...
    // int s=0;
    // int r=p-1;
    // while(s<r){
    //     int temp=arr[s];
    //     arr[s]=arr[r];
    //     arr[r]=temp;
    //     s++;
    //     r--;
    // }
    // System.out.println(Arrays.toString(arr));


    //second largest and second smallest element in array...
    int secMaxi = arr[0];
    int maxii=arr[0];
    for(int i=0;i<p;i++){
        if(arr[i]>maxii){
            secMaxi=maxii;
            maxii=arr[i];
        }
        else if(arr[i]>secMaxi){
            secMaxi=arr[i];
        }
    }

    System.out.println("Second Largest = " + secMaxi);
    int secMini=arr[0];
    int minii=arr[0];
    for(int i=0;i<p;i++){
        if(arr[i]<minii){
            secMini=minii;
            minii=arr[i];


        }
        else{
            if(arr[i]<secMini){
                secMini=arr[i];
            }
        }

    }
    System.out.println("second smallest = " + secMini);

    //check array is sorted or not....

    for(int i=1;i<p;i++){
        if(arr[i]<=arr[i-1]){
            System.out.println("array is not sorted");
            break;
        }
    }
    System.out.println("array is sorted");


    //find index of given array element...
    Scanner s =new Scanner(System.in);
    System.out.println("enter the element ");
    int element =s.nextInt();
    int index=-1;
    for(int i=0;i<p;i++){
        if(arr[i]==element){
            System.out.println("element is found " + i);
            index=i;
            break;
        }
    }
    if(index==-1){
        System.out.println("element is not found");
    }


    // Majority element in array... element which is present more than n/2 times in array...
    int count=1;
    for(int i=1;i<p;i++){
        if(arr[i]==arr[i-1]){
            count++;

        }
        else{
            if(count>p/2){
                System.out.println("majority element is  " + arr[i-1]);
                break;
            }
        }
    }
    System.out.println("majority element is not found");



}
}