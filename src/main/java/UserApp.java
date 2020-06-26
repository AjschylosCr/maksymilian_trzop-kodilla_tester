public class UserApp {
    public static void main(String[] args) {
        User nikodem = new User("Nikodem", 56);
        User mohammad = new User("Mohammad", 57);
        User longin = new User("Longin", 49);
        User genowefa = new User("Genowefa", 66);
        User ursus = new User("Ursus", 71);
        User ignacjusz = new User("Ignacjusz", 77);
        User klotylda = new User("Klotylda", 49);
        User merkuriusz = new User("Merkuriusz", 95);
        User aretypia = new User("Aretypia", 91);
        User franciszek = new User("Franciszek", 75);

        User[] users = {nikodem, mohammad, longin, genowefa, ursus, ignacjusz, klotylda, merkuriusz, aretypia, franciszek};

        int avg = 0;
        int sum = 0;

        for(User user : users) {
            sum = sum + user.getAge();
// 1 krok sum = 0 + wiek_pierwszego_usera;
// po 1 kroku suma = wiek_pierwszego_usera;
// 2 krok suma = wiek_pierwszego_usera + wiek_drugiego
        }

        avg = sum/users.length;

        for(User user1 : users) {
            if(user1.getAge() < avg){
                System.out.println(user1.getName() + " " + " ma mniej lat niż " + avg);
            }
        }
    }
}