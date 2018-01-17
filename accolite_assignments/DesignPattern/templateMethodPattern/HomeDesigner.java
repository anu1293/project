package templateMethodPattern;

public abstract class HomeDesigner {

	final void designHome() // Template method is final so that it cannot be overridden
	{
		designStructure();
		designWalls();
		designDoors();
		designWindows();
		designFurnishing();
		designGarrage();
	}
	abstract void designStructure();
	abstract void designWalls();
	abstract void designDoors();
	abstract void designWindows();
	abstract void designFurnishing();
	public void designGarrage()
	{
		System.out.println(" 12by5 Garrage Designed");
	}
}
