//***********************************************
//************* CLASS ACCOUNT *******************
//***********************************************

public class account
{
	private int x0; //Predefined value as 3 for maximum number of wrong attempts while entering pin
	private int x1; //User input Balance
	private int x2; //User input Lock Variable
	private int x3; //User input input Pin.
	private int x4; //State Id#
	private int x5; //Input Account Id#
	private int x6; //Predefined value as 20 for fine in withdrawn condition
	private int x7; //Predefine minimum balance as 500
	private int x8; //Lock pin
	private int x9; //Number of attempts while entering wrong pin.
	
public final int show_balance() //display user input balance.
{
	return x1;
} //testing oriented method

public account()
{
	x2 = 0;
	x4 = -1;
	x6 = 20;
	x7 = 500;
	x9 = 0;
	x0 = 3;
}
public final int open(int x, int y, int z) //open method
{
	if ((x > 0) && (x4 == -1) && (y > 0) && (z > 0))
	{
		x1 = x;
		x3 = y;
		x5 = z;
		x4 = 0;
		return 0;
	};
	return -1;
}
public final int pin(int x) //Pin method
{
	if (x4 != 1)
	{
		return -1;
	}
	if (x == x3)
	{
		x4 = 2;
		return 0;
	}
	else
	{
		x9++;
	}
	if (x9 >= x0)
	{
		x4 = 0;
	}
	return -1;
}
public final int logout() //logout method
{
	if ((x4 == 0) || (x2 == 1))
	{
		return -1;
	}
	x4 = 0;
	return 0;
}
public final int login(int x) //login method
{
	if (x4 != 0)
	{
		return -1;
	}
	if (x5 == x)
	{
		x4 = 1;
		x9 = 0;
		return 0;
	}
	return -1;
}
public final int balance() //balance method
{
	if (x4 != 2)
	{
		return -1;
	}
	return x1;
}
public final int lock(int x) //lock method
{
	if (x4 != 2)
	{
		return -1;
	}
	if (x == x3)
	{
		return -1;
	}
	if (x2 == 0)
	{
		x2 = 1;
		x8 = x;
		return 0;
	}
	else
	{
		return -1;
	}
}
public final int unlock(int x) //unlock method
{
	if (x4 != 2)
	{
		return -1;
	}
	if ((x2 == 1) && (x == x8))
	{
		x2 = 0;
	return 0;
	}
	else
	{
		return -1;
	}
}
public final int deposit(int d) //deposit method
{
	if (x4 != 2)
	{
		return -1;
	}
	if (x2 == 1)
	{
		return -1;
	};
	if ((x1 + d < x7) && (d>0))
	{
		x1 = x1 + d - x6;
		return 0;
	}
	else
	{
		if (d > 0)
		{
		x1 = x1 + d;
		return 0;
		}
	}
 return -1;
}
public final int withdraw(int w) //withdraw method
{
if (x4 != 2)
{
	return -1;
}
if (x2 == 1)
{
	return -1;
};
if ((x1 > w) && (w > 0))
{
	if (x1 < x7)
	{
		return -1;
	}
	else
	{
		x1 = x1 - w;
	};
	if (x1 < x7)
	{
		x1 = x1 - x6;
	}
  return 0;
}
return -1;
}


public int display_attempts() //display number of attempts while entering the wrong pin
{
return x9;
}

public int display_accountno() //display account number input by the user
{
return x5;
}
public int display_pin() //display account number input by the user
{
return x3;
}

public void display_lock_state() //display lock state with the help of variable x2
{
	if(x2==1) //Locked State
	{
		System.out.println("\nLOCK State");
	}
	else if(x2==0) //UnLocked State
	{
		System.out.println("\nUNLOCKED State");
	}
	else //Wrong state
	{
		System.out.println("\nWRONG State");
	}
}

public void display_states() //display current state
{
	switch(x4)
	{
	case -1:  //Start State
		System.out.println("\nSTART State");
		break;
	case 0: //Idle State
		System.out.println("\nIDLE State");
		break;
	case 1: //Check_Pin State
		System.out.println("\nCHECK-PIN State");
		break;
	case 2:
		if(x2==0)
		{
			if(x1<x7) //Overdrawn State
				//This happens when balance is less than 500
			{
				System.out.println("\nOVERDRAWN State");
			}
			else //Ready State
				//This happens when balance is greater or equal to 500
			{
				System.out.println("\nREADY State");
			}
		}
		else if(x2==1) //Locked State
		{
			System.out.println("\nLOCKED State");
		}
		else //Wrong State
		{
			System.out.println("\nWRONG State");
		}
		
		break;
	}
}


public void display_varibales()
{
	   System.out.println("Displaying Varibale values");
       System.out.println("Value of x0: "+x0);
       System.out.println("Value of x1: "+x1);
       System.out.println("Value of x2: "+x2);
       System.out.println("Value of x3: "+x3);
       System.out.println("Value of x4: "+x4);
       System.out.println("Value of x5: "+x5);
       System.out.println("Value of x6: "+x6);
       System.out.println("Value of x7: "+x7);  
       System.out.println("Value of x8: "+x8);
       System.out.println("Value of x9: "+x9);
}





}