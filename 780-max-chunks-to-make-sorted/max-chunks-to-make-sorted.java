class Solution {
    public int maxChunksToSorted(int[] arr) {
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
    }
}