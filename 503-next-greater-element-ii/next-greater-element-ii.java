class Solution {
    public int[] nextGreaterElements(int[] nums) {
        //%n-->[0,n-1]
        int n=nums.length;
        int[] ans=new int[n];
        Deque<Integer> st=new ArrayDeque<>();
        for(int i = 0; i < n; i++) {
            ans[i] = -1;
        }
        for(int i=0;i<2*n;i++){
            int curr=nums[i%n];
            while(!st.isEmpty()&& curr>nums[st.peek()]){
                ans[st.pop()]=curr;
            }
            if(i<n){
               
                st.push(i);
            }
        }
        return ans;

    }
}