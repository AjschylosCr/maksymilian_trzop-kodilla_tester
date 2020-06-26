import java.util.Scanner;

public class Colors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą literę koloru");
        String pierwszaLitera = scan.nextLine();

        //Switch
        switch (pierwszaLitera) {
            case "p":
                System.out.println("pastelowy");
                break;
            case "f":
                System.out.println("fioletowy");
                break;
            case "t":
                System.out.println("turkusowy");
                break;
            case "m":
                System.out.println("morski");
                break;
            default:
                System.out.println("nie znam koloru na tę literę");
        }
    }
}
