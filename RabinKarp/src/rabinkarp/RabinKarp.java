package rabinkarp;

import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author Eliezer Hashimi
 */
public class RabinKarp {

    private final String pattern;
    private final long patternHashValue;
    private final int patternLength;
    private final long largePrime;
    private final int radix;
    private long RM;

    public RabinKarp(String txt, String pat) {
        this.pattern = pat;
        radix = 256;
        patternLength = pat.length();
        largePrime = longRandomPrime();
        RM = 1;
        for (int i = 1; i <= patternLength - 1; i++) {
            RM = (radix * RM) % largePrime;
        }
        patternHashValue = hash(pat, patternLength);
        int position = find(txt);
        if (position == -1) {
            System.out.println("No pattern found");
        } else {
            System.out.println("Pattern starts at index : " + position);
        }
    }

    private long hash(String key, int M) {
        long h = 0;
        for (int i = 0; i < M; i++) {
            h = (radix * h + key.charAt(i)) % largePrime;
        }
        return h;
    }

    private boolean check(String txt, int x) {
        for (int i = 0; i < patternLength; i++) {
            if (pattern.charAt(i) != txt.charAt(x + i)) {
                return false;
            }
        }
        return true;
    }

    private int find(String text) {
        int N = text.length();
        if (N < patternLength) {
            return N;
        }
        long textHash = hash(text, patternLength);
        if ((patternHashValue == textHash) && check(text, 0)) {
            return 0;
        }
        for (int i = patternLength; i < N; i++) {
            textHash = (textHash + largePrime - RM * text.charAt(i - patternLength) % largePrime) % largePrime;
            textHash = (textHash * radix + text.charAt(i)) % largePrime;
            int offset = i - patternLength + 1;
            if ((patternHashValue == textHash) && check(text, offset)) {
                return offset;
            }
        }
        return -1;
    }

    private static long longRandomPrime() {
        BigInteger prime = BigInteger.probablePrime(31, new Random());
        return prime.longValue();
    }

}
