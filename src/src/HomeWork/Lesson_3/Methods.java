package HomeWork.Lesson_3;

public class Methods {
    public void sumOfTwoNumbers() {  //1.Задание
        int a = 10;
        int b = 2;
        int c = a + b;
        if (c <= 20 && c >= 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public void printLine(int a) {  //2. Задача
        String text = "Hello world";
        for (int i = 0; i < a; i++) {
            System.out.println(text);
        }
    }

    public void outputtingNumberToTheConsole(int numberOfConsole) { //3. Задача
        if (numberOfConsole >= 0) {
            System.out.println("Число, которое передает метода, положительное");
        } else {
            System.out.println("Число не положительное");
        }
    }

    //4. Задача
    public void outputtingNumberToTheConsoleFlippedOut(int number) {
        if (number < 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    // 5. Задача
    public void leapYear(int age) {
        if (age % 4 == 0 && age != 100) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
  /* //10. Задача
    public String returningOneDimensionalArray(int len, int intialValue){
        String d=" ";
        int [] arr = new int[len];
        for (int i=0; i<arr.length; i++){
            arr[i]=intialValue;
        }
        for (int k: arr) {
            d=d+" "+k;
        }
        return d;
    }*/


}
