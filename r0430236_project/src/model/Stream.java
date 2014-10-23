package model;

import java.io.*;
import java.net.*;

public class Stream {
	private String stationName;
	private String url;
	private String description;
	private double rating = -1;
	
	public Stream(String stationName , String url)throws ModelException, IOException{
		setStationName(stationName);
		setUrl(url);
	}
	public Stream(String stationName , String url , String description)throws ModelException, IOException{
		setStationName(stationName);
		setUrl(url);
		setDescription(description);
	}
	public Stream(String stationName , String url , String description, double rating)throws ModelException, IOException{
		setStationName(stationName);
		setUrl(url);
		setDescription(description);
		setRating(rating);
	}
	public void setRating(double rating)throws ModelException {
		if(rating < 0){
			throw new ModelException("Rating cannot be smaller than zero.");
		}else if(rating > 10){
			throw new ModelException("Rating cannot be higher than then.");
		}else{
			this.rating = rating;
		}
		
	}
	public void setDescription(String description)throws ModelException {
		if(description == null || description.equals("")){
			throw new ModelException("You have entered an empty description.");
		}
		
	}
	
	//TODO do more url checking
	public void setUrl(String url)throws ModelException, IOException {
		
		// Check if url is not empty
		if(url == null || url.equals("")){
			throw new ModelException("You have entered an empty url.");
		}
		
		//Shrink the url to hostname/ipadress
		//shrinkURL(url);
		URL u = new URL(url);
		HttpURLConnection huc =  ( HttpURLConnection )  u.openConnection (); 
		huc.setRequestMethod ("GET");  //OR  huc.setRequestMethod ("HEAD"); 
		huc.connect () ; 
		int code = huc.getResponseCode() ;
		
		//TODO Make exception if code <> 200
		System.out.println(code);

		this.url = url;
	}
	private String shrinkURL(String url) {
		
		return null;
		
	}
	public void setStationName(String stationName)throws ModelException {
		if(stationName == null || stationName.equals("")){
			throw new ModelException("You have entered an empy station name");
		}else{
			this.stationName = stationName;
		}
		
	}
	
	public String getUrl(){
		return this.url;
	}
	
	public String getStationName(){
		return this.stationName;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public String getRating(){
		if (this.rating == -1){
			return "No rating yet";
		}else{
			return ""+ this.rating;
		}
	}
	
	
	
	

}
