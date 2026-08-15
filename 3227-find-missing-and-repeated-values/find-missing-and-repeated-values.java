class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        int missing=0;
        int repeated=0;
        for(int i=1;i<=m*n;i++){
            if(!map.containsKey(i)){
                missing=i;
            }
            if(map.getOrDefault(i,0)==2){
                repeated=i;
            }
        }
        return new int[]{repeated,missing};
      
    }
}