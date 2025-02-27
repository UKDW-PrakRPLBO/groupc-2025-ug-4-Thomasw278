package org.example;

public class HDMI extends Colokan{
    public HDMI(int harga, double promisedBandwidth, String merk){
        super(harga, promisedBandwidth, merk);
    }
    @Override
    public double getRealBandwidth(){
        double ratio = getHarga() / 30000;
        if(ratio < 1){
            double hasil = ratio * getPromisedBandwidth();
           if(hasil < 10){
               hasil = 10;
           }else{
               hasil = getPromisedBandwidth();
           }
           return hasil;
        }else{
            return getPromisedBandwidth();
        }
    }
}
