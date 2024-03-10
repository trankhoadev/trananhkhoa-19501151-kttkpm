package ofExecution;

public class Cappuccino : ICoffee {
	public void Prepare()
	{
	PressCoffee();
	AddWater();
	AddMilk();
	}
	public void AddExtras()
	{
	MakeCinnamonPrint();
	}
	private void PressCoffee() { }
	private void AddWater() { }
	private void AddMilk() { }
	private void MakeCinnamonPrint() { }
	
}
