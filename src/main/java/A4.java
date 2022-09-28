import java.math.BigInteger;

public class A4 {
    /*
        fak(1) = 1
        fak(n) = n * fak(n-1) für n>1
    */

    public A4() {
        System.out.println("Aufgabe 4");
        System.out.println(fak(40));
        System.out.println(iterativFak(40));
        // b)   265252859812191058636308480000000
        // c)   Der Wert hat "komische" Nullen am Ende, da mit BigInteger gearbeitet wird.
        //      Es handelt sich um einen zuerwartenden Präzisionsfehler -> Prozessor ist maximal 64 Bit
    }

    public BigInteger fak(int pNum) {
        if (pNum > 1) {
            BigInteger res = new BigInteger(String.valueOf(pNum));
            res = res.multiply(fak(pNum - 1));
            return res;
        } else {
            return new BigInteger(String.valueOf(1));
        }
    }

    public BigInteger iterativFak(int pNum) {
        BigInteger res = new BigInteger("1");
        for (int i = 2; i <= pNum; i++) {
            BigInteger tmp = new BigInteger(String.valueOf(i));
            res = res.multiply(tmp);
        }
        return res;
    }
}
