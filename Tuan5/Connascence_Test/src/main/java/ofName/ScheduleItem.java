package ofName;

public class ScheduleItem {
	public string Flight;
	public string Origin ;
	public string Destination; 
	public DateTimeOffset DepartureDt; 
	public DateTimeOffset ArrivalDt ;
	 
	
	public string Print()
	{
	// 1. We are referring properties here.
	// If a property name chages, we have to change it
	// in this line as well.
	return $"Flight {Flight} from {Origin} on {DepartureDt} to {Destination} on 
	{ArrivalDt}";
	}

}
