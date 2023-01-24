import java.util.Scanner;


public class ex1 {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in); 
    System.out.println("Введите число: ");
    int a = reader.nextInt();
    int count = 0;
    int count2 = 1;
    for (int i = 0; i <= a; i++) {
        count = count + i;
    }
    System.out.printf("Ваше треугольное число: %d", count);  
    for (int i = 1; i <= a; i++) {
        count2 = count2 * i;
    }
    System.out.println();
    System.out.printf("Фактириал равен: %d", count2);
    }
}
