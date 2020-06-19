public class Grades {
    private int [] grades;
    private int size;
    private int[] values;

    public Grades(int[] values) {
        this.values = values;
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.values[this.size] = value;
        this.size++;
    }
}
