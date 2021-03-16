package banner;

public class LetterX extends MyCharacter {

	public LetterX(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	public char[][] generate() {
		new DiagonalStroke(area,symbol).generate(0);
		new TransversalStroke(area,symbol).generate(area[0].length-1);
		return area;
	}

}
