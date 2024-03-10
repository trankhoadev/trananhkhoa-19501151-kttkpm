package ofMeaning;

public class Itierary {
	private readonly IList<ScheduleItem> _scheduleItems;
	public int BookItinerary()
	{
	var bookingService = new FlightBookingService();
	foreach (var scheduleItem in _scheduleItems)
	{
	var status = bookingService.BookFlight(
	scheduleItem.Flight,
	scheduleItem.DepartureDt);
	// Check if BookFlight completed successfully by
	// comparing retuned result against string value.
	if (status != "SUCCESS")
	{
	return 1;
	}
	}
	return 0;
	}
}
