class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        int[] freq = new int[26];
        for(int c = 0; c < s.length(); c++)
        {
            freq[s.charAt(c) - 'a']++;
            freq[t.charAt(c) - 'a']--;
        }
        for(int i : freq)
        {
            if(i != 0)
            {
                return false;
            }
        }
        return true;

    }
}
