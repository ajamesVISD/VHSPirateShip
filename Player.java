

public class Player {

	private String name;
	private String mood;
	private double height;
	private String hairColor;
	private String eyeColor;

	private Location current;
	private double health = 100.00;
	
	public Player(String name) {
		this.name  = name;
	}

	public void changeLocation(Location next) {
		this.current = next;
	}
	
	public void changeHealth(double change)
	{
		health+=change;
	}
	
	public String toString() {
		return "This player is named " + name+ ".";
	}
	
	public String where()
	{
		return current.toString();
	}
	
	public Location getLocation()
	{
		return current;
	}
}
