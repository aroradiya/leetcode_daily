class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int totalsum=0;
        int leftsum=0;
        int rightsum;
        for(int i=0;i<n;i++){
            totalsum+=nums[i];
        }
        for(int i=0;i<n;i++){
            rightsum=totalsum-leftsum-nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum+=nums[i];

        }
        return -1;
        
    }
}