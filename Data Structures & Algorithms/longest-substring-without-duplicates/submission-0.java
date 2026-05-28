class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int longest = 0;
        HashSet<Character> hset = new HashSet<>();
        for(int right = 0; right < s.length(); right++)
        {
            while(hset.contains(s.charAt(right)))
            {
                hset.remove(s.charAt(left));
                left++;
            }
            hset.add(s.charAt(right));
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
        
    }
}
