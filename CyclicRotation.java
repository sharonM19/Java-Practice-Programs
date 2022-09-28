public class CyclicRotation {

    /* https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/ */

    public static void main (String ars[]) {
      int[] A = {3, 8, 9, 7, 6};
      int K = 3; //no of rotations

        int arrLength = A.length;
        int[] rotatedArr = new int[arrLength];

        for(int i=0;i<arrLength;i++){
            rotatedArr[(i+K)% arrLength] = A[i];
        }

        for(int j=0;j<arrLength;j++)
        System.out.println(rotatedArr[j]);
    }
}
