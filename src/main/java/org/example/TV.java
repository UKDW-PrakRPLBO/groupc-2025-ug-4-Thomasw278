package org.example;

public class TV {
    private int maxResolusi;
    private Colokan colokan;

    public int getResolution(){
        double bandwitchasli = colokan.getRealBandwidth();
        int hasil;
        if (bandwitchasli >= 10 && bandwitchasli < 35){
            hasil = 480;
        }else if (bandwitchasli >= 35 && bandwitchasli < 100){
            hasil = 720;
        } else{
            hasil = 1080;
        }
        if(hasil > maxResolusi){
            return maxResolusi;
        }else{
            return hasil;
        }
    }
    //Tambahan Soal //
    // getResolution() jika bandwitch dari colokan: 10-35 mbps maka resolusi 480p. Jika resolusi 35-100. resolusi 720p
    // di atas itu 1080p. Perhatikan juga resolusi dari TV. Jika resolusi yang bisa didapatkan dari bandwitch adalah 1080p
    // tetapi maxresolusiTV adalah 720p, maka fungsi ini akan return 720p
    public TV (int maxResolusi){
        this.maxResolusi = maxResolusi;
    }

    public void connect(Colokan colokan){
        this.colokan = colokan;
        System.out.println("Berhasil Connect ke - " + colokan.getMerk());
    }
}
