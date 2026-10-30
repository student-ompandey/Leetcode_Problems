class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(nums, 0, ans, curr);
        return ans;
    }

    public void solve(int[] nums, int index, List<List<Integer>> ans, List<Integer> curr){
        if(index==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[index]);
        solve(nums, index+1, ans, curr);

        curr.remove(curr.size()-1);

        solve(nums, index+1, ans, curr);
    }
}