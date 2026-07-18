class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> ans1 = new ArrayList<>();

            for(int j=0;j<=i;j++){
                    if(j==0 || j==i){
                        ans1.add(1);
                    } else {
                        int val = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                        ans1.add(val);
                    }
            }
              result.add(ans1);
        }
        return result;
    }
}