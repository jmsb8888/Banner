package banner;

/**Borra puntos para hacer trazos medios
 * @author grupo 3
 *
 */
public class EmptyPoints extends Stroke{
        /**
         * constructor heredado de la clase stroke
         * @param area
         * @param symbol
         */
        public EmptyPoints(char[][] area, char symbol) {
            super(area, symbol);
        }
        
        @Override
        public EmptyPoints generate(int pos) {
                area[pos][area.length-1] = symbol;
            return this;
        }
    public EmptyPoints generate1(int pos) {
        area[pos][0] = symbol;
        return this;
    }
    
    public EmptyPoints generateHorizontal(int row, int columnInitial, int columnFinal){
        for (int i = columnInitial; i <= columnFinal; i++) {
            area[row][i]=symbol;
        }
        return this;
    }
    public EmptyPoints generateVertical(int rowInitial, int column, int rowFinal){
        for (int i = rowInitial; i <= rowFinal; i++) {
            area[i][column]=symbol;
        }
        return this;
    }
    
    
}
