import java.util.Scanner;

public class GradedTask23 {
   public static void main(String[]args) {

      Scanner console = new Scanner(System.in);

      final int SECRET = 1;
      final double RATE = 12.50;

      int num1, num2, newNum;
      String name;
      double hoursWorked, wages;
     
      System.out.print("Enter first number (num1): ");
      num1 = console.nextInt();

      System.out.print("Enter first number (num2): ");
      num2 = console.nextInt();

      System.out.println("The value of num1 = " + num1 + " and the value of num2 = " + num2);

      newNum = (num1 * 2) + num2;
      System.out.println("The value of newNum after calculation = " + newNum);

      newNum = newNum + SECRET;
      System.out.println("The value of newNum after adding SECRET = " + newNum);
 
      System.out.print("Enter your last name: ");
      name = console.next();

      System.out.print("Enter hours worked (between 0 and 70): ");
      hoursWorked = console.nextDouble();

      wages = hoursWorked * RATE;

      System.out.println("\n---Payroll Summary ---");
      System.out.println("Name: " + name);
      System.out.println("Pay Rate:$" + RATE);
      System.out.println("Hours Worked: " + hoursWorked);
      System.out.println("Salary: $" + wages);
     }
}
      