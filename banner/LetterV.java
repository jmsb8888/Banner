package banner;

public class LetterV extends MyCharacter {

	public LetterV(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	public char[][] generate() {
		new DiagonalStroke(area,symbol).generate(4,0);
		new TransversalStroke(area,symbol).generate(7,5,4);
		new VerticalStroke(area,symbol).generate(0).generate(area[0].length-1);
		new EmptyPoints(area, ' ').generate4(5,0, area.length-1).generate4(5,area[0].length-1, area.length-1);
		return area;
	}

}
