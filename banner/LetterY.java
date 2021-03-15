package banner;

public class LetterY extends MyCharacter {

	public LetterY(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	public char[][] generate() {
		new DiagonalStroke(area,symbol).generate(0);
		new DiagonalStroke(area, ' ').generate(5,5);
		new TransversalStroke(area,symbol).generate(3,5);
		new VerticalStroke(area,symbol).generate(area.length/2);
		new EmptyPoints(area, ' ').generate4(0,area[0].length/2,3);
		return area;
	}

}
