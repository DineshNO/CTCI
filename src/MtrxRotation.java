public class MtrxRotation {
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};

        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int last = n - i - 1;
            for (int j = 0; j < last; j++) {
                int offset = j - i;
                int temp = arr[i][j];
                arr[i][j] = arr[last - offset][i];
                arr[last - offset][i] = arr[last][last - offset];
                arr[last][last - offset] = arr[j][last];
                arr[j][last] = temp;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
