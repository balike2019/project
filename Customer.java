import java.util.Scanner;
public class Customer{
Scanner = sc.Scanner (System.in);

public String  fullNames;
public String emailAddress;
public String gender;
public long phoneNumber;
public long accountNumber;
public  double  depositAmount;
public double checkBalance;
public double withdrawalAmount;
public  double mimimumAmount;
public double maximumAmount;
public int pin;
public String insertCard;
public String accountBalance;
public String reference;

<<<<<<< HEAD
Scanner sc = new Scanner(System.in);
=======
=======
import java.util.Scanner;
public class Customer{

String fullNames;
int pin;
double balance;
double amount;
long accountNumber;
double accountBalance;
double withdrawalAmount;
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

>>>>>>> 8b0a4e69753c7549b11da507a25c9cc970703da2
void deposit(){
System.out.println(" insert card");

System.out.println("Enter accountNumber");
accountNumber= sc.nextLong();

System.out.println("Enter reference");
reference = sc.nextLine();

System.out.println("Are you sure?");

System.out.println("accountNumber= "+accountNumber);
System.out.println("reference= "+reference);
System.out.println("");

double checkBalance(){;
System.out.println("Enter pin");
pin =sc. nextInt();
System.out.println("select balance");
System.out.println("1)print balance ,2)preview balance");

int select;
select = sc.nextInt();
if(select == 1);
System.out.println("print balance");
}else{
System.out.println("preview");

}
}

}

public double withdrawalAmunt(){
System.out.println("INSERT YOUR CARD");
System.out.println(" Enter pin");
pin = sc.nextInt();
System.out.println("login successful")

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