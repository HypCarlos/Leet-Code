class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] indexes = new int[2];
       HashMap<Integer,Integer> hash = new HashMap<>();

       for (int i = 0; i < nums.length; i++) {
        // KEY: NUMBER VALUE: INDEX
        
        int answer = target - nums[i];
        if (hash.containsKey(answer)) {
            indexes[0] = i; 
            indexes[1] = hash.get(answer);
        return indexes;
        }
        hash.put(nums[i],i);
       }
       return indexes;
}
}