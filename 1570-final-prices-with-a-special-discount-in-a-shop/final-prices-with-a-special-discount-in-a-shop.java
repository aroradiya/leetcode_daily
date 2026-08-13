class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        Deque<Integer> st=new ArrayDeque<>();
        int[] disc =new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>prices[i]){
                st.pop();
            }
            if(st.isEmpty()){
                disc[i]=prices[i];
            }
            else{
                disc[i]=prices[i]-st.peek();
            }
            st.push(prices[i]);
        }
        return disc;

    }
}
//[4,2,2,0,0]