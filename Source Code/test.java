import java.util.Scanner;  
import java.io.IOException;
public class test {

	private static Scanner sc;

	public static void main(String[] args)
	{
		account ac = new account(); //constructor of account class
		int bal=0; //balance variable
		int acnt=0; //account variable
		int pin=0; //pin variable
		int dep=0; //deposit variable
		int retrn=0; //return value variable
		sc = new Scanner(System.in); 
		
		while(true)
		{
			 System.out.println("Please Select Operation");
			  
		        System.out.println("DRIVER for the account\n");
		         //Following are operations of account class
		        System.out.println("0. OPEN");
		        System.out.println("1. DEPOSIT");
		        System.out.println("2. WITHDRAW");
		        System.out.println("3. BALANCE");
		        System.out.println("4. LOCK");
		        System.out.println("5. UNLOCK");
		        System.out.println("6. LOGIN");
		        System.out.println("7. PIN");
		        System.out.println("8. LOGOUT\n");
		        
		        //Following are testing oriented methods
		        System.out.println("Testing Related Methods");
		        System.out.println("a. SHOW BALANCE");
		        System.out.println("b. SHOW STATE");
		        System.out.println("c. SHOW LOCK STATE");
		        System.out.println("d. SHOW ATTEMPTS");
		        System.out.println("e. SHOW ACCOUNT NUMBER #");
		        System.out.println("f. SHOW PIN NUMBER #");
		        System.out.println("g. SHOW VARIABLE VALUES");
		        System.out.println("q. QUIT PROGRAM");
		        
		        
		        String choice=sc.next();
		        
		        char in=choice.toCharArray()[0];
		        switch(in)
		        {
		        case '0':	//this is open(int x, int y, int z) method
		        	 System.out.println("\nACCOUNT CLASS - OPEN METHOD");
	                System.out.println("Enter initial balance:");
	                bal = sc.nextInt(); //obtaining user input balance
	                System.out.println("Enter PIN number:");
	                pin = sc.nextInt(); //obtaining user input pin
	                System.out.println("Enter Account Number #:");
	                acnt = sc.nextInt();//obtaining user account number
	                retrn=ac.open(bal, pin, acnt);	//this will execute the open operation, 'retrn' is the return value
	                System.out.println("\nThe value returned by the method is: " + retrn);  // if method is successful then it will return 0 otherwise -1
	                System.out.println("Press any key to contnue");
	                break;
	                
		        case '1': //this is deposit(int d) method
		        		System.out.println("\nACCOUNT CLASS - DEPOSIT METHOD");
	                System.out.println("Enter Deposit amount:");
	                dep = sc.nextInt(); //obtaining how much user want to deposit
	                retrn=ac.deposit(dep); //this will execute the deposit operation, 'retrn' is the return value
	                System.out.println("\nThe value returned by the method is: " + retrn);  // if method is successful then it will return 0 otherwise -1
	                System.out.println("Press any key to contnue");
	                break;
	                
		        case '2': //this is withdraw(int w) method
		        		System.out.println("\nACCOUNT CLASS - WITHDRAW METHOD");
	                System.out.println("Enter Withdraw amount:");
	                dep = sc.nextInt(); //obtaining how much user want to withdraw
	                retrn=ac.withdraw(dep);	//this will execute the withdraw operation, 'retrn' is the return value
	                System.out.println("\nThe value returned by the method is: " + retrn); // if method is successful then it will return 0 otherwise -1
	                System.out.println("Press any key to contnue");
	                break;
	                
		        case '3': //this is balance method
	                System.out.println("\nACCOUNT CLASS - BALANCE METHOD");
	                retrn=ac.balance();	//this will execute the balance operation, 'retrn' is the return value
	                System.out.println("\nThe value returned by the method is: " + retrn); // if method is successful then it will return 0 otherwise -1
	                	System.out.println("Balance is: "+retrn); //this will return amount of balance left.
	                System.out.println("Press any key to continue");
	                break;
	                
		        case '4':	//this is lock(int pin) method
		        	System.out.println("\nACCOUNT CLASS - LOCK METHOD");
	                System.out.println("Enter Pin Number:");
	                pin = sc.nextInt(); //obtaining lock pin from the user
	                retrn=ac.lock(pin);	//this will execute the lock operation, 'retrn' is the return value
	                System.out.println("\nThe value returned by the method is: " + retrn); // if method is successful then it will return 0 otherwise -1
	                System.out.println("Press any key to contnue");
	                break;
	                
		        case '5':	//this is unlock(int pin) method
		        	 System.out.println("\nACCOUNT CLASS - UNLOCK METHOD");
		        	 System.out.println("Enter Pin Number:");
	                pin = sc.nextInt(); //obtaining lock pin from the user
	                retrn=ac.unlock(pin);	//this will execute unlock operation,'retrn' is the return value
	                System.out.println("\nThe value returned by the method is: " + retrn); // if method is successful then it will return 0 otherwise -1
	                System.out.println("Press any key to contnue");
	                break;
	                
		        case '6':	//this is login(int x) method
		       	 System.out.println("\nACCOUNT CLASS - LOGIN METHOD");
		       	 System.out.println("Enter Account Number:");
	              acnt = sc.nextInt(); //obtaining account number from the user
	                retrn=ac.login(acnt);	//this will execute login operation,'retrn' is the return value
	                System.out.println("\nThe value returned by the method is: " + retrn); // if method is successful then it will return 0 otherwise -1
	                System.out.println("Press any key to contnue");
	                break;
	                
		        case '7':	//this is  pin(x) method
		       	 System.out.println("\nACCOUNT CLASS - PIN METHOD");
		       	 System.out.println("Enter Pin Number:");
	                pin = sc.nextInt(); //obtaining pin number from the user.
	                retrn=ac.pin(pin);	//this will execute pin operation,'retrn' is the return value
	                System.out.println("\nThe value returned by the method is: " + retrn); // if method is successful then it will return 0 otherwise -1
	                System.out.println("Press any key to contnue");
	                break;
	                
		        case '8':	//this is  logout() method
		        	 System.out.println("\n ACCOUNT CLASS - LOGOUT METHOD");
	                retrn=ac.logout();	//this will execute logout operation,'retrn' is the return value
	                System.out.println("\nThe value returned by the method is: " + retrn); // if method is successful then it will return 0 otherwise -1
	                System.out.println("Press any key to contnue");
	                break;
	                 
	              //testing oriented method 
	                
	                
		        case 'a':	//show_balance() is called here
		        		System.out.println("\nTESTING RELATED METHOD - show_balance()");
			       	 System.out.println("DISPLAYING BALANCE\n");
	                retrn=ac.show_balance();	//Displays current balance
	                System.out.println("Balance is: " + retrn);
	                System.out.println("Press any key to contnue");
	                break;   
	                
		        case 'b':	//display_state() method is called here
		        	System.out.println("\nTESTING RELATED METHOD - display_state()");
			       	 System.out.println("DISPLAYING CURRENT STATE\n");
	                ac.display_states(); //Display current state
	                System.out.println("Press any key to contnue");
	                break;  
	                
		        case 'c':	//display_lock_state() method is called here
		        	System.out.println("\nTESTING RELATED METHOD - display_lock_state()");
			       	 System.out.println("DISPLAYING LOCK STATE STATUS\n");
	                ac.display_lock_state(); //Displays whether current state is locked or not.
	                System.out.println("Press any key to continue");
	                break;
	                
		        case 'd':	//display_attempts() method is called here
		         	System.out.println("\nTESTING RELATED METHOD - display_attempts()");
			       	 System.out.println("DISPLAYING  NUM OF ATTEMPTS\n");
	                retrn=ac.display_attempts(); //Display number of attempts.
	                System.out.println("Number of attempts: " + retrn);
	                System.out.println("Press any key to contnue");
	                break;
	                
		        case 'e':	//display_account() method is called here
		        	System.out.println("\nTESTING RELATED METHOD - display_account()");
			       	 System.out.println("DISPLAYING ACCOUNT NUMBER\n");
	                retrn=ac.display_accountno(); //displays account number
	                System.out.println("Account number: " + retrn);
	                System.out.println("Press any key to contnue");
	                break;
	                
		        case 'f':	//display_pin() method is called here.
		          	System.out.println("\nTESTING RELATED METHOD - display_pin()");
			       	 System.out.println("DISPLAYING PIN NUMBER\n");
	                retrn=ac.display_pin(); //displays pin number
	                System.out.println("Pin number: " + retrn);
	                System.out.println("Press any key to contnue");
	                
	                break;   
	                
		        case 'g': //printing system variables
		        	System.out.println("\nTESTING RELATED METHOD - display_variables()");
		        	ac.display_varibales();
		        	System.out.println("Press any key to contnue");
		        	break;
		        	
	                
		        case 'q':  //Exits the program
		       
		        	System.out.println("Thank You for using the program !!");
	                return;
	                
	            default:
	                break;
	                
	                
	                
		        }
		        try {
			    	System.in.read();
			    } catch (IOException e) {
			    	return;
			    }
		}
		 
		
		
	}
}
