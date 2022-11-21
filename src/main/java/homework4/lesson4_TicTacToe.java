package homework4;

import java.util.Random;
import java.util.Scanner;

public class lesson4_TicTacToe {
    private static final int SIZE = 3;
    private static final char DOT_EMPTY = '*';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';

    private static final char [][] MAP = new char[SIZE][SIZE];

    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();


    public static void main(String[] args) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++){
                MAP[i][j] = DOT_EMPTY;
            }

            System.out.print("$" + " ");
            for (i = 0; i < SIZE; i++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
            for (i = 0; i < SIZE; i++) {
                System.out.print(i + 1 + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(MAP[i][j] + " ");
                }
                System.out.println();
            }


        }
    }


}
