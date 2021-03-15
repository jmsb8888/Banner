package banner;

public class LetterV extends MyCharacter {

	public LetterV(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	public char[][] generate() {
		new DiagonalStroke(area,symbol).generate(0);
		new TransversalStroke(area,symbol).generate(8);
		return area;
	}

}
