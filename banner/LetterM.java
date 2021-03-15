package banner;

public class LetterM extends MyCharacter {

	public LetterM(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	public char[][] generate() {
		new VerticalStroke(area,symbol).generate(0).generate(area.length-1);
		new DiagonalStroke(area,symbol).generate(0,0);
		new DiagonalStroke(area, ' ').generate(area.length/2,(area[0].length/2));
		//new TransversalStroke(area,symbol).generate(8);
		new TransversalStroke(area,symbol).generate((area.length)/2,area[0].length/2,0);
		new EmptyPoints(area, symbol).generate(area.length-1);
		
		return area;
	}

}
