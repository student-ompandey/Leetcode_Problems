class Solution {
    public int maxProduct(int[] nums) {
        
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for(int i=1;i<n;i++){
            int prevMax = max;
            int preMin = min;

            max = Math.max(nums[i], Math.max(prevMax*nums[i], preMin*nums[i]));
            min = Math.min(nums[i], Math.min(prevMax*nums[i], preMin*nums[i]));
            ans = Math.max(max , ans);
        }

        return ans;
    }
}