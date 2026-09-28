package Homework_OOP_04;

public class PaymentCard {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public PaymentCard(String cardNumber, String expiryDate, String cvv) {
        setCardNumber(cardNumber);
        this.expiryDate = expiryDate;
        setCvv(cvv);
    }

    // Xavfsizligi uchun faqat oxirgi 4 ta raqamni ko'rsatadi
    public String getCardNumber() {
        String oxirgi4 = cardNumber.substring(cardNumber.length() - 4);// aynan shu yerda 4 kartani ohirgi 4 raqami korinadigan qilinyapti huddi real hayotdagiga oxshab
        return "**** **** **** " + oxirgi4;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getCvv() {
        return "***";
    }

    public void setCardNumber(String cardNumber) {//bu yerda  carta raqamini  aynan 16 taga tenglanyapti hamda undan kop raqam ham qabul qilmaydi undan kam raqam ham qabul qilmaydi 16 yozilmasa hato beriladi
        if (cardNumber.length() == 16) {
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Xato: karta raqami 16 ta raqamdan iborat bo'lishi kerak!");
            this.cardNumber = "0000000000000000";
        }
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setCvv(String cvv) {// bu kartaning orqasidagi 3 ta maxfiy kod bu ham 3  ta raqam kiritmasa eror beradi
        if (cvv.length() == 3) {
            this.cvv = cvv;
        } else {
            System.out.println("Xato: CVV 3 ta raqamdan iborat bo'lishi kerak!");
            this.cvv = "000";
        }
    }

    public String toString() {
        return "PaymentCard [cardNumber=" + getCardNumber() + ", expiryDate=" + expiryDate + "]";
    }
}
