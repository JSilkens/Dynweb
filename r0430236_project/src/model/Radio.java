package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Radio {
	private String name;
	private ArrayList<Stream>streams = new ArrayList<Stream>();

	public Radio(String name) throws ModelException {
		setName(name);
		
	}

	private void setName(String name) throws ModelException {
		if (name == null || name.equals("")){
			throw new ModelException("You don't have set a name for the radio.");
		}else{
			this.name = name;
		}
			

	}
	
	public String getName(){
		 return this.name = name;
	}
	
	public void addStream(String name , String url) throws ModelException, IOException{
		System.out.println("Adding stream");
		Stream str = new Stream(name,url);
		
		this.streams.add(str);
	}
	
	public Stream getStream(int id){
		return this.getStream(id);
	}
	public int totalStreams(){
		return this.streams.size();
	}
	public List getAllStreams(){
		return this.streams;
	}

}
