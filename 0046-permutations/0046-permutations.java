import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        solve(nums, 0, result);
        return result;
    }

    private void solve(int[] nums, int i, List<List<Integer>> result) {
        // Base case: If we reach the end of the array, a valid permutation is formed
        if (i == nums.length-1) {
            List<Integer> currentPermutation = new ArrayList<>();
            for (int num : nums) {
                currentPermutation.add(num);
            }
            result.add(currentPermutation);
            return;
        }

        // Backtracking loop
        for (int j = i; j < nums.length; j++) {
            swap(i, j, nums);          // Swap to place the element at position i
            solve(nums, i + 1, result); // Recurse for the remaining positions
            swap(i, j, nums);          // Backtrack to restore original array state
        }
    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
