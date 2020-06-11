public class LeapYear {
public static void main(String[] args) {
    int rok = 2020;

    {System.out.println(rok);}

    if (((rok % 4 == 0) && (rok % 100 != 0)) || (rok % 400 == 0))
    {System.out.println("ten rok jest przestępny");}
    else {
    System.out.println("ten rok nie jest przestępny");}

    }
}