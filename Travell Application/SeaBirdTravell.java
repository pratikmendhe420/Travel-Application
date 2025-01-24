class  SeaBirdTravell extends RedBus
{
	int price=17;
	SeaBirdTravell(String from,String to,String date,int km)
	{
		super(from,to,date,km);
	}
	SeaBirdTravell(String date)
		{
			super(date);
		}
}