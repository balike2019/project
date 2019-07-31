<<<<<<< HEAD
class Customer{
public String name;
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

=======
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


}
=======
long   phoneNumber;
String emailAdress;
>>>>>>> 30b8039101cffa8ae06c30649222c4b38ab01515
>>>>>>> 896f580cb9ed85f80200574bc5f62fae0c4156b7
}
