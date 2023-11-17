package HomeWork.Lesson_3;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.sumOfTwoNumbers();
        System.out.println();
        methods.printLine(10);
        System.out.println();
        methods.outputtingNumberToTheConsole(-555);
        methods.outputtingNumberToTheConsoleFlippedOut(0);
        methods.leapYear(4);
        // 6. Задача
        int[] arr = {1, 0, 0, 0, 0, 0, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        for (int massive : arr) {
            System.out.print(massive + " ");
        }
        System.out.println();
        // 7. Задача
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
        // 8. Задача
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println();
        for (int k : arr3) {
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println();
        // 9.Задача
        int n = 5;
        int[][] arr4 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i == arr4.length - 1 - j) {
                    arr4[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //10. Задача
        System.out.println("10 задача");
        //System.out.println(methods.returningOneDimensionalArray(5,22));
        int[] massiveInitialValue = massive(7, 22);
        for (int i = 0; i < massiveInitialValue.length; i++) {
            System.out.print(massiveInitialValue[i] + " ");
        }
    }

    public static int[] massive(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}