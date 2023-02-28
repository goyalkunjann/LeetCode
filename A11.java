class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0,totaldigitsum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int n=nums[i],digitsum=0;

            while(n!=0)
            {
               digitsum+=n%10;
                n/=10;
            }
            totaldigitsum+=digitsum;
        }
        return Math.abs(totaldigitsum-sum);
    }
}
