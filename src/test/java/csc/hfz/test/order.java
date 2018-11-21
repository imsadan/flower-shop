package csc.hfz.test;

public class order {
  private int id;
  private String name;
  
  
public order(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public order(int id) {
	super();
	this.id = id;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
  
}
