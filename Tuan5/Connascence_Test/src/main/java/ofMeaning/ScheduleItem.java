package ofMeaning;

public class ScheduleItem {
	public string Flight { get; set; }
	public string Origin { get; set; }
	public string Destination { get; set; }
	public DateTimeOffset DepartureDt { get; set; }
	public DateTimeOffset ArrivalDt { get; set; }
	}
}
