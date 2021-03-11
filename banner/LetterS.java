package banner;

public class LetterS extends MyCharacter {

	public LetterS(char value, Size size,char symbol) {
		super(value, size,symbol);
	}
	
	public char [][] generate() {
		new HorizontalStroke(area, symbol).generate(0).generate(area.length/2).generate(area.length-1);
		new VerticalStroke(area, symbol).generate(0).generate(area.length-1);
		new EmptyPoints(area, ' ').generate4(1, area[0].length-1,area.length/2).generate4((area.length/2)+1, 0, area.length-2);
		return area;
	}
}
