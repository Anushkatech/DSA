class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        HashSet<Integer> hset = new HashSet<>();
        for(int num : nums)
        {
            hset.add(num);
        }
        for(int i : hset)
        {
            if(!hset.contains(i-1))
            {
                int len = 1;
                while(hset.contains(i + len))
                {
                    len++;
                }
                longest = Math.max(longest, len);
            }
        }
        return longest;
        
    }
}
