class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0) return 0;

        int ans = 1;
        int i = 0;

        while (i < s.length()) {

            HashSet<Character> set = new HashSet<>();
            set.add(s.charAt(i));

            int e = 1;
            int j = i + 1;

            while (j < s.length()) {

                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                    e++;
                } else {
                    break;
                }

                j++;
            }

            ans = Math.max(ans, e);
            i++;
        }

        return ans;
    }
}