class Solution {
    public int maxChunksToSorted(int[] arr) {
        //running max approach
        int n=arr.length;
        int running_max=0;
        int chunks=0;
        for(int i=0;i<n;i++){
            running_max=Math.max(running_max,arr[i]);
            if(running_max==i){
                chunks++;
            }
        }
        return chunks;

        //monotonic stack




        // int n=arr.length;
        // Deque<Integer> st=new ArrayDeque<>();
        // for(int i=0;i<n;i++){
        //     int curr=arr[i];
        //     if(st.isEmpty()|| curr>=st.peek()){
        //         st.push(curr);
        //     }
        //     else{
        //         int max=st.pop();
        //         while(!st.isEmpty() && curr<st.peek()){
        //             st.pop();
        //         }
        //         st.push(max);
        //     }
        // }
        // return st.size();
    }
}