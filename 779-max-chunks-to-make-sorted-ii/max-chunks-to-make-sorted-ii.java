class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        Deque<Integer> st=new ArrayDeque<>();
        for(int i=0;i<n;i++){
          int curr=arr[i];
          if(st.isEmpty()|| curr>=st.peek()){
            st.push(curr);
          }
          else{
            int max=st.pop();
            while(!st.isEmpty() && curr<st.peek()){
                st.pop();
            }
            st.push(max);
          }

        }
        return st.size();

    }
}

// arr->curr->prev->curr= max se small hai st.pop()