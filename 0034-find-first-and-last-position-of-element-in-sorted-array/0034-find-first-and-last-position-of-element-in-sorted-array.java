class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstP = firstPosition(nums, target);
        int lastP = lastPosition(nums, target);
        int ans [] = new int[2];
        ans[0] = firstP;
        ans[1] = lastP;
        return ans;
    }

    public int firstPosition(int arr[] , int tar){
        int st = 0, end = arr.length-1;
         int ans = -1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]==tar){
                ans = mid;
                end = mid -1;

            } else if(arr[mid]<tar){
                st = mid + 1;
            } else {
                end = mid -1 ;
            }
        }
        return ans;
    }

    public int lastPosition(int arr[], int tar) {

        int st = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (st <= end) {

            int mid = st + (end - st) / 2;

            if (arr[mid] == tar) {
                ans = mid;
                st = mid + 1;    
            }
            else if (arr[mid] < tar) {
                st = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return ans;
    }
}