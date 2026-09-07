class Solution {
    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i=0, m=0, j=n-1;
        while(m<=j){
            if(nums[m]==2){
                swap(nums, m, j--);
            } else if(nums[m]==0){
                swap(nums, m++, i++);
            } else {
                m++;
            }
        }
    }
}