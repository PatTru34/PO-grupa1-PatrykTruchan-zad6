package pl.edu.uwm.wmii.kotewa.laboratorium00;
public class IntegerSet {
    boolean[] list = new boolean[100];
    public IntegerSet(){};

    public static IntegerSet union(IntegerSet zbior1,IntegerSet zbior2)
    {
        IntegerSet x=new IntegerSet();
        for (int i = 0; i < zbior1.list.length; i++) {
            if (zbior1.list[i] || zbior2.list[i]) {
                x.insertElement(i);
            }
        }
        return x;
    }
    public static IntegerSet intersection(IntegerSet zbior1,IntegerSet zbior2)
    {
        IntegerSet x=new IntegerSet();
        for (int i = 0; i < zbior1.list.length; i++) {
            if (zbior1.list[i] && zbior2.list[i]) {
                x.insertElement(i);
            }
        }

        return x;
    }

    public void insertElement(int k)
    {
        this.list[k]=true;

    }
    public void deleteElement(int k)
    {
        this.list[k]=false;

    }
    public String toString() {
        StringBuffer str = new StringBuffer("");
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i]) {
                str.append(i).append(" ");
            }
        }

        return str.toString();
    }

    public boolean equals(IntegerSet zbior2) {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] != zbior2.list[i]) {
                return false;
            }
        }

        return true;
    }
}
