class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
        {
            return 0;
        }
        int longest = 0;
        int left = 0;
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int right = 0; right < s.length(); right++)
        {
            if(hmap.containsKey(s.charAt(right)))
            {
                left = Math.max(left, hmap.get(s.charAt(right)) + 1);
            }
            hmap.put(s.charAt(right), right);
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
        
    }
}
