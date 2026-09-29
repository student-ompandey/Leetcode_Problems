class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int st = 1, end = 0;
        for(int num : nums){
            end = Math.max(num, end);
        }

        int ans = end;
        while(st <= end){
            int mid = st + (end-st)/2;
            int sum = 0;

            for(int num : nums){
                sum += (num+mid-1)/mid;
            }

            if(sum<=threshold){
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return ans;
    }
}