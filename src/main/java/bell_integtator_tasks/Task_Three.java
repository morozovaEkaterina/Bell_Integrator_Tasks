package bell_integtator_tasks;

import java.util.Arrays;

public class Task_Three {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3, 4, 5},
                {5, 7, 9, 2, 1},
                {0, 9, 1, 8, 7},
                {6, 3, 6, 6, 6},
                {99, 100, -2, 3, 1}
        };

        int[] crossLineOne = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers[i].length - 1 - i; j < numbers[i].length - i; j++) {
                crossLineOne[i] = numbers[i][j];
            }
        }
        int[] crossLineTwo = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            crossLineTwo[i] = numbers[i][i];
        }

        int[] copyCrossOne = new int[crossLineOne.length - 1];
        if (crossLineTwo[crossLineTwo.length / 2] == crossLineOne[crossLineOne.length / 2]) {
            for (int i = 0, j = 0; i < crossLineOne.length; i++) {
                if (i != crossLineOne.length / 2)
                    copyCrossOne[j++] = crossLineOne[i];
            }
            int min = Arrays.stream(copyCrossOne).min().getAsInt();
            System.out.println(min);
        }
    }
}


