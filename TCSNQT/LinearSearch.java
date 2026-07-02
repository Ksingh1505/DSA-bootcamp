import java.util.*;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target){
        //edge case
        if(arr == null || arr.length == 0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
        
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,4,6,3,7,9,2};
        int target = 7;
        int index = linearSearch(arr, target);
        if(index != -1){
            System.out.println("element found at index: " + index);
        }else{
            System.out.println("element not found");    
        }
    }
}
