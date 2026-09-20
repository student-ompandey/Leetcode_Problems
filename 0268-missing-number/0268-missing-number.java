class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length-1;
        Arrays.sort(nums);
        int j = 0;
        for(int i=0;i<=n;i++){
            if(nums[j] != i){
                return j;
            } else {
                j++;
            }
        }
        return j;
    }
}