package banner;

public class Number9 extends MyCharacter{

	public Number9(char value, Size size,char symbol) {
		super(value, size,symbol);
	}
	
	public char[][] generate() {
		new HorizontalStroke(area, symbol).generate(0).generate(area.length-1).generate(area.length/2);
		new VerticalStroke(area, symbol).generate(0).generate(area.length-1);
		new EmptyPoints(area, ' ').generateVertical((area.length/2)+1, 0, area.length-2);
		return area;
	}
}
