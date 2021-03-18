package banner;

/**
 * crea la letra Z en una matriz
 * @author grupo 3
 *
 */
public class LetterZ extends MyCharacter {

	public LetterZ(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	/**
	 * llama los metodos que crean trazos horizontales en los extremos tambien llama al metodo que genera un trazo diagonal desde la derecha a la izquierda
	 * @return la matriz lllena formando la letra Z
	 */
	@Override
	public char[][] generate() {
		new HorizontalStroke(area,symbol).generate(0).generate(area.length-1);
		new TransversalStroke(area,symbol).generate(8);
		return area;
	}

}
