public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        // leet code problem number: 74
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(target==matrix[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}

