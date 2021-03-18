package banner;

/**
 * crea el numero 4 en una matriz
 * @author grupo 3
 *
 */
public class Number4 extends MyCharacter{

	public Number4(char value, Size size, char symbol) {
		super(value, size, symbol);
	}
	
	/**
     * llama a los metodos que crean el trazo horizontal y vertical e indica las posiciones en las cuales estos deben hacer el llenado de la matris
     * llama metodos que borran trazos en la mitad baja de la izquierda de la matriz
     * @return la matriz llena formando la letra A
     */
    @Override
	public char[][] generate() {
		new HorizontalStroke(area,symbol).generate(area.length/2);
        new VerticalStroke(area,symbol).generate(0).generate(area[0].length-1);
        new EmptyPoints(area, ' ').generateVertical((area.length/2)+1, 0, area.length-1 );
		return area;
	}
}
