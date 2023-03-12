package lt.base.paslaugos.sildymas;

import lt.base.MoketojasImpl;

public class SildymasImpl extends MoketojasImpl implements Sildymas {
    private double suvartotiKubai;

    public void setSuvartotiKubai(double suvartotiKubai){
        this.suvartotiKubai=suvartotiKubai;
    }
    public double getSuvartotiKubai (){
        return suvartotiKubai;
    }

    public SildymasImpl(int moketojoId, String vardas, String pavarde, String adresas, double suma, double suvartotiKubai) {
        super(moketojoId, vardas, pavarde, adresas, suma);
        this.suvartotiKubai = suvartotiKubai;
    }

    public SildymasImpl(){

    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "suvartotiKubai=" + suvartotiKubai +
                '}';
    }

    public SildymasImpl(double suvartotiKubai){
        this.suvartotiKubai = suvartotiKubai;
    }
}
