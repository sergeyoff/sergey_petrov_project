package homework3;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class lesson3_hw {
    public static void main(String[] args) {
        swap();
        createArray();
        changeArray();
        fillDiagonals();

    }

    private static void fillDiagonals() {
        int[][] ArrSq = new int[4][4];
        for (int i = 0; i < 4; i++) {
            int j;
            for (j = 0; j < 4; j++) {
                if (i < j) {
                    ArrSq[i][j] = 0;
                } else if (i > j) {
                    ArrSq[i][j] = 1;
                } else {
                    ArrSq[i][j] = 1;
                }
                System.out.print(ArrSq[i][j] + " ");
            }
            System.out.println();

            }
        }


    private static void changeArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] = array[i] * 2;
        }
        System.out.println("Ответ на 3 задание: " + Arrays.toString(array));

    }

    private static int[] createArray() {
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;

        }
        System.out.print("Массив " + Arrays.toString(arr2));
        return arr2;
    }

    private static void swap() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println("Результат замены: " + Arrays.toString(arr));
    }
}
