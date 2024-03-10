package ofType;

public class ScheduleItem {
	public string Flight { get; set; }
	public string Origin { get; set; }
	public string Destination { get; set; }
	public DateTimeOffset DepartureDt { get; set; }
	public DateTimeOffset ArrivalDt { get; set; }
	public string Print()
	{
	return $"Flight {Flight} from {Origin} on {DepartureDt} to {Destination} on 
	{ArrivalDt}";
	}
}
