class Solution {
    public int[] twoSum(int[] nums, int target) {
     
        HashMap <Integer,Integer> hash = new HashMap<>();
        
        int[] indexes = new int[2];
        int answer = 0;
        
        for(int i = 0; i < nums.length; i++) {
            answer = target - nums[i];
            if (hash.containsKey(answer)) {
                indexes[0] = i;
                indexes[1] = hash.get(answer); // value at which key: remainder is found
}
            hash.put(nums[i], i);
        }
        return indexes;
        
}
}