class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int right = 0; right <s.length();right++){
            char c = s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>1){
                char remove = s.charAt(left);
                map.put(remove, map.get(remove)-1);
                left++;
            }

            res = Math.max(res, right - left +1);
        }

        return res;
    }
}