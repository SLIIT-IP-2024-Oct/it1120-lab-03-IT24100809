import java.util.Scanner;

public class IT24100809Lab3Q4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five-digit number: ");
        int number = input.nextInt();
               if (number < 10000 || number > 99999) {
            System.out.println("Please enter a valid five-digit number.");
            return;
        }
        int digit1 = number / 10000;
        int digit2 = (number / 1000) % 10;
        int digit3 = (number / 100) % 10;
        int digit4 = (number / 10) % 10;
        int digit5 = number % 10;
        
        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);


}

}
