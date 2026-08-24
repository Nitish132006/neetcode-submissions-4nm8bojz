class Solution {
    public String minWindow(String s, String t) {
    int[] f = new int[256];
    for(int i=0;i<t.length();i++){
        f[t.charAt(i)]++;
    }
    int l=0;
    int count=0;
    String ans="";
    int min=Integer.MAX_VALUE;
    for(int r=0;r<s.length();r++){
       if(f[s.charAt(r)]>0){
        count++;
       }
       f[s.charAt(r)]--;
       while(count==t.length()){
           if(min>r-l+1){
            min=r-l+1;
            ans=s.substring(l,r+1);
           }
           f[s.charAt(l)]++;
           if(f[s.charAt(l)]>0){
            count--;
           }
           l++;
       }
    }
    return ans;
    }
}
