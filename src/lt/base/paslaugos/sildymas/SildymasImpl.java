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

    public SildymasImpl(){

    }

    @Override
    public String toString() {
        return "SildymasImpl{" +
                "suvartotiKubai=" + suvartotiKubai +
                '}';
    }

    public SildymasImpl(double suvartotiKubai){
        this.suvartotiKubai = suvartotiKubai;
    }
}
