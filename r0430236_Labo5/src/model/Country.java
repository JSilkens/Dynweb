package model;

public class Country {
	private String name;
	
	public Country(String name){
		setName(name);
	}

	private void setName(String name) {
		this.name = name;
		
	}
	
	public String getName(){
		return this.name;
	}

}
