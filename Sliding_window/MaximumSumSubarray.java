import java.util.*;
public class MaximumSumSubarray {
    public static long maximumSubarraySum(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        long sum =0;
        long ans=0;
        int left =0;

        for(int right=0; right < nums.length; right++){
            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right],0) + 1);

            if(right - left + 1>k){
                sum -= nums[left];
                map.put(nums[left], map.get(nums[left])- 1);

                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }
            if(right - left + 1 == k){
                if(map.size() == k){
                    ans = Math.max(ans, sum);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n=sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements: ");

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        long result = maximumSubarraySum(nums,k);
        System.out.println("Maximum sum of Distinct subarray of size " + k + " = "+ result);
        sc.close();
    }
}
