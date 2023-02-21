class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap <Character, Integer> hash = new HashMap<>();
        
        for (int i = 0; i < magazine.length(); i++) {
            hash.put(magazine.charAt(i), hash.getOrDefault(magazine.charAt(i),0) + 1);
        }
        
        for(int j = 0; j < ransomNote.length(); j++) {
            if (!hash.containsKey(ransomNote.charAt(j)) || hash.get(ransomNote.charAt(j)) <= 0) {
                return false;
            }
            hash.put(ransomNote.charAt(j), hash.get(ransomNote.charAt(j)) - 1);
        }
        
        
        return true;
    }
}