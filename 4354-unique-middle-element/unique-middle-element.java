class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<n;i++){
            int mid=start+(end-start)/2;
            if(map.get(nums[mid])==1){
                return true;
            }
        }
        return false;

    }
}
// 1 2 2      0 2 1 mid-1   map 1-1 2-2 nums[2]
//always build the hashmap first 