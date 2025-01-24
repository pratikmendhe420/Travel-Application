class NationalTravell extends RedBus
{
	int price=12;
	NationalTravell(String from,String to,String date,int km)
	{
		super(from,to,date,km);
	}
		NationalTravell(String date)
		{
			super(date);
		}
	
}