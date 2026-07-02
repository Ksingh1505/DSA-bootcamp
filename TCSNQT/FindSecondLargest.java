//BRUTE FORCE :- O(NLOGN), S.C : O(1)

// import java.util.*;
// class Solution{
//     public static int getElements(int[] arr, int n){
//         //edge cases
//         if(arr == null || n<2){
//             return -1;
//         }
//         Arrays.sort(arr);
//         int small = arr[0];
//         int large = arr[n-1];
//          // Second Smallest
//         int secondSmall = -1;
//         for (int i = 1; i < n; i++) {
//             if (arr[i] != small) {
//                 secondSmall = arr[i];
//                 break;
//             }
//         }

//         // Second Largest
//         int secondLarge = -1;
//         for (int i = n - 2; i >= 0; i--) {
//             if (arr[i] != large) {
//                 secondLarge = arr[i];
//                 break;
//             }
//         }
//         System.out.println("Second Largest: " + secondLarge);
//         System.out.println("Second Smallest: " + secondSmall);
//         return secondLarge;
//     }
// }

//OPTIMIZED :- O(N), S.C : O(1)
import java.util.*;
class Solution{
    public static int getElements(int[] arr, int n){
        //edge cases
        if(arr == null || n<2){
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]<small){
                secondSmall = small;
                small = arr[i];
            }else if(arr[i]<secondSmall && arr[i]!=small){
                secondSmall = arr[i];
            }

            if(arr[i]>large){
                secondLarge = large;
                large = arr[i];
            }else if(arr[i]>secondLarge && arr[i]!=large){
                secondLarge = arr[i];
            }
        }
        System.out.println("Second Largest: " + secondLarge);
        System.out.println("Second Smallest: " + secondSmall);
        return secondLarge;
    }
}
public class FindSecondLargest{
    public static void main(String[] args) {
        int[] arr ={5,5,7,7};
        int n = arr.length;
        Solution.getElements(arr,n);
    }
}