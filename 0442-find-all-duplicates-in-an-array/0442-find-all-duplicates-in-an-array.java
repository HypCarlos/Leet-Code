class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        /*
            [1,N]
        */
        ArrayList <Integer> list = new ArrayList<>();
        HashMap <Integer, Integer> hash = new HashMap<>();
        
        
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                list.add(nums[i]);
            }
            hash.put(nums[i],1);
         }
        
        
        
        return list;
    }
}