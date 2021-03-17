package banner;

public class Number6 extends MyCharacter{

	public Number6(char value, Size size, char symbol) {
		super(value, size, symbol);
	}
	
	public char [][] generate() {
		new HorizontalStroke(area, symbol).generate(0).generate(area.length/2).generate(area.length-1);
		new VerticalStroke(area, symbol).generate(0).generate(area.length-1);
		new EmptyPoints(area, ' ').generateVertical(1, area.length-1, (area.length/2)-1);
		return area;
	}
}
