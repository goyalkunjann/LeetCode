class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            int temp=nums[i]+nums[i+1];
            nums[i+1]=temp;

        }
         return nums;
    }
}
