package ofExecution;

public class Barista {
	// Sequence of basic steps is implemented as template method.
	public void Brew(ICoffee coffee)
	{
	Grind();
	coffee.Prepare();
	TurnOnMachine();
	Wait();
	coffee.AddExtras();
	Serve();
	}
	private void Grind() { }
	private void TurnOnMachine() { }
	private void Wait() { }
	private void Serve() { }
}
