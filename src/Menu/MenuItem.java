package Menu;

public abstract class MenuItem {
	protected double price;
	protected String name;
	
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + "Price: " + this.price;
	}

}
