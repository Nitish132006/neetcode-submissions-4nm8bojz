class Solution {
    public boolean checkInclusion(String s1, String s2) {
    int[] f=new int[26];
    for(int i=0;i<s1.length();i++){
        f[s1.charAt(i)-'a']++;
    }
    int[] w = new int[26];
    int l=0;
    for(int r=0;r<s2.length();r++){
        w[s2.charAt(r)-'a']++;
        if(r-l>=s1.length()){
           w[s2.charAt(l)-'a']--;
           l++;
        }
            if(Arrays.equals(f,w)){
                return true;
            }
    }
    return false;
    }
}
