class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;

        for(int i=0;i<row;i++){
            int st=0, end = image[0].length - 1;

            while(st<end){
                int temp = image[i][st];
                image[i][st] = image[i][end];
                image[i][end] = temp;
                st++;
                end--;
            }

            for(int j=0;j<col;j++){
                image[i][j] = 1 - image[i][j];
            }
        }
        return image;
    }
}