package banner;

public class LetterN extends MyCharacter {

	public LetterN(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	public char[][] generate() {
		new VerticalStroke(area,symbol).generate(0).generate(area[0].length-1);
		new DiagonalStroke(area,symbol).generate(0);
		return area;
	}

}
