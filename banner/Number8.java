package banner;

public class Number8 extends MyCharacter{

	public Number8(char value, Size size,char symbol) {
		super(value, size,symbol);
	}
	
	public char[][] generate() {
		new HorizontalStroke(area, symbol).generate(0).generate(area.length-1).generate(area.length/2);
		new VerticalStroke(area, symbol).generate(0).generate(area.length-1);
		return area;
	}
}
