import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число a: ");
        float number1 = scan.nextFloat();
        System.out.print("Ведите число b: ");
        float number2 = scan.nextFloat();

        if (number1 > number2) {
            System.out.println("Сравнение: " + number1 + " > " + number2);
        }
        else if (number1 < number2) {
            System.out.println("Сравнение: " + number1 + " < " + number2);
        }
        else {
            System.out.println("Сравнение: " + number1 + " = " + number2);
        }

        float result1 = number1 + number2;
        float result2 = number1 - number2;
        float result3 = number1 / number2;
        float result4 = number1 * number2;
    //System.out.println("Результат примеров");
    System.out.println("Сложение: " + result1 + "\n" + "Вычитание: " + result2 + "\n" + "Деление: " + result3 + "\n"+ "Умножение: " + result4);
    }
}
