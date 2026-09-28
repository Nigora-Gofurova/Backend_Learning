package Homework_OOP_04;

public class Address {
    private String country;
    private String city;
    private String street;
    private String zipCode;

    public Address(String country, String city, String street, String zipCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        setZipCode(zipCode);// setterni ozi tekshiradi
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(String zipCode) {
        // Sodda validatsiya: uzunligi 4 tadan kam bo'lmasligi kerak shu uchun bu yerda shart bervolyapmiz shunga moslap
        if (zipCode == null || zipCode.length() < 4) {
            System.out.println("Xato: pochta indeksi juda qisqa!");
            this.zipCode = "0000";
        } else {
            this.zipCode = zipCode;
        }
    }

    public String toString() {
        return "Address [country=" + country + ", city=" + city +
                ", street=" + street + ", zipCode=" + zipCode + "]";
    }
}
