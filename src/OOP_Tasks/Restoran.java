package OOP_Tasks;

public class Restoran {
    private String taom_nomi;
    private double narxi;
    private int stol_raqam;
    private boolean bandligi;

    public Restoran( int stol_raqam) {
        this.taom_nomi = "";
        this.stol_raqam = stol_raqam;
        this.bandligi = false;
        this.narxi = 0;
    }
    public void stol_bandligi() {
        if(!bandligi) {
            bandligi = true;
            System.out.print("stol band qilindi ");
        }else{
            System.out.print("joy yetarlik emas ");
        }
    }
    public void taom_buyurtma(String taom,double narxi) {
        this.taom_nomi = taom;
        this.narxi = narxi;
        System.out.print("taom buyurtma  qilindi "+taom);
    }
    public double umumiy_narxi(int soni) {
        return soni * narxi;

    }
    public String get_taom_nomi(){

        return taom_nomi;
    }
}
