class Solution {
    public int majorityElement(int[] nums) {
    HashMap<Integer,Integer> r = new HashMap<>();
    int max=0;
    int ans=0;
    for(int i=0;i<nums.length;i++){
          r.put(nums[i],r.getOrDefault(nums[i],0)+1);
          if(r.get(nums[i])>max){
            ans=nums[i];
            max=r.get(nums[i]);
          }
    }
    return ans;
    }
}