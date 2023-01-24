import java.util.Scanner;


public class ex3 {
    public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;
      Scanner reader = new Scanner(System.in);
      System.out.println("Ввведите два числа: ");
      num1 = reader.nextDouble();
      num2 = reader.nextDouble();
      System.out.print("\nВведите оператор действия (+, -, *, /): ");
      op = reader.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
         default:  System.out.printf("Ошибка! Неверный оператор!");
            return;
      }
      System.out.print("\nЭто результат вашего действия:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
}