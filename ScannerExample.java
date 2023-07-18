import java.util.Scanner;

class ScannerExample{


public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your First Name : ");
       

    String Fname = sc.nextLine();



 System.out.println("Enter your Last Name : ");
 char Lname = sc.next().charAt(0);
 
  
   System.out.println("Enter your age : ");
   int age =sc.nextInt();
   sc.nextLine();
  
  	

   System.out.println("Enter Password : ");
   String pass = sc.nextLine();
 
     
   System.out.println("Enter your Email Id : ");
   String mail = sc.nextLine();
  

      System.out.println("Enter your Phone No : ");
   long num =sc.nextLong();
   sc.nextLine();
   
System.out.println("First Name is :" + Fname);
 System.out.println("Inital is :" + Lname);

 System.out.println("Your Age is : " + age);

  System.out.println("Your Password is : " + pass);
 System.out.println("Your Email is : " + mail);
System.out.println("Your No is : " + num);
System.out.println("Thank you ");
   
   

 

 
   
 
	






}
}

