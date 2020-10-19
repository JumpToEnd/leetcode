public class L867 {


    public int[][] transpose(int[][] A) {

        // 行
        int m = A.length;
        // 列
        int n = A[0].length;

        int[][] result = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // [i][j] -> [j][i];
                result[i][j] = A[j][i];
            }
        }

        return result;
    }
}
