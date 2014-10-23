package domain;

public class LetterCounter {
	
	
	public LetterCounter(){
		
	
	}
	
	public int countLetters(String word , char c)throws IllegalArgumentException{
		if(word == null || word.equals("")){
			throw new IllegalArgumentException("No word was entered");
		}else if(word.length() > 0){
			int count = 0 ;
			for(int i = 0 ; i< word.length() ; i ++){
				if(word.charAt(i) == c){
					count++; 
				}
				
			}
			return count;
		}
		return 0;
	}
	
	

}
