class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int a : nums){
            hs.put(a, hs.getOrDefault(a, 0)+1);
        }

        for(Integer k : hs.keySet()){
            if(hs.get(k)>n/2){
                return k;
            }
        }
        return -1;
    }
}