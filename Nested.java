import java.util.Scanner; 
  
class Nested{

	public static void main(String args[]){

    		Scanner sc =new Scanner(System.in);
	
		System.out.println("Enter your Age:");
		
		int age = sc.nextInt();
		System.out.println("Enter your Percentage:");
		int per = sc.nextInt();
		if(age>=17){
                 
 		if(per>60){
		System.out.println("You are eligble to admitioon");

		}

  		

                  }else{
		System.out.println("You are not eligble");

}
	}
}