import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        /* a sorting algorithm? what do i need? */
        int[] sigmaArray;
        sigmaArray = new int[]{25,31,66,3,99,23,48,52,81};
        System.out.println(Arrays.toString(sigmaArray));
        /* nice one!*/
        boolean sorted = false;
        int wall = 1;
        while (!sorted) {
            while ( wall < 72)
                for (int i = 0; i < sigmaArray.length - 1; i++) {;
                    if (sigmaArray[i] > sigmaArray[i + 1]) {
                        int hold;
                        hold = sigmaArray[i + 1];
                        sigmaArray[i + 1] = sigmaArray[i];
                        sigmaArray[i] = hold;
                        wall++;
                        System.out.println(Arrays.toString(sigmaArray));
                        sorted = true;
                    }
                }
        }
    }
}