class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int n=nums.size();
        int start=0;
        int end=n-1;
        int count=0;
        while(start<end){
            int sum=nums.get(start)+nums.get(end);
            if(sum<target){
                count+=end-start;
                start=start+1;
            }
            else{
                end=end-1;
            }
        }
        return count;
    }
}