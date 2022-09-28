import java.util.ArrayList;

public class A5 {
    public ArrayList<Integer> fibbonacci(int pNum) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(0);
        res.add(1);
        for (int i = 1; i <= pNum; i++) {
            res.add(res.get(res.size() - 2) + res.get(res.size() - 1));
        }
        return res;
    }

    public void printFib(ArrayList<Integer> pArr) {
        for (int i = 2; i < pArr.size(); i++) {
            System.out.println(pArr.get(i) + " -> " + pArr.get(i - 1));
        }
    }

    public void printMatrix() {
        /*
            a[i][j] = 10*i + j und
            b[i][j] = i + 10*j
         */
        int ROWS = 5;
        int COLUMNS = 5;
        int[][] a = new int[ROWS][COLUMNS];
        int[][] b = new int[ROWS][COLUMNS];
        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                a[column][row] = 10 * column + row;
                b[column][row] = column + row * 10;
            }
        }

        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                System.out.println(b[column][row]);
            }
        }


    }

}
