package mobile;

public class Mobile {
private String name;
private String model;
private int ram;
private double price;
private String colour;

private Sim sim;

public void mob() {
	System.out.println(name);
	System.out.println(model);
	System.out.println(ram);
	System.out.println(price);
	System.out.println(colour);
	System.out.println("....................");
	sim.sm();
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public int getRam() {
	return ram;
}

public void setRam(int ram) {
	this.ram = ram;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
}

public Sim getSim() {
	return sim;
}

public void setSim(Sim sim) {
	this.sim = sim;
}

}
