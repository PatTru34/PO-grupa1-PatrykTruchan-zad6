package pl.edu.uwm.wmii.kotewa.laboratorium00;

public class Main {

    public static void main(String[] args)
    {
        RachunekBankowy saver1=new RachunekBankowy(2000);
        RachunekBankowy saver2=new RachunekBankowy(3000);
        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        System.out.print("Saldo klienta pierwszego po pierwszym miesiacu: "+saver1.obliczMiesieczneOdsetki()+"\n");
        System.out.print("Saldo drugiego klienta po pierwszym miesiącu: "+saver2.obliczMiesieczneOdsetki()+"\n");
        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        System.out.print("Saldo klienta pierwszego po drugim miesiacu: "+saver1.obliczMiesieczneOdsetki()+"\n");
        System.out.print("Saldo drugiego klienta po drugim miesiącu: "+saver2.obliczMiesieczneOdsetki()+"\n");

    }
}