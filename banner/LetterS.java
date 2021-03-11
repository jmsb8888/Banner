package banner;

public class LetterS extends MyCharacter {

	public LetterS(char value, Size size,char symbol) {
		super(value, size,symbol);
	}
	
	public char [][] generate() {
		new HorizontalStroke(area, symbol).generate(0).generate(area.length/2).generate(area.length-1);
		new VerticalStroke(area, symbol).generate(0).generate(area.length-1);
		
		return area;
	}
}
