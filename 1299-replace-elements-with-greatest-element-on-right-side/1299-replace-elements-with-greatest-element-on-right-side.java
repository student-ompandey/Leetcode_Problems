class Solution {
    public int[] replaceElements(int[] arr) {
        // if(arr.length == 1){
        //     arr[0] = -1;
        // }

        int n = arr.length;
        // int max = arr[0];
        // int a;
        for(int i=0;i<n-1;i++){
           int max = arr[i+1];
            for(int j=i+2;j<n;j++){
               
                if(arr[j]>max){
                    max = arr[j];
                }
                // a = arr[j];
            }
            arr[i] = max;
           
        }

        arr[n-1] = -1;

        return arr;
    }
}