package pl.edu.uwm.wmii.kotewa.laboratorium00;

public class Main2 {
    public static void main(String[] args) {
        IntegerSet x = new IntegerSet();
        x.insertElement(2);
        x.insertElement(3);
        System.out.println(x.toString());
        x.deleteElement(15);
        System.out.println(x.toString());
        IntegerSet y = new IntegerSet();
        y.insertElement(6);
        y.insertElement(76);
        System.out.println(IntegerSet.union(x, y));
        IntegerSet z = new IntegerSet();
        z.insertElement(6);
        z.insertElement(76);
        System.out.println(z.equals(y));
    }
}
