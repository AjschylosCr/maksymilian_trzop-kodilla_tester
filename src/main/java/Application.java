public class Application {
    public static void main(String[] args) {
        AppUser user1 = new AppUser("Adam", 40.5, 159);
        AppUser user2 = new AppUser("Wojtek", 30, 190);
        AppUser user3 = new AppUser("Janusz", 22, 144);

        printUserData(user1);
        printUserData(user2);
        printUserData(user3);
    }

    private static void printUserData(AppUser user) {
        if (user.getAge() > 30) {
            System.out.println("User " +user.getName()+ " is older than 30");
        } else {
            System.out.println("User " +user.getName()+ " is older than 30");
        }
        if (user.getHeight() > 160) {
            System.out.println("User " +user.getHeight()+ " is taller than 160");
        } else {
            System.out.println("User " +user.getHeight()+ " is shorter than 160");
        }
    }
}
