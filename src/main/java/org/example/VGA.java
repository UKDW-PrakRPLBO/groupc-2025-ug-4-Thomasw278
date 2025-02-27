package org.example;

public class VGA extends Colokan{
    public VGA(int harga, double promisedBandwidth, String merk){
        super(harga, promisedBandwidth, merk);
    }

    @Override
    public double getRealBandwidth(){
        double ratio = getHarga() / 50000;
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
