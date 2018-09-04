public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrime(6));

        int[] myArray = {4,5,11,2,6,7,3,8};

        for (int i=0;i<myArray.length; i++){
            if (isPrime(myArray[i])){
                System.out.println(i+" is a Prime Number!");
            }
        }
    }

    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
