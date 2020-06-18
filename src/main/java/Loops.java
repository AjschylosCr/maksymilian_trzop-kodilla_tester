public class Loops {
    public static void main(String[] args) {
        int [] tablica = {1,2,3,4};
        sumNumbers(tablica);
        System.out.println(sumNumbers(tablica));
        for (int i = 0; i <= 10; i++)
            System.out.println(i);
        }
    public static int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }
}