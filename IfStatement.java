import java.util.Scanner;   
class IfStatement{

public static void main(String args[]){
     Scanner sc =new Scanner(System.in);
	
System.out.println("Enter the age :");
int age = sc.nextInt();
System.out.println("-----------------------------");
if(age>18){
 System.out.println("Eligible for voting ");
}else{
System.out.println("NotEligible for voting");
}


}
}