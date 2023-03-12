package lt.base.paslaugos.internetas;

import lt.base.MoketojasImpl;

public class InternetasImpl extends MoketojasImpl implements Internetas {
    private String ipAdresas;

    @Override
    public void setIpAdresas(String ipAdresas) {
        this.ipAdresas = ipAdresas;
    }

    @Override
    public String getIpAdresas() {
        return ipAdresas;
    }

    public InternetasImpl(int moketojoId, String vardas, String pavarde, String adresas, double suma, String ipAdresas) {
        super(moketojoId, vardas, pavarde, adresas, suma);
        this.ipAdresas = ipAdresas;
    }

    public InternetasImpl(String ipAdresas) {
        this.ipAdresas = ipAdresas;
    }

    @Override
    public String toString() {
        return super.toString() +", "+
                "ipAdresas='" + ipAdresas + '\'' +
                '}';
    }

    public InternetasImpl(){

    }
}
