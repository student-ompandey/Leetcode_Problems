class Solution {
    public int findDuplicate(int[] nums) {
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
                return nums[i];
            }
        }
        return -1;
    }
}