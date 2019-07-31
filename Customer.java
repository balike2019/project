public class Customer{
String fullNames;
int pin;
double balance;
double amount;
double accountBalance;
double withdrawalAmount;
double depositAmount;
double minimumWithdrawalAmount;
double maximumWithdrawalAmount;
double minimumDepositAmount;
double maximumDepositAmount;
double checkBalance;
String reference;
long   phoneNumber;
String emailAdress;
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

accountBalance = accountBalance - withdrawal;
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