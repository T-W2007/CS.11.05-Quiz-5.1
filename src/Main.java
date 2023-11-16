public class Main {

    public static int[] combine( int[] array1, int[] array2) {
        int len = array1.length;
        int[] output = new int[len+array2.length];
        for (int i = 0; i<len;i++) {
            output[i] = array1[i];
        }
        for (int i = len;i<len+array2.length;i++) {
            output[i] = array2[i-len];
        }

        return output;

    }

    public static int[] zip(int[] array1, int[] array2) {
        int[] output = new int[array1.length+array2.length];
        int one = 0;
        int two = 0;
        for (int i = 0; i<array1.length+array2.length; i++) {
            if (i%2 == 0) {
                output[i] = array1[one];
                one = one+1;
            }
            else {
                output[i] = array2[two];
                two = two+1;
            }
        }
        return output;
    }
    public static int[] product(int[] array1, int[] array2) {
        int[] a = new int[array1.length];
        for (int i = 0; i<array1.length;i++) {
            a[i] = array1[i]*array2[i];
        }
        return a;

    }

    public static int[] capitalCount(String[] words) {
        int[] numb = new int[words.length];
        for (int i = 0; i< words.length; i++) {
            numb[i] = countCapitalLetters(words[i]);
        }

        return numb;
    }

    public static int countCapitalLetters(String word) {
        int numb = 0;
        for (int i = 0; i<word.length();i++) {
            char x = word.charAt(i);
            int y  = (char) x;
            if (y<91 && y>64) {
                numb = numb + 1;
            }
        }

        return numb;

    }

}
