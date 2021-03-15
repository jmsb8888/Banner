package banner;

public class LetterZ extends MyCharacter {

	public LetterZ(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	public char[][] generate() {
		new HorizontalStroke(area,symbol).generate(0).generate(area.length-1);
		new TransversalStroke(area,symbol).generate(8);
		return area;
	}

}
