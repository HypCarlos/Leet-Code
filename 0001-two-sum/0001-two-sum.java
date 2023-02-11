class Solution {
    public int[] twoSum(int[] nums, int target) {
   
        HashMap <Integer, Integer> hash = new HashMap<>();
        
        int[] results = new int[2];  // ARRAY OF 2 FOR RESULT
        int remainder = 0;
        
        for (int i = 0; i < nums.length; i++) {
            remainder = target - nums[i];
            
            if (hash.containsKey(remainder)) {
                results[0] = i;
                results[1] = hash.get(remainder);
            }
            
            hash.put(nums[i],i);
        }
        return results;
    }
}