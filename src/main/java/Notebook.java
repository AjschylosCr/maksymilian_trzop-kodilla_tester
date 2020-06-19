public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        }
        if (this.price >= 600 && this.price <= 1000) {
            System.out.println("This price is good");
        }
        if (this.price > 1000) {
            System.out.println("This notebook is quite expensive");
        }
    }

    public void checkYear() {
        if (this.year < 2016) {
            System.out.println("This notebook is pretty old");
        }
        if (this.year >= 2016 && this.year <=2020){
            System.out.println("This notebook is not that old");
        }
        if (this.year > 2020){
            System.out.println("This notebook is pretty new");
        }
    }

    public void checkWeight() {
        if (this.weight < "600") {
            System.out.println("This notebook is very light");
        }
        if (this.weight >= "600" && this.weight <= "2000") {
            System.out.println("This notebook is not that heavy");
        }
        if (this.weight < "2000") {
            System.out.println("This notebook is heavy");
        }
    }
}
