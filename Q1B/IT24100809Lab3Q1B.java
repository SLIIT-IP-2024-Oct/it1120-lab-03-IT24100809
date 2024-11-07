import java.util.Scanner;
public class IT24100809Lab3Q1B{
public static void main (String[] args){

Scanner scanner = new Scanner(System.in);
        double pricePerKg;
        System.out.println("Enter the price of 1kg : ");
	pricePerKg = scanner.nextDouble();
	System.out.println("price of 1kg : " + pricePerKg);
	
	double numberOfkg;
	System.out.println(" Enter the amount of kilo you want : ");
	numberOfkg = scanner.nextDouble();
	System.out.println("Number of kilo you want : " + numberOfkg);
        
        double totalAmount = pricePerKg * numberOfkg;
        double discountAmount = totalAmount * 10/100.0;
        double finalAmount = totalAmount - discountAmount;
      
        System.out.println("final price is : " + finalAmount);

}
}