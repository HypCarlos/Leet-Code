class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     
        int[] topElements = new int[k];
        
        HashMap<Integer, Integer> hashy = new HashMap<>();
        
        // KEEPS COUNT OF OCCURENCES- UPDATES VALUE
        for (int i = 0; i < nums.length; i++) {
            hashy.put(nums[i], hashy.getOrDefault(nums[i],0) + 1);
        }
        
        
        // PRIORITY QUEUE
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>( (a,b) -> b.getValue() - a.getValue() );
        
        for (HashMap.Entry entry : hashy.entrySet()) {
           queue.add(entry);
        }
        
        for(int j = 0; j < k; j++) {
            topElements[j] = queue.poll().getKey(); // GETS ELEMENT IN FRONT
        }
        return topElements;
}
}