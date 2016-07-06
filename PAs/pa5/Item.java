package pa5;

public class Item {

	String name;
	int id;
	String description;
	double price;
	
	public Item(){		
	}
	
	public Item(String name, int id, String description, double price){
		this.name = name;
		this.id = id;
		this.description = description;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
