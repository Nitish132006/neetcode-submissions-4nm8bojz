class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> h = new HashSet<>();
        int[] n = new int[1];
        for(int i=0;i<nums.length;i++){
            if(h.contains(nums[i])){
                h.remove(nums[i]);
            }
            else{
            h.add(nums[i]);
            }
        }
        for(int num:h){
            n[0]=num;
        }
        return n[0];
    }
}
