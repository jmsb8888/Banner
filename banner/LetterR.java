package banner;

public class LetterR extends MyCharacter {

	public LetterR(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	public char[][] generate() {
		new HorizontalStroke(area, symbol).generate(0).generate(area.length/2);
		new VerticalStroke(area, symbol).generate(0).generate(area.length-1);
		new EmptyPoints(area, ' ').generate4((area.length/2), area[0].length-1, area.length-1);
		new DiagonalStroke(area, symbol).generate(area.length/2,1);
		return area;
	}

}
