import java.util.scanner;
public class IT24100809Lab3Q2{
public static void main (String[] args){

Scanner scanner = new Scanner(System.in);
        double monthlySalary;
        System.out.println("Enter the monthly salary : ");
	monthlySalary = scanner.nextDouble();
	System.out.println("monthly salary is : " + monthlySalary);
	
	double numberOfOtHours;
	System.out.println(" Enter the number of OT hours : ");
	numberOfOtHours = scanner.nextDouble();
	System.out.println("Number of OT hours : " + numberOfOtHours);
        
        double otHoursRate;
	System.out.println(" Enter OT hours rate : ");
	otHoursRate = scanner.nextDouble();
	System.out.println("Number of OT hours : " + otHoursRate);
        
        
        double otAmount = numberOfOtHours * otHoursRate;
        double totalSalary = monthlySalary + otAmount;
        
        System.out.println("total salary including ot is : " + totalSalary);

}
}
