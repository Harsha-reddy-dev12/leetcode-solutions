class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxAns=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
            }
            else
            {
                maxAns=Math.max(maxAns,count);
                count=0;
            }
        }
        return Math.max(maxAns,count);
    }
}
