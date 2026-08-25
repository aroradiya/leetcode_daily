class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int totalsum=0;
        int[] rightsum=new int[n];
        int[] currsum=new int[n];
        int leftsum=0;
        for(int i=0;i<n;i++){
            totalsum+=nums[i];
        }
        for(int i=0;i<n;i++){
            rightsum[i]=totalsum-leftsum-nums[i];
            currsum[i]=leftsum;
            leftsum+=nums[i];
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(currsum[i]-rightsum[i]);

        }
        return ans;
        
    }
}