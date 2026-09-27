class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int st = 1, end = 0;
        for(int p : piles){
            end = Math.max(end , p);
        }

        while(st<=end){
            int mid = st + (end - st)/2;
            long hour = 0;
            for(int p : piles){
                hour += (p+mid-1)/mid;
            }

            if(hour <= h){
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return st;
    }
}