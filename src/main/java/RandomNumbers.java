public class RandomNumbers {
    public static void main(String[] args) {
        runSimulation(7);
    }

    public static void runSimulation(int n) {
        int sum = 0;
        java.util.Random rand = new java.util.Random();
        for (int i = 1; i <= n; i++) {
            int sim = rand.nextInt(30);
            sum = sum + sim;
            System.out.print(sim);
        }

        System.out.println();
        System.out.println("Total = " + sum);
    }
}