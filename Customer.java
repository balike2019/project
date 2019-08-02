import java.util.Scanner;

public class Customer{
public String  fullNames;
public String emailAddress;
public String gender;
public long phoneNumber;
public long accountNumber;
public double  depositAmount;
public double checkBalance;
public double withdrawalAmount;
public double minimumAmount;
public double maximumAmount;
public int pin;
public String insertCard;
public String accountBalance;
public String reference;
public double balance;
public double amount;
public double minimumWithdrawalAmount;
public double maximumWithdrawalAmount;
public double minimumDepositAmount;
public double maximumDepositAmount;
public double checkBalance;

Scanner sc = new Scanner(System.in);

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


System.out.println("Enter fullNames");
fullNames = sc.nextLine();

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

if (accountNumber==accountNumber){
System.out.println("Successful");
}else{
System.out.println("Fail");
depositAmount = balance + depositAmount;
}
return balance;

}


double checkBalance(){
System.out.println("Enter pin");
pin =sc. nextInt();
System.out.println("select balance");
System.out.println("1)print balance ,2)preview balance");

int select;
select = sc.nextInt();
if(select == 1){
System.out.println("print balance");
}else{
System.out.println("preview");

}

}

}

public double withdrawalAmount(){
System.out.println("INSERT YOUR CARD");
System.out.println(" Enter pin");
pin = sc.nextInt();
System.out.println("login successful");

System.out.println("Choose Amount");
System.out.println("1 = R100");
System.out.println("2 = R200");
System.out.println("3 = R300");
System.out.println("4 = own amount");
int press = sc.nextInt();
if(choice ==1){
System.out.println("100");
withdrawalAmount = "100"
System.out.println("own amount");

}else if(choice ==2){
System.out.println("200");
withdrawalAmount = 200;
System.out.println("own amount");

} else if("choice ==3"){
System.out.println("300"){
withdrawalAmount = 300;
System.out.printLn("own amount");

} else if(choice == 4){
System.out.println("own amount");
if("withdrawalAmount > accountBalance"){
System.out.println("INSUFFICIENT FUNDS");
} else{
System.out.pintln("............l..........");

accountBalance = accountBalance - withdrawalAmount;
System.out.println("accountBalance"+accountBalance);
System.out.println("withdrawalAount" +withdrawalAount);
System.out.println("DO YOU WANT A RECIEPT (true for yes, false for no");
boolean input = s.nextBoolean();
if(input ==true){
System.out.println("RECEIPT");
} else if(input==false){
System.out.println("NO RECEIPT");
}
}
