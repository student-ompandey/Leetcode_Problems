class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int i = 0;
        while(i<nums.length){
            int cI = nums[i] - 1;

            if(nums[i] != nums[cI]){
                int temp = nums[i];
                nums[i] = nums[cI];
                nums[cI] = temp;
            } else {
                i++;
            }
        }

        for(i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}