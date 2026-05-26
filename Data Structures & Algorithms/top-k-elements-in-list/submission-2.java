class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int num : nums)
        {
            hmap.put(num, hmap.getOrDefault(num,0)+ 1);
        }
        List<Integer>[] bucket = new List[nums.length + 1];
        for(int key : hmap.keySet())
        {
            int freq = hmap.get(key);
            if(bucket[freq] == null)
            {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
            int counter = 0;
            for(int pos = bucket.length - 1; pos >= 0 && counter < k; pos--)
            {
                if(bucket[pos] != null)
                {
                    for(Integer i : bucket[pos])
                    {
                        res[counter++] = i;
                    }
                }
            }
        

        return res;
        
    }
}
