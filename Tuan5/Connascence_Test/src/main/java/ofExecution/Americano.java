package ofExecution;

public class Americano : ICoffee {
	public void Prepare()
	{
	AddCoffee();
	AddWater(); 
	}
	public void AddExtras() { }
	private void AddCoffee() { }
	private void AddWater() { }
}
