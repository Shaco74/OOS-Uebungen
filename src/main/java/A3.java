import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;

public class A3 {
    public A3() {

    }

    public ArrayList<Integer> primeFactorization(int pNum) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Queue<Integer> primeNumbers = new LinkedTransferQueue<>();
        for (int i = 2; i < pNum; i++) {
            if (isPrimeNumber(i)) {
                primeNumbers.add(i);
            }
        }

        int num = pNum;

        int factor = primeNumbers.poll();
        while (num > 0 && num >= factor) {
            if (num % factor == 0) {
                res.add(factor);
                num /= factor;
            } else {
                if (!primeNumbers.isEmpty()) {
                    factor = primeNumbers.poll();
                } else {
                    break;
                }
            }

        }
        return res;
    }


    private boolean isPrimeNumber(int pNum) {
        boolean result = true;
        if (pNum < 2) {
            return false;
        }
        for (int i = 2; i < pNum; i++) {
            if (pNum % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
