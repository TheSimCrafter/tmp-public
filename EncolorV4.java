/**
 * EncolorVEnd Final meine unschreibung
 */
public class EncolorV4 {

    
    boolean[][] a;  //Adjazenzmatrix
    int[] c;  //Farben

    public EncolorV4(boolean[][] pArray, int[] pColors) {
        a = pArray;
        c = pColors;
    }

    public boolean run(int pAmC) {
        return encolor(pAmC, 0);
    }

    public boolean encolor(int amC, int current) {
        if (current == a.length) {
            return true;
        }
        
        for (int i = 1; i <= amC; i++) {
            if (canContinue(i, current)) {
                c[current] = i;

                if (encolor(amC, current+1)) {
                    return true;
                }

                c[current] = 0;
            }
        }
        return false;
    }

    public boolean canContinue(int col, int current) {
        for (int i = 0; i < a.length; i++) {
            if (a[current][i] && c[i] == col) {
                return false;
            }
        }
        return true;
    }
}