package banner;

public class Number5 extends MyCharacter{

	public Number5(char value, Size size,char symbol) {
		super(value, size,symbol);
	}
	
	public char [][] generate() {
		new HorizontalStroke(area, symbol).generate(0).generate(area.length/2).generate(area.length-1);
		new VerticalStroke(area, symbol).generate(0).generate(area.length-1);
		new EmptyPoints(area, ' ').generate4(1, area.length-1, (area.length/2)-1).generate4((area.length/2)+1, 0, area.length-2);
		return area;
	}
}
