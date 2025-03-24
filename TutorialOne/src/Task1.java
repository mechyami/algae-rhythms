import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        /* a sorting algorithm? what do i need? */
        int[] sigmaArray;
        sigmaArray = new int[]{25,31,66,3,99,23,48,52,81};
        /*array from pptx*/
        System.out.println(Arrays.toString(sigmaArray));
        /*to see array*/
        boolean sorted = false;
        /*we can change this to true once its sorted*/
        int wall = 1;
        /*ooooh the wall*/
        while (!sorted) {
            while ( wall < 64)
                /*double while loop. We want sorted to be true,
                but we want to loop through the array as many times as it takes to
                sort the list
                idk how 64 works, it should be (n-1) passes
                this is 8*8
                8 passes needed, 8 times to check each number?
                 */
                for (int i = 0; i < sigmaArray.length - 1; i++) {;
                    if (sigmaArray[i] > sigmaArray[i + 1]) {
                        /*
                        hold is a middle man here. we cant equate the two values, since it will replace the other
                        eg, if x = 8 and y = 3 then x = y, then x now equals 3
                         */
                        int hold;
                        hold = sigmaArray[i + 1];
                        sigmaArray[i + 1] = sigmaArray[i];
                        sigmaArray[i] = hold;
                        /*
                        this swaps the values
                         */
                        wall++;
                        System.out.println(Arrays.toString(sigmaArray));
                        sorted = true;
                    }
                }
        }
    }
}