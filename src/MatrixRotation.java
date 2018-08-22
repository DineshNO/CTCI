public class MatrixRotation {

    static boolean rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        for(int layer = 0;layer < n/2;layer++){
            int first = layer;
            int last = n-1-layer;
            for(int i = first;i < last;i++){
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        return true;
    }

    static boolean reverseRotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        for(int layer = 0;layer < n/2;layer++){
            int first = layer;
            int last = n-1-layer;
            for(int i = first;i < last;i++){
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[i][last];//matrix[last-offset][first];
                matrix[i][last] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[last-offset][first];
                matrix[last-offset][first] = top;
            }
        }
        return true;
    }

    static boolean rotate180(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        for(int layer = 0;layer < n/2;layer++){
            int first = layer;
            int last = n-1-layer;
            for(int i = first;i < last;i++){
                int offset = i - first;
                int top =  matrix[first][i];
                matrix[first][i] = matrix[last][last-offset];
                matrix[last][last-offset] = top;
                top = matrix[i][last];
                matrix[i][last] =  matrix[last-offset][first];
                matrix[last-offset][first] = top;
            }
        }
        return true;
    }

    static void rotateMatrix(int N, int mat[][])
    {
        // Consider all squares one by one
        for (int x = 0; x < N / 2; x++)
        {
            // Consider elements in group of 4 in
            // current square
            for (int y = x; y < N-x-1; y++)
            {
                // store current cell in temp variable
                int temp = mat[x][y];

                // move values from right to top
                mat[x][y] = mat[y][N-1-x];

                // move values from bottom to right
                mat[y][N-1-x] = mat[N-1-x][N-1-y];

                // move values from left to bottom
                mat[N-1-x][N-1-y] = mat[N-1-y][x];

                // assign temp to left
                mat[N-1-y][x] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] inp = {{1,2,3,4}, {5,6,7,8},{9,0,1,0},{0,0,0,1}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(inp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < 4; i++) {
            rotate(inp);
            for (int j = 0; j < 4; j++) {
                System.out.print(inp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------");
        reverseRotate(inp);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(inp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------");
        rotate180(inp);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(inp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------");
        rotate180(inp);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(inp[i][j] + " ");
            }
            System.out.println();
        }
    }
}