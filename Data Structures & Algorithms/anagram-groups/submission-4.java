class Solution {
    public String getFreq(String s)
    {
        int[] freq = new int[26];
        for(char c : s.toCharArray())
        {
            freq[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder("");
        char ch = 'a';
        for(int i : freq)
        {
            sb.append(ch);
            sb.append(i);
            ch++;
        }
        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>();
        for(String str : strs)
        {
            String freq = getFreq(str);
            if(hmap.containsKey(freq))
            {
                hmap.get(freq).add(str);
            }
            else
            {
                List<String> strList = new ArrayList<>();
                strList.add(str);
                hmap.put(freq, strList);
            }
        }
        return new ArrayList<>(hmap.values());
        
    }
}
