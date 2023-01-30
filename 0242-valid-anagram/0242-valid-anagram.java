class Solution {
    public boolean isAnagram(String s, String t) {
        
       if (s.length() != t.length()) {
           return false;
       }
        
        int[] values = new int[26];
        
        
        for (int i = 0; i < s.length(); i++) {
            values[s.charAt(i) - 'a']++;
            values[t.charAt(i) - 'a']--;
        }
        
        for (int j = 0; j < values.length; j++) {
            if (values[j] != 0) {
                return false;
            }
        }
        return true;
}
    
}