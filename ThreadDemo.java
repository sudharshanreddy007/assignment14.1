package prime;

import java.util.Scanner;
//we import Scanner to take the values from the user
class Prime implements Runnable{
//class defines instance and class fields,methods and inner classes as
	//well as specifying the interfaces the class implements and the 
//immediate superclass of the class

/*create the class Prime which implements using runnable interface*/
	public void run()
//public keyword is used in the declaration of a class,method or 
//field;public classes,method and fields can be accessed by the 
//members of any class.
//void is used to define the return type of the method
//public void run-if this thread object was instantiated using a runnable 
//target, the run() method is invoked on that runnable
	
	/*here we create run method which will execute when thread is
	 * Called
	 */
		{
		
			System.out.println("Enter any number:");
		//here scanner creates new object to take the input values
			Scanner sc=new Scanner(System.in);
			int number=sc.nextInt();
			boolean isPrime=true;/*here we are using boolean when isPrime is true*/
//A we are usimg prime number it will start from 2 and it will see the prime number condition			
			for(int orderNumber=2;orderNumber<number/2;orderNumber++){
			 if(number%orderNumber==0)
/*here using for loop checking whether the given number is prime or not is factor of one and itself
* if a number is divided by 2 give the output as 0 is not prime*/			 
			 {
				 isPrime=false;//then it prints the isPrime as false
				 break;//here it breaks the condition
			 }
		}
		if(isPrime)//here we are checking whether the number is prime or not with if and else
		{
			
			System.out.println(number+"is a prime number");
		}
		else
		{
			
			System.out.println(number+"is not a prime number");
		}
	}
	}
		public class ThreadDemo{//created a class ThreadDemo
		public static void main(String[] args){
			
				
			// TODO Auto-generated method stub
			Prime prime=new Prime();//creation of an object
			Thread t=new Thread(prime);//creates the thread which starts runnable method
			
			t.start();//thread get started
		}
	}
