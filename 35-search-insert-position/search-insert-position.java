class Solution {
    public int searchInsert(int[] nums, int target) {
        int size=nums.length;
        int start=0;
        int end=size-1;
        while(start<=end){
            int mid=start+(end-start)/2;     //[1,3,5,6] target=2
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
}