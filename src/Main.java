import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(String.format("Введенное число: %f", task1()));
        task2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        task3();
        task4();
    }


//    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//    вместо этого, необходимо повторно запросить у пользователя ввод данных.


    /**
     * Запрашивает у пользователя число типа float
     *
     * @return введенное число типа float
     */
    public static float task1() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        float outputFloat = 0;
        while (flag) {
            System.out.print("Введите число типа float: ");
            String inputString = scanner.next();
            flag = false;
            try {
                outputFloat = Float.parseFloat(inputString);
            } catch (RuntimeException e) {
                flag = true;
                System.out.println("Введены некорректные данные. Попробуйте ещё раз\n");
            }

        }
        return outputFloat;
    }


    /**
     * Берет восьмой элемент массива и делит его на ноль (ну да, такое задание)
     */
    public static void task2(int[] intArray) {

        int d = 0;
        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        }

    }
//    Задание 3


    /**
     * Задача из задания 3
     */
    public static void task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }


    /**
     * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
     * //    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        String outputtSring = "";
        boolean flag = true;
        while (flag) {
            System.out.println("Введите не пустую строку:");
            outputtSring = scanner.nextLine();
            try {
                checkNullString(outputtSring);
                flag = false;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void checkNullString(String str) throws RuntimeException {
        if (str.length() == 0) {
            throw new RuntimeException("Пустые строки вводить нельзя");
        }
    }


}

