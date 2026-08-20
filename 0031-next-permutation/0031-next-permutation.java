class Solution {

    public void reverse(int nums[], int st, int end){
        
        while (st<end){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }

    public void swap(int nums[], int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivit = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivit =  i;
                break;
            }
        }

        if(pivit == -1){
            reverse(nums, 0, n-1);
            return;
        }

        for(int i=n-1;i>=pivit;i--){
            if(nums[i]>nums[pivit]){
                swap(nums, pivit, i);
                break;
            }
        }
            reverse(nums,pivit+1,n-1);
    }
}
