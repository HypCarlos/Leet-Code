class Solution {
    public int romanToInt(String s) {
        /*
        {I = 1}
        */
        int sum = 0; // SUM
        HashMap<Character, Integer> romanChars = new HashMap<>();
        
        // ADDED ALL VALUES TO HASHMAP WITH CORESPONDING VALUE
         romanChars.put('I', 1);
         romanChars.put('V', 5);
         romanChars.put('X', 10);
         romanChars.put('L', 50);
         romanChars.put('C', 100);
         romanChars.put('D', 500);
         romanChars.put('M', 1000);
        // SPECIAL CASE IS WHEN LOWER CHAR IS BEFORE GREATER ONE
        // IV
        for (int i = 0; i < s.length(); i++) {
            
             if ( i > 0 && (romanChars.get(s.charAt(i)) > romanChars.get(s.charAt(i - 1))) ){
                 // * 2 is to remove the original addition 
                 sum += (romanChars.get(s.charAt(i)) - 2 * romanChars.get(s.charAt(i-1)));
             }
          else {
             sum += romanChars.get(s.charAt(i));
         } 
    }
         return sum;
}
}