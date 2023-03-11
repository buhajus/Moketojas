import lt.base.MoketojasImpl;
import lt.base.paslaugos.internetas.Internetas;
import lt.base.paslaugos.internetas.InternetasImpl;
import lt.base.paslaugos.sildymas.SildymasImpl;
import lt.base.paslaugos.telefonas.Telefonas;
import lt.base.paslaugos.telefonas.TelefonasImpl;

public class Main {
    public static void main(String[] args) {

        //5. Sukurti po 3 objektus kiekvienos klasės.

        TelefonasImpl telefonas = new TelefonasImpl();
        MoketojasImpl moketojas = new MoketojasImpl();
        SildymasImpl sildymas = new SildymasImpl();
        Internetas internetas = new InternetasImpl();

        TelefonasImpl telefonas1 = new TelefonasImpl("865253625369");
        TelefonasImpl telefonas2 = new TelefonasImpl("865253625300");
        TelefonasImpl telefonas3 = new TelefonasImpl("865253625359");

        MoketojasImpl moketojas1 = new MoketojasImpl(125,"Vilis", "Moris", "Traku 15- 50", 696.69);
        MoketojasImpl moketojas2 = new MoketojasImpl(369,"Tadas", "Vilkas", "Miško 15- 50", 12053.25);
        MoketojasImpl moketojas3 = new MoketojasImpl(11,"Ala", "Pugačiova", "Aleja no 5", -6.00);

        SildymasImpl sildymas1 = new SildymasImpl(15.5);
        SildymasImpl sildymas2 = new SildymasImpl(5.5);
        SildymasImpl sildymas3 = new SildymasImpl(215.5);

        InternetasImpl ip1 = new InternetasImpl("192.168.1.69");
        InternetasImpl ip2 = new InternetasImpl("192.168.1.09");
        InternetasImpl ip3 = new InternetasImpl("192.168.1.119");

        MoketojasImpl sarasas[] = {moketojas1,moketojas2,moketojas3,ip1,ip2,ip3,telefonas1,telefonas2,telefonas3,sildymas1,sildymas2,sildymas3};

        for (MoketojasImpl list : sarasas){
            System.out.println(list);
        }










    }
}