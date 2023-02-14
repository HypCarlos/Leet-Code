class Solution {
    public boolean isPalindrome(String s) {
        
        // REMOVE SPECIAL CHAR
        // LEFT POINTER AND RIGHT POINTER
        String updatedS = "";
        
        
        
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i)))          {
                updatedS += s.charAt(i);
            }
        }
        updatedS = updatedS.toLowerCase();
        
        
        int left = 0;
        int right = updatedS.length() - 1;
        
        while (left <= right) {
            if (updatedS.charAt(left) == updatedS.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        
        return true;
    }
    
    
}