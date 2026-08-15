class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            int min=Integer.MAX_VALUE;
            int col=0;
            for(int j=0;j<n;j++){     //row traversal
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    col=j;       //note the column where we found min
                }
            }
            int max=min;
            for(int k=0;k<m;k++){
                if(matrix[k][col]>max){
                    max=matrix[k][col];
                }
            }
            if(max==min){
                list.add(min);
            }
            
        }
        return list;
    }
}