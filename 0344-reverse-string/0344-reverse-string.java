class Solution {
    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length -1;
    
        // DONE ONCE THEY ARE BOTH IN MIDDLE
       while (left <= right) {
           char temp = s[left];
           s[left] = s[right];
           s[right] = temp;
           
           left++;
           right--;
       }
}
}