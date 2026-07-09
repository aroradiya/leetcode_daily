class Solution {
    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            while (start < end &&
                  !(arr[start]=='a'||arr[start]=='e'||arr[start]=='i'||
                    arr[start]=='o'||arr[start]=='u'||
                    arr[start]=='A'||arr[start]=='E'||arr[start]=='I'||
                    arr[start]=='O'||arr[start]=='U')) {
                start++;
            }

            while (start < end &&
                  !(arr[end]=='a'||arr[end]=='e'||arr[end]=='i'||
                    arr[end]=='o'||arr[end]=='u'||
                    arr[end]=='A'||arr[end]=='E'||arr[end]=='I'||
                    arr[end]=='O'||arr[end]=='U')) {
                end--;
            }

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return new String(arr);
    }
}