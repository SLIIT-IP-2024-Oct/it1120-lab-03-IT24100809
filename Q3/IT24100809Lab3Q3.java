import java.util.Scanner;
public class IT24100809Lab3Q3{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int amount,remainingAmount,num5000,num1000,num500,num200,num100,num50,num20,num10,num5,num2,num1;

System.out.println("enter the amount :");
amount=input.nextInt();
System.out.println("amount is :",amount);
remainingAmount=amount;
num5000=remainingAmount/5000;
remainingAmount=remainingAmount%5000;
num1000=remainingAmount/1000;
remainingAmount=remainingAmount%1000;

num500=remainingAmount/500;
remainingAmount=remainingAmount%500;

num200=remainingAmount/200;
remainingAmount=remainingAmount%200;

num100=remainingAmount/100;
remainingAmount=remainingAmount%100;

num50=remainingAmount/50;
remainingAmount=remainingAmount%50;

num20=remainingAmount/20;
remainingAmount=remainingAmount%20;

num10=remainingAmount/10;
remainingAmount=remainingAmount%10;

num5=remainingAmount/5;
remainingAmount=remainingAmount%5;

num2=remainingAmount/2;
remainingAmount=remainingAmount%2;

System.out.println("num5000 :"+num5000);
System.out.println("num1000 :"+num1000);
System.out.println("num500 :"+num500);
System.out.println("num200 :"+num200);
System.out.println("num100 :"+num100);
System.out.println("num50 :"+num50);
System.out.println("num20 :"+num20);
System.out.println("num10 :"+num10);
System.out.println("num5 :"+num5);
System.out.println("num2 :"+num2);


}

}