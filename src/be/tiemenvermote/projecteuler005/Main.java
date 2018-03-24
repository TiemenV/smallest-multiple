package be.tiemenvermote.projecteuler005;

public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(smallestMultiple(20));
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime + "ms");
    }

    private static int smallestMultiple(int number) {
        int smallestNumber = 0;
        int currentNumber = number;

        while (currentNumber != smallestNumber) { //if this isn't true, we found the smallest multiple
            smallestNumber = currentNumber;
            for (int i = 2; i <= number; i++) {
                if (currentNumber % i != 0) { //it means it is not divisable by a nr in the range
                    currentNumber++;
                    break;
                }

            }
        }


        return smallestNumber;
    }


}
