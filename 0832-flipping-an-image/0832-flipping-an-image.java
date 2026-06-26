class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;

        for(int i=0;i<row;i++){
            int left=0, right = image[i].length-1;
            while(left<right){
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;
                left++;
                right--;
            }
            for(int j=0;j<col;j++){
                image[i][j]= 1-image[i][j];
            }
        }
        return image;
    }
}