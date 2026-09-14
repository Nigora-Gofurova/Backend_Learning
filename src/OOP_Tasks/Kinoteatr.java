package OOP_Tasks;

public class Kinoteatr {
    private int joy;
    private double price;
    private String filmNomi;
    private String  filmTime;


    public Kinoteatr(int joy,  String filmNomi) {
        this.joy = joy;
        this.price = 50000;
        this.filmNomi = filmNomi;
        this.filmTime ="18:00";

    }
    public void chiptaSotipOlish(int son ) {
        if(son<=joy){
            joy-=son;
            System.out.println("chipta stip olindio "+son);
        }else{
            System.out.println("joy yetarlik emas "+joy);

        }
    }
    public int getTicket() {
        return joy;

    }
    public double totalPrice(int soni) {
        return soni*price;
    }
    public String getSeansVaqti() {
        return filmTime;
    }
}
