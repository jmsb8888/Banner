package banner;

public class LetterK extends MyCharacter {

	public LetterK(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	public char[][] generate() {
		new VerticalStroke(area,symbol).generate(0);
		new DiagonalStroke(area,symbol).generate(area.length/2,2);
		new TransversalStroke(area,symbol).generate(area.length/2,2,0);
		return area;
	}

}
