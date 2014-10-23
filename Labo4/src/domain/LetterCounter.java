package domain;

public class LetterCounter {
	private int word;

	public LetterCounter() {

	}

	public int CountCertainLetters(char l, String w)
			throws IllegalArgumentException {
		int c = 0; // counter

		if (l == ' ') {
			throw new IllegalArgumentException(
					"You don't have entered a letter!");
		} else if (w == null) {
			throw new IllegalArgumentException("You dont have entered a word!");
		} else {
			for (int i = 0; i < w.length(); i++) {
				if (w.charAt(i) == l) {
					c++;
				}
			}
		}
		return c;

	}

}
