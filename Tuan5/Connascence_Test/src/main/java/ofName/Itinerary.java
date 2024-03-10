package ofName;

public class Itinerary {

	// 2. If we rename ScheduleItem class we will have to change
	// the class name here to make code compilable.
	// 3. We may also need to change _scheduleItems field names
	// to keep it consistent with the ScheduleItem class name.
	private readonly IList<ScheduleItem> _scheduleItems;
	public void Print()
	{
	foreach (var item in _scheduleItems)
	{
	// 4. If we change Print methond name, we will have to
	// change it in this line as well. 
	Console.WriteLine(item.Print());
	}
	}
}
