public class ThreeLetters {

/* Write a function solution that, given two integers A and B,
  returns a string containing exactly A letters 'a' and exactly B letters 'b'
  with no three consecutive letters being the same (in other words, neither "aaa"
  nor "bbb" may occur in the returned string).

  Examples:1. Given A = 5 and B = 3, your function may return "aabaabab". Note that "abaabbaa"
    would also be a correct answer.
    Your function may return any correct answer.*/

        public static void main (String ars[]) {
            String rt = "";
            int A=4, B=3;

            while (0 < A || 0 < B)
            {

                // More 'b', append "bba"
                if (A < B)
                {
                    if (0 < B--)
                    {
                        rt += ('b');
                    }
                    if (0 < B--)
                    {
                        rt += ('b');
                    }
                    if (0 < A--)
                    {
                        rt += ('a');
                    }
                }

                // More 'a', append "aab"
                else if (B < A)
                {
                    if (0 < A--)
                    {
                        rt += ('a');
                    }
                    if (0 < A--)
                    {
                        rt += ('a');
                    }
                    if (0 < B--)
                    {
                        rt += ('b');
                    }
                }
                // Equal number of 'a' and 'b'
                // append "ab"
                else
                {
                    if (0 < A--)
                    {
                        rt += ('a');
                    }
                    if (0 < B--)
                    {
                        rt += ('b');
                    }
                }
            }

            System.out.println(rt);
        }
    }

