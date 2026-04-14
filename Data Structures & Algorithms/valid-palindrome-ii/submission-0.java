class Solution {
    public boolean validPalindrome(String s) {
    if(ispalin(s)){
        return true;
    }
    for(int i=0;i<s.length();i++){
        String m = s.substring(0,i)+s.substring(i+1);
        if(ispalin(m)){
            return true;
        }
    }
    return false;

    }
    private boolean ispalin(String s){
        int f=0;
        int l=s.length()-1;
        while(f<l){
            if(s.charAt(f)!=s.charAt(l)){
                return false;
            }
            f++;
            l--;
        }
        return true;
    }
}