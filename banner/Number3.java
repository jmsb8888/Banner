package banner;

public class Number3 extends MyCharacter {

	public Number3(char value, Size size, char symbol) {
		super(value, size, symbol);
	}
	
	public char[][] generate() {
		new HorizontalStroke(area,symbol).generate(0).generate(area.length/2).generate(area.length-1);
        new VerticalStroke(area,symbol).generate(area.length-1);
		return area;
	}
}
