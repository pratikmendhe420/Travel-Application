class VRLTravell extends RedBus
{
	int price=14;
	VRLTravell(String from,String to,String date,int km)
	{
		super(from,to,date,km);
	}
	VRLTravell(String date)
		{
			super(date);
		}
	
}