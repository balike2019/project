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

Scanner sc = new Scanner(System.in);
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
