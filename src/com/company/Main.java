package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            // 入力される数
            int n = Integer.parseInt(bufferedReader.readLine());

            String[] numbers = bufferedReader.readLine().split(" ");
            int[] numArray = new int[n];

            for (int i = 0; i < numbers.length; i++) {
                numArray[i] = Integer.parseInt(numbers[i]);
            }

            bubbleSort(numArray, numArray.length);


        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void bubbleSort(int[] A, int N) {
        int flag = 0;

        // 最後の要素はそれまでにその他が全て整列しているため、自然と一番大きいものが来ているため、N-1で良い
        for (int i = 0; i < N - 1; i++) {
            // 配列の最後尾の要素から比較する
            // 1番小さい要素から左に並べていく
            // j > i によって、整列済みの要素をを1, 2, 3と増やしていく
            for (int j = N - 1; j > i; j--) {
                // 右(後方)の方が左(前方)よりも小さければ
                if (A[j - 1] > A[j]) {
                    // 交換
                    int temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;

                    flag++;
                }
            }
        }

        for (int k = 0; k < A.length; k++) {
            if (k == A.length - 1) {
                System.out.println(A[k]);
            } else {
                System.out.print(A[k] + " ");
            }
        }
        System.out.println(flag);
    }

}
