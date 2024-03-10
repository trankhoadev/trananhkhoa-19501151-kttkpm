package ofMeaning;

public class FlightBookingService {
	private static readonly Random _rand = new Random();
	public string BookFlight(string flight, DateTimeOffset departureDt)
	{ 
	if (_rand.NextDouble() > 0.95)
	{
	return "FAILURE";
	}
	return "SUCCESS";
	}
}
