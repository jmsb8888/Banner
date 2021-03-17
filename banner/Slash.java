package banner;

public class Slash extends MyCharacter {

	public Slash(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	public char[][] generate() {
		new TransversalStroke(area,symbol).generate(area[0].length-1);
		return area;
	}

}
