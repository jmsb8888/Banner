package banner;

public class LetterW extends MyCharacter {

	public LetterW(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	public char[][] generate() {
		new DiagonalStroke(area,symbol).generate(4,4);
		new TransversalStroke(area,symbol).generate(7,1,4);
		new VerticalStroke(area,symbol).generate(0).generate(area[0].length-1);
		return area;
	}

}
