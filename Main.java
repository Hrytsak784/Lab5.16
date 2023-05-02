import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1");
        Random random = new Random();
        int randomNumber = random.nextInt(41) - 20;
        System.out.println(randomNumber);

        System.out.println("Завдання 2");
        int a = 3;
        int b = 4;
        double c = Math.sqrt(a * a + b * b);
        double area = (a * b) / 2.0;
        double perimeter = a + b + c;
        System.out.println("Площа прямокутного трикутника: " + area);
        System.out.println("Периметр прямокутного трикутника: " + perimeter);

        System.out.println("Завдання 3");
        int randomNumber3 = (int) (Math.random() * 101);
        int digitsCount = String.valueOf(randomNumber).length();
        System.out.println("Випадкове число: " + randomNumber);
        System.out.println("Кількість цифр у числі: " + digitsCount);
    }
}