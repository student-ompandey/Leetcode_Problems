class Solution {
    public int kthFactor(int n, int k) {
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                k--;
                if(k==0) return i;
            }
        }

        int sqrt = (int)Math.sqrt(n);

        if(sqrt*sqrt==n) sqrt--;

        for(int i=sqrt;i>=1;i--){
            if(n%i==0) k--;

            if(k==0) return n/i;
        }
        return -1;
    }
}