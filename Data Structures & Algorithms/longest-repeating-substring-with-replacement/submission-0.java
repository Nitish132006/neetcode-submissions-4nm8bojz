class Solution {
    public int characterReplacement(String s, int k) {
    HashMap<Character,Integer> m = new HashMap<>();
    int l=0;
    int maxf=0;
    int max=0;
    for(int r=0;r<s.length();r++){
        m.put(s.charAt(r),m.getOrDefault(s.charAt(r),0)+1);
        maxf=Math.max(maxf,m.get(s.charAt(r)));
        int c=(r-l+1)-maxf;
        while(c>k){
            m.put(s.charAt(l),m.get(s.charAt(l))-1);
            l++;
            c=(r-l+1)-maxf;
        }
        max=Math.max(max,r-l+1);
    }
    return max;

    }
}
