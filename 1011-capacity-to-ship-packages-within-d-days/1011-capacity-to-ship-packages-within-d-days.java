class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int st = 0, end = weights.length-1;

        for(int w : weights){
            st = Math.max(st, w);
            end += w;
        }

        while(st<=end){
            int mid = st + (end -st)/2;
            int dayN = 1;
            int currL = 0;
            for(int weight : weights){
                if(currL+weight>mid){
                    dayN++;
                    currL = weight;
                } else {
                    currL += weight;
                }
            }

            if(dayN <= days){
                end = mid -1 ;
            } else {
                st = mid + 1;
            }
        }
        return st ;
    }
}