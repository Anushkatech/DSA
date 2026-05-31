class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length())
        {
            return "";
        }
        int required = t.length();
        int[] fmap = new int[126];
        for(char c : t.toCharArray())
        {
            fmap[c]++;
        }
        int minStart = 0, left = 0, minLen =Integer.MAX_VALUE;
        for(int right = 0; right < s.length(); right++) 
        {
            if(fmap[s.charAt(right)] > 0)
            {
                required--;
            }
            fmap[s.charAt(right)]--;
            while(required == 0)
            {
                if(right - left + 1 < minLen)
                {
                    minLen = right - left + 1;
                    minStart = left;
                }
                fmap[s.charAt(left)]++;
                if(fmap[s.charAt(left)] > 0)
                {
                    required++;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
