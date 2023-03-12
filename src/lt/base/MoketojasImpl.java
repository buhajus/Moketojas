package lt.base;

import lt.base.paslaugos.internetas.InternetasImpl;
import lt.base.paslaugos.sildymas.SildymasImpl;
import lt.base.paslaugos.telefonas.Telefonas;
import lt.base.paslaugos.telefonas.TelefonasImpl;

public class MoketojasImpl implements Moketojas {

    private int moketojoId;
    private String vardas;
    private String pavarde;
    private String adresas;
    private double suma;

    public int getMoketojoId() {
        return moketojoId;
    }

    public void setMoketojoId(int moketojoId) {
        this.moketojoId = moketojoId;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getAdresas() {
        return adresas;
    }

    public void setAdresas(String adresas) {
        this.adresas = adresas;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }


    public MoketojasImpl(int moketojoId, String vardas, String pavarde, String adresas, double suma) {
        this.moketojoId = moketojoId;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.adresas = adresas;
        this.suma = suma;
    }

    public MoketojasImpl() {

    }

    @Override
    public String toString() {
        return "MoketojasImpl{" +
                "moketojoId=" + moketojoId +
                ", vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", adresas='" + adresas + '\'' +
                ", suma=" + suma +
                '}';
    }

    public void visoUzIntIrTel(MoketojasImpl sarasas[]) {
        double sum = 0;
        for (MoketojasImpl mok : sarasas) {

            if (mok instanceof InternetasImpl) {
                InternetasImpl inter = (InternetasImpl) mok;
                System.out.println(inter.getSuma());
                sum += inter.getSuma();
            }
            if (mok instanceof TelefonasImpl) {
                TelefonasImpl tel = (TelefonasImpl) mok;
                System.out.println(tel.getSuma());
                sum += tel.getSuma();
            }

        }
        System.out.println("Mokestis už internetą ir telefoną : " + sum);
    }

    //7. Sukeisti didžiausios ir mažiausios sąskaitos už šildymą sumas vietomis.



}
