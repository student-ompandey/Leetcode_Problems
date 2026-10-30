import java.util.*;

class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> current = new ArrayList<>();

       
        Arrays.sort(nums);

        solve(0, nums, current, ans);

        return ans;
    }

    public void solve(int index, int[] nums,
                      List<Integer> current,
                      List<List<Integer>> ans) {

      
        ans.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {

            
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            // Pick
            current.add(nums[i]);

            solve(i + 1, nums, current, ans);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}