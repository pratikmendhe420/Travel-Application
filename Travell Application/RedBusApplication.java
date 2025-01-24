import java.util.Scanner;
class RedBusApplication
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	RedBusDriver r=new RedBusDriver();
	
	for(;;)
	{
		
		System.out.println("1) login 2) Logout 3)Booka a Ticket 4) PAyment 5) Change the date 6) exist ");
		
      switch(sc.nextInt())
	  {
		  case 1 :
		   r.login();
		   break;
		   
		   case 2 :
		   r.logout();
		    break;
			
			case 3:
			r.bookTicket();
			break;
			
			case 4:
			r.payment();
		  break;
		  
		  case 5 :
		 r.changeDate();
		 break;
		 
		 case 6:
		 System.exit(0);
		 
	  }
		
		
		
	}
	}
	
}