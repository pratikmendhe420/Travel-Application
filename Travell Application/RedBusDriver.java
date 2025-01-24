import java.util.Scanner;
class RedBusDriver
{
	RedBus r;
	Account a;
	
	
	Scanner sc=new Scanner(System.in);
	
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void login()
	{
		if(a==null)
		{
		System.out.println("Enter Your name");
		String name=sc.next();
		System.out.println("Enter Your Address");
		String address=sc.next();
		System.out.println("Enter Your Vaccinate date");
		String vaccinated=sc.next();
		 a= new Account(name,address,vaccinated);
		System.out.println("Login Scussecfully");
		}
		else {
			System.out.println("Account is allready Created");
		}
		
	}
	public void logout()
	{
		if(a==null)
		{
			System.out.println("First creat a Acount ");
		}
		else{
			a=null;
			System.out.println("Account is Logout Scussecfully");
		}
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void bookTicket()
	{
		if(a==null)
		{
			System.out.println("Frist login After Book a Ticket");
		}
		else
		{
			System.out.println("1)NationalTravell  2)VRLTravell  3)SeaBirtTravell");
			
			switch(sc.nextInt())
			{
				case 1:
				{
				System.out.println("From");
				String from=sc.next();
				System.out.println("to");
				String to=sc.next();
				System.out.println("date");
				String date=sc.next();
				System.out.println("km");
				int km=sc.nextInt();
				r=new NationalTravell(from,to,date,km);
				
				System.out.println("1) conform  2) calcle");
				if(sc.nextInt()==1)
				{
					payment();
					
				}
				else
				{
					System.out.println("Ticket has Been cancled");
				}
				}
				break;
				
				case 2:
				{
				System.out.println("From");
				String from=sc.next();
				System.out.println("to");
				String to=sc.next();
				System.out.println("date");
				String date=sc.next();
				System.out.println("km");
				int km=sc.nextInt();
				r=new VRLTravell(from,to,date,km);
				
				System.out.println("1) conform  2) calcle");
				if(sc.nextInt()==1)
				{
					
					payment();
					
				}
				else
				{
					System.out.println("Ticket has Been cancled");
				}
				}
				break;
				
				
				
				case 3:
				{
				System.out.println("From");
				String from=sc.next();
				System.out.println("to");
				String to=sc.next();
				System.out.println("date");
				String date=sc.next();
				System.out.println("km");
				int km=sc.nextInt();
				r=new SeaBirdTravell(from,to,date,km);
				
				System.out.println("1) conform  2) calcle");
				if(sc.nextInt()==1)
				{
					payment();
					
				}
				else
				{
					System.out.println("Ticket Booking has Been cancled");
				}
				}
				break;
				
				
				
			}
		}
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void cancleTicket()
	{
		if(a==null)
		{
			System.out.println("First Book ma Ticket");
		}
		else{
			
			System.out.println("Are you Sure to Cancle Your Ticket");
			if(sc.nextInt()==1)
			{
				a=null;
				System.out.println("Tickt has been cancle ");
			}
			else
			{
				System.out.println("Ticket not cancle ");
				System.exit(0);
			}
			
		}
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		public void changeDate()
		{
			
			if(a==null)
			{
				System.out.println("First Book a Ticket");
			}
			else{
				System.out.println("Chnage tha date");
				
				if(r instanceof NationalTravell)//true
				{
					r=new NationalTravell(sc.next());
				}
				else if(r instanceof VRLTravell)
				{
					r=new VRLTravell (sc.next());
				}
				else
				{
					r=new SeaBirdTravell (sc.next());
				}
				System.out.println("Date changeed");
				}
				
		}
		
		
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		public void payment()
		{  
		Scanner sc=new Scanner(System.in);
			if(r instanceof NationalTravell)
			{
				NationalTravell n=(NationalTravell)r;
				int money=n.km*n.price;
				System.out.println(n.from);
				
				System.out.println(n.to);
				
				System.out.println(n.date);
				
				System.out.println(n.km);
				
				System.out.println("Total Amount is "+ money);
				
				System.out.println("1) Payment  2) Cancle");
				if(sc.nextInt()==1)
				{
					System.out.println("Enter ammount");
				    double amount=sc.nextDouble();
					if(amount>=money)
					{
						System.out.println("Ticket Has been Book");
					}
					else 
					{
						System.out.println("Enter vallid amount ");
					}
					
				}
				else
				{
					a=null;
					System.out.println("Ticket has been Cancle");
					
				}
			}
			else if(r instanceof VRLTravell)
			{
				VRLTravell n=(VRLTravell)r;
				int money=n.km*n.price;
				System.out.println(n.from);
				
				System.out.println(n.to);
				
				System.out.println(n.date);
				
				System.out.println(n.km);
				
				System.out.println("Total Amount is "+ money);
				
				System.out.println("1) Payment  2) Cancle");
				if(sc.nextInt()==1)
				{
					System.out.println("Enter ammount");
				    double amount=sc.nextDouble();
					if(amount>=money)
					{
						System.out.println("Ticket Has been Book");
					}
					else 
					{
						System.out.println("Enter vallid amount ");
					}
					
				}
				else
				{
					a=null;
					System.out.println("Ticket has been Cancle");
					
				}
				
			}
			else if(r instanceof SeaBirdTravell)
			{
				//Scanner sc=new Scanner(System.in);
				SeaBirdTravell n=(SeaBirdTravell)r;
				int money=n.km*n.price;
				System.out.println(n.from);
				
				System.out.println(n.to);
				
				System.out.println(n.date);
				
				System.out.println(n.km);
				
				System.out.println("Total Amount is "+ money);
				
				System.out.println("1) Payment  2) Cancle");
				if(sc.nextInt()==1)
				{
					System.out.println("Enter ammount");
				    double amount=sc.nextDouble();
					if(amount>=money)
					{
						System.out.println("Ticket Has been Book");
					}
					else 
					{
						System.out.println("Enter vallid amount ");
					}
					
				}
				else
				{
					a=null;
					System.out.println("Ticket has been Cancle");
					
				}
			}
		}
		
		
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		public void details()
		{
			
			if(r instanceof NationalTravell)
			{
				System.out.println(r.from);
				System.out.println(r.to);
				System.out.println(r.date);
				System.out.println(r.km);
			}
			if(r instanceof VRLTravell)
			{
				System.out.println(r.from);
				System.out.println(r.to);
				System.out.println(r.date);
				System.out.println(r.km);
			}
			if(r instanceof SeaBirdTravell)
			{
				System.out.println(r.from);
				System.out.println(r.to);
				System.out.println(r.date);
				System.out.println(r.km);
			}
		}
	
}