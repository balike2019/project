import java.util.Scanner;
class Application{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("WELCOME TO FNB TELLER MACHINE");
System.out.println("SELECT THE PRODUCT YOU ARE INTERESTED IN");
System.out.println("1 saving account,2 business account");
int press =sc .nextInt();
if(press==1){
System.out.println("saving account");
}else if(press==2){
System.out.println("business account");
}

System.out.println("CHOOSE THE OPERATION YOU WANT TO CARRYOUT");
System.out.println("1 deposit");
System.out.println("2 withdraw");
System.out.println("3 checkBalance");
System.out.println("4 exit"); 
int choose= sc.nextInt();
if(choose==1){
System.out.println("deposit");
}else if(choose==2){
System.out.println("withdrawal");
}else if(choose==3){
System.out.println("checkBalance");

}else{
System.out.println("exit");
}
}
}
