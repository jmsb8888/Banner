package banner;

public class Number4 extends MyCharacter{

	public Number4(char value, Size size, char symbol) {
		super(value, size, symbol);
	}
	
	public char[][] generate() {
		new HorizontalStroke(area,symbol).generate(area.length/2);
        new VerticalStroke(area,symbol).generate(0).generate(area[0].length-1);
        new EmptyPoints(area, ' ').generate4((area.length/2)+1, 0, area.length-1 );
		return area;
	}
}
