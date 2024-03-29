import lt.base.MoketojasImpl;
import lt.base.paslaugos.internetas.Internetas;
import lt.base.paslaugos.internetas.InternetasImpl;
import lt.base.paslaugos.sildymas.SildymasImpl;
import lt.base.paslaugos.telefonas.TelefonasImpl;

public class Main {
    public static void main(String[] args) {

        //5. Sukurti po 3 objektus kiekvienos klasės.

        TelefonasImpl telefonas = new TelefonasImpl();
        MoketojasImpl moketojas = new MoketojasImpl();
        SildymasImpl sildymas = new SildymasImpl();
        Internetas internetas = new InternetasImpl();


        TelefonasImpl telefonas1 = new TelefonasImpl(125, "Vilis", "Moris", "Traku 15- 50", 36.00, "865253625369");
        TelefonasImpl telefonas2 = new TelefonasImpl(369, "Tadas", "Vilkas", "Miško 15- 50", 12.00, "865253625300");
        TelefonasImpl telefonas3 = new TelefonasImpl(11, "Ala", "Pugačiova", "Aleja no 5", 15.00, "865253625359");


        MoketojasImpl moketojas1 = new MoketojasImpl(125, "Vilis", "Moris", "Traku 15- 50", 696.69);
        MoketojasImpl moketojas2 = new MoketojasImpl(369, "Tadas", "Vilkas", "Miško 15- 50", 12053.25);
        MoketojasImpl moketojas3 = new MoketojasImpl(11, "Ala", "Pugačiova", "Aleja no 5", -6.00);
        MoketojasImpl moketojas4 = new MoketojasImpl(11, "Albinas", "Misha", "Aleja no 5", 76.00);


        SildymasImpl sildymas1 = new SildymasImpl(125, "Vilis", "Moris", "Traku 15- 50", 1016.00, 15.5);
        SildymasImpl sildymas2 = new SildymasImpl(369, "Tadas", "Vilkas", "Miško 15- 50", 12.50, 5.5);
        SildymasImpl sildymas3 = new SildymasImpl(11, "Ala", "Pugačiova", "Aleja no 5", 10022.00, 215.5);

        InternetasImpl ip1 = new InternetasImpl(125, "Vilis", "Moris", "Traku 15- 50", 16.50, "192.168.1.69");
        InternetasImpl ip2 = new InternetasImpl(369, "Tadas", "Vilkas", "Miško 15- 50", 12.50, "192.168.1.09");
        InternetasImpl ip3 = new InternetasImpl(11, "Ala", "Pugačiova", "Aleja no 5", 16.50, "192.168.1.119");
        InternetasImpl ip4 = new InternetasImpl(moketojas4,"192.168.1.69");

        MoketojasImpl sarasas[] = {moketojas4,ip1, ip2, ip3, telefonas1, telefonas2, telefonas3, sildymas1, sildymas2, sildymas3};


        lastDigits(sarasas);
        visoUzIntIrTel(sarasas);
//        System.out.println("Min index: " + minIndex(sarasas));
//        System.out.println("Max index: " + maxIndex(sarasas));


        for (MoketojasImpl m : sarasas) {
            System.out.println(m);
        }

        System.out.println("swap");
        swap(sarasas, minIndex(sarasas), maxIndex(sarasas));


        for (MoketojasImpl m : sarasas) {
            System.out.println(m);
        }

    }

    public static void swap(MoketojasImpl sarasas[], double min, double max) {


        for (MoketojasImpl mok : sarasas) {
            if (mok instanceof SildymasImpl) {
                SildymasImpl sild = (SildymasImpl) mok;
                if (max == sild.getSuma()) {
                    sild.setSuma(min);

                } else if (min == sild.getSuma()) {
                    sild.setSuma(max);
                }
            }

        }
    }


    public static void spausdintiMasyva(MoketojasImpl masyvas[]) {
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i] + ",");
        }
    }


    public static double minIndex(MoketojasImpl sarasas[]) {

        double min = 9999;
        for (MoketojasImpl mok : sarasas) {
            if (mok instanceof SildymasImpl) {

                SildymasImpl sild = (SildymasImpl) mok;

                if (sild.getSuma() < min) {
                    min = sild.getSuma();

                }
            }
        }

        return min;
    }

//reikia tikrinti tik is sildymas

    public static double maxIndex(MoketojasImpl sarasas[]) {

        double max = sarasas[0].getSuma();

        for (MoketojasImpl mok : sarasas) {
            if (mok instanceof SildymasImpl) {

                SildymasImpl sild = (SildymasImpl) mok;

                if (sild.getSuma() > max) {
                    for (int i = 0; i < sarasas.length; i++) {
                        max = sild.getSuma();

                    }
                }
            }
        }

        return max;
    }

    public static void visoUzIntIrTel(MoketojasImpl sarasas[]) {
        double sum = 0;
        for (MoketojasImpl mok : sarasas) {

            if (mok instanceof InternetasImpl) {
                InternetasImpl inter = (InternetasImpl) mok;
                sum += inter.getSuma();
            }
            if (mok instanceof TelefonasImpl) {
                TelefonasImpl tel = (TelefonasImpl) mok;
                sum += tel.getSuma();
            }

        }
        System.out.println("Mokestis už internetą ir telefoną : " + sum);
    }

    public static void lastDigits(MoketojasImpl sarasas[]) {

        for (MoketojasImpl mok : sarasas) {
            if (mok instanceof TelefonasImpl) {
                TelefonasImpl tel = (TelefonasImpl) mok;
                if (tel.getTelefonoNr().endsWith("69")) {
                    tel.setSuma(69);
                }
            }
        }
    }

}