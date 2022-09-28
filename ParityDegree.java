public class ParityDegree {

/* A positive integer N is given. The goal is to find the highest
  power of 2 that divides N. In other words, we have to find the
  maximum K for which N modulo 2^K is 0.

  Example : given integer N = 24 the answer is 3, because 2^3 = 8 is
  the highest power of 2 that divides N.*/

        public static void main (String ars[]) {
           int num = 24;
            int count =0;

            while(num > 0){
                if (num%2==0) {
                    count++;
                }
                num = num/2;
            }

            System.out.println(count);
        }
    }

