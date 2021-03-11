package banner;

public class Number1 extends MyCharacter{

	public Number1(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	public char[][] generate() {
		new HorizontalStroke(area, symbol).generate(0).generate(area.length-1);
		new VerticalStroke(area, symbol).generate(area.length/2);
		new EmptyPoints(area, ' ').generate3(0, (area.length/2)+1, area.length-1);
		return area;
	}
}
