public class BinaryGap {
 /* Codility :https://app.codility.com/programmers/lessons/1-iterations/binary_gap/#:~:text=A%20binary%20gap%20within%20a,binary%20gap%20of%20length%202.*/

        public static void main (String ars[]) {
            int N=1041;
            String binaryStr = Integer.toBinaryString(N);
            String[] gaps = binaryStr.replaceAll("0+$","").split("1");


            int maxLength = 0;
            for (String gap: gaps) {
                if (gap.length() > 0 && gap.length() > maxLength) {
                    maxLength = gap.length();
                }
            }
            System.out.println("binaryGap is --->"+maxLength);
        }
    }

