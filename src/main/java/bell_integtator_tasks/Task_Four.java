package bell_integtator_tasks;

public class Task_Four {
    public static void main(String[] args) {
        int length = 8;
        int[][] matrix = new int[length][length];
        int index = length / 2;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i - index;
                matrix[j][matrix.length - 1 - i] = i - index;
                matrix[j][i] = i - index;
                matrix[matrix.length - i - 1][j] = i - index;
            }
        }
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}