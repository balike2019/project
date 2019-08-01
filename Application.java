import java.util.Scanner;
class Application{
Scanner sc = new Scanner(System.in);
System.out.println("WELCOME TO FNB TELLER MACHINE");
System.out.println("SELECT THE PRODUCT YOU ARE INTERESTED IN");
System.out.println("select1 saving account,select2 business");
int press =sc .nextInt();
if(press==1){
System.out.println("saving account");
}else if(press==2){
System.out.println("business account");
}

System.out.println("CHOOSE THE OPERATION YOU WANT TO CARRYOUT");
System.out.println(select 1,deposit,select2 for  withdrawal,select 3 to checkbalance"); 
int choose= sc.nextInt();
if(choose==1){
System.out.println("deposit");
}else if(choose==2){
System.ou.println("withdrawal");
}else if(choose==3){
System.out.println("checkBalance");
}
}
}
