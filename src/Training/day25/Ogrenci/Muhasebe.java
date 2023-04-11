package Training.day25.Ogrenci;

public class Muhasebe {
    int kayitFiyati;
    int indirimMiktari;

    public int netFiyat(){
        return kayitFiyati - indirimMiktari;
    }

}
