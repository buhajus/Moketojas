package lt.base.paslaugos.telefonas;

import lt.base.MoketojasImpl;

public class TelefonasImpl extends MoketojasImpl implements Telefonas {
    String telefonoNr;

    public void setTelefonoNr(String telefonoNr) {
        this.telefonoNr = telefonoNr;
    }

    public TelefonasImpl(int moketojoId, String vardas, String pavarde, String adresas, double suma, String telefonoNr) {
        super(moketojoId, vardas, pavarde, adresas, suma);
        this.telefonoNr = telefonoNr;

    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "telefonoNr='" + telefonoNr + '\'' +
                '}';
    }
    public  TelefonasImpl(String telefonoNr){
        this.telefonoNr = telefonoNr;
    }
    public  TelefonasImpl(){

    }

    public String getTelefonoNr() {
        return telefonoNr;
    }


}
