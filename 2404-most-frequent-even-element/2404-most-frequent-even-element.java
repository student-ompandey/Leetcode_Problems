class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int ans = Integer.MAX_VALUE;
        int min = 0;
        for(int num : map.keySet()){
            if(num %2 == 0){
                int v = map.get(num);
                if(v>min){
                    min = v;
                    ans = num;
                } else if(v==min){
                    ans = Math.min(ans, num);
                }
            }
        }

        if(ans ==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}