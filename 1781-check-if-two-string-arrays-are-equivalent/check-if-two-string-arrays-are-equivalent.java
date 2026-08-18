class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int m=word1.length;
        int n=word2.length;
        String result=String.join("",word1);
        String result2=String.join("",word2);

        return result.equals(result2);

    }
}