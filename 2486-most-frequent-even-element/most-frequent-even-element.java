class Solution {
    public int mostFrequentEven(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        //0-1 2-2 4-2 
        int maxfreq=-1;
        int ans=-1;
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(freq>maxfreq){
                maxfreq=freq;
                ans=key;
            }
            else if(freq==maxfreq && key<ans){
                ans=key;
            }
        }
        return ans;  
        
    }
}