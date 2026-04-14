class Solution {
    public int[] twoSum(int[] num, int target) {
    int l=0,r=num.length-1;
    while(l<r){
        int ans=num[l]+num[r];
        if(ans>target){
            r--;
        }
        else if(ans<target){
            l++;
        }
        else{
            return new int[]{l+1,r+1};
        }
    }
    return new int[]{-1,-1};
    }
}
