class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet();
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            for(int k=j+1;k<nums.length;k++){
                if(nums[i]+nums[j]+nums[k]==0){
        List<Integer> l1=new ArrayList<>();
                    l1.add(nums[i]);
                    l1.add(nums[j]);
                    l1.add(nums[k]);
                    Collections.sort(l1);
        res.add(l1);
                }
            }
        }
    }
    return new ArrayList<>(res);
    }
}
