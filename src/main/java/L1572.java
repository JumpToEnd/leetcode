public class L1572 {
    public int diagonalSum(int[][] mat) {

        int m = mat.length;

        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += mat[i][i];
        }

        for (int i = 0; i < m; i++) {
            sum += mat[i][m - i - 1];
        }

        if(m % 2 == 1){
            int mid = m / 2 + 1;
            sum -= mat[mid][mid];
        }

        return sum;
    }
}
