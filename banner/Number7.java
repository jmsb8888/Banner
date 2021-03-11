package banner;

public class Number7 extends MyCharacter{

	public Number7(char value, Size size,char symbol) {
		super(value, size,symbol);
	}
	public char [][] generate() {
		new HorizontalStroke(area, symbol).generate(0);
		new VerticalStroke(area, symbol).generate(area.length-1);
		return area;
	}
}
