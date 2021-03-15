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
        public EmptyPoints generate2(int pos, int pos2){
            area[pos][pos2]=symbol;
            return this;
        }
    public EmptyPoints generate3(int pos, int pos2, int pos3){
        for (int i = pos2; i <= pos3; i++) {
            area[pos][i]=symbol;
        }
        return this;
    }
    public EmptyPoints generate4(int pos, int pos2, int pos3){
        for (int i = pos; i <= pos3; i++) {
            area[i][pos2]=symbol;
        }
        return this;
    }
    public EmptyPoints generate5(int pos){
        for (int i = pos; i < area.length; i++) {
            for (int j = pos; j <area[0].length; j++) {
                if(i==j)
                    area[i][j] = symbol;
            }

        }
        return this;
    }
}
