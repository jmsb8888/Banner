package banner;

public class LetterÑ extends MyCharacter {

	public LetterÑ(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	public char[][] generate() {
		new DiagonalStroke(area,symbol).generate(0);
		new VerticalStroke(area,symbol).generate(0).generate(area[0].length-1);
		new HorizontalStroke(area,' ').generate(1).generate(2);
		new EmptyPoints(area,symbol).generate4(2,0,2).generate4(2,area[0].length-1,2);
		new HorizontalStroke(area,symbol).generate(0);
		return area;
	}

}
