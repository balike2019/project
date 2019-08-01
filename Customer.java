import java.util.Scanner;
public class Customer{

String fullNames;
int pin;
double balance;
double amount;
long accountNumber;
double accountBalance;
double withdrawalamount;
double depositAmount;
double minimumWithdrawalAmount;
>>>>>>> e17195164ca71f2adb979225ecfb33eb02c3d73d
double maximumWithdrawalAmount;
double minimumDepositAmount;
double maximumDepositAmount;
double checkBalance;
String reference;
<<<<<<< HEAD

Scanner=sc.Scanner(System.in);

public double deposit(){
System.out.println(" insert card");

System.out.println("Enter accountNumber");
accountNumber= sc.nextLong();

System.out.println("Enter reference");
reference = sc.nextLine();

System.out.println("Are you sure?");

System.out.println("accountNumber= "+accountNumber);
System.out.println("reference= "+reference);
sc.nextLine();
System.out.println("Press 1 to continue or 2 to cancel");

System.out.println("Enter fullName");
fullName = sc.nextLine();

System.out.println("Enter phoneNumber");
phoneNumber = sc.nextLong();

System.out.println("Minimum amount 20");
System.out.println("Maximum notes 100");

System.out.println("Enter depositAmount");
depositAmount = sc.nextDouble();

System.out.println("Confirm Deposit Details");
System.out.println("accountNumber= "+accountNumber);
System.out.println("reference= "+reference);
sc.nextLine();
System.out.println("fullNames= "+fullNames);
System.out.println("amount= "+amount);

int option;
System.out.println("choose option");
System.out.println("Proceed");
System.out.println("Cancel");
sc.nextLine();

if (accountNumber==){
System.out.println("Successful")
}else{
System.out.println("Fail");
depositAmount = balance + depositAmount;
}
return balance;

}

long   phoneNumber;
String emailAdress;

}
