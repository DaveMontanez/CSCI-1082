package pa5;

public class Item {

	int uid;
	String name;
	String description;
	double price;
	
	public Item(){		
	}
	
	public Item(int uid, String name, String description, double price){
		
		this.uid = uid;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUID() {
		return uid;
	}
	public void setUID(int uid) {
		this.uid = uid;
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
	
	public String toString(){
		return "\n " + this.uid + " " + this.name + " " + this.description 
						+ "  " + price;		
	}

	//Required method when implementing Comparable. Compares UID between objects.
	public int compareTo(Item newItem){
		Integer newUID = newItem.getUID();
		Integer currentUID = this.getUID();
		int compareInt = newUID.compareTo(currentUID);
		if (compareInt < 0){
			return 1;				
		} else if (compareInt > 0) {
			return -1;				
		} else return 0;				
	}
}
