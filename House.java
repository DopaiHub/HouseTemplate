/**
 * House is template class that is extended
 * @author Adam Nguyen
 *
 */
public abstract class House {
	/**
	 * Template calls all the methods
	 */
	public final void buildHouse()
	{
		prepFoundation();
		createFrame();
		installDryWall();
		addWindows();
		addElectrical();
		addPlumbing();
	}
	/**
	 * All methods to create house, prints out their purpose
	 */
	public void prepFoundation()
	{
		System.out.println("Foundation: Adding a crawlspace, and a strong backbone.");
	}
	public void installDryWall()
	{
		System.out.println("Drywall: Creating the interior walls.");
	}
	public void addWindows()
	{
		System.out.println("Windows: Putting in the glass for the windows");
	}
	public void addElectrical()
	{
		System.out.println("Electrical: Running all the wires and hooking up the power");
	}
	public void addPlumbing()
	{
		System.out.println("Plumbing: Letting water run through the base");
	}
	/**
	 * abstract method to be made in child classes
	 */
	public abstract void createFrame();

}
