public class Main {

    public static int maxSubArray(int[] nums) {
        //variables
        int currentSum = nums[0]; //space
        int maxSum = nums[0]; //space

        /*this is Kadane's Algorithm.  We want to check if our current subarray (an array in an array where the index are one next to another)
        example of subarray int[] nums = {1,2,3,4} a sub array of nums can either  be [1,2,3] || [2,3,4] is the max sum as is or do we need to add
        another value*/

        for(int  i = 1; i < nums.length; i ++){
            currentSum = Math.max(nums[i] + currentSum, nums[i]);
            maxSum = Math.max(currentSum,maxSum);
        } //O(n) time O(n) space

        return maxSum;
    }
    public static void main(String[] args) {
        //driver code
        int []nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}