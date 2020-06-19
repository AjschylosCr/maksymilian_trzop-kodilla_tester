public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook= new Notebook("600g",1000, 2016);
        System.out.println(notebook.weight + " " + notebook.price + notebook.year);
        notebook.checkPrice();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook("2000g", 1500, 2020);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook( "1600g", 500, 1999);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkYear();

    }
}