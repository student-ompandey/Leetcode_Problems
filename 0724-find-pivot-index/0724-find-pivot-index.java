class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int rightSum [] = new int[n];

        for(int i=n-2;i>=0;i--){
            rightSum[i] = rightSum[i+1] + nums[i+1];
        }
        int ls = 0;
        for(int i=0;i<n;i++){
            
            if(ls==rightSum[i]){
                return i;
                
            }
            ls += nums[i];
        }
        return -1;
    }
}