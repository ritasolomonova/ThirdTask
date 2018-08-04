import java.util.Scanner;
/**
 * Created on 04.08.18
 * @author Margarita S.
 */
public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //Ввод номера задания
        System.out.println("Введите номер задания: (1 - калькулятор, 2 - массив слов)");
        int num = scanner.nextInt();
        if (num == 1){
            //Ввод первого числа
            System.out.println("Введите первое число: ");
            double x = scanner.nextDouble();

            //Ввод второго числа
            System.out.println("Введите второе число: ");
            double y = scanner.nextDouble();

            //Определение переменных результатов операций
            double sum = x + y;
            double diff = x - y;
            double mult = x * y;
            double div = x / y;

            //Вывод на консоль результат операций
            System.out.printf("Сумма введенных чисел: " + "%.4f\n", sum);
            System.out.printf("Разница введенных чисел: " + "%.4f\n", diff);
            System.out.printf("Произведение введенных чисел: " + "%.4f\n", mult);
            System.out.printf("Частное введенных чисел: " + "%.4f", div);
        }
        else if (num == 2) {
            //Ввод размерности массива слов
            System.out.println("Введите размерность массива: ");
            int size = scanner.nextInt();
            String[] myArray = new String[size];

            //Ввод слов
            System.out.println("Введите " + size + " слов(а): ");
            for (int i=0; i<size; i++) {
                myArray[i] = scanner.next();
            }

            int max = myArray[1].length();
            String word = myArray[1];

            for (int k=0; k<size; k++) {
                if (myArray[k].length() > max) {
                    max = myArray[k].length();
                    word = myArray[k];
                }
            }
            System.out.println("Самое длинное слово: " + word);
        }
        else System.out.println("Задание отсутствует!");
        scanner.close();
    }
}
