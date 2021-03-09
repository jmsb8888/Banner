package banner;

public class EmptyPoints extends Stroke{
        public EmptyPoints(char[][] area, char symbol) {
            super(area, symbol);
        }


        @Override
        public EmptyPoints generate(int pos) {
                area[pos][area.length-1] = symbol;
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
}
