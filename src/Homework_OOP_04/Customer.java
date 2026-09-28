package Homework_OOP_04;

public class Customer {
    private String name;
    private String email;
    private String phone;
    private Address address;

    public Customer(String name, String email, String phone, Address address) {
        this.name = name;
        setEmail(email);
        setPhone(phone);      //aynan set bilan bergan ikkita setterlar orqalik tekshirildi
        this.address = address;
    }

    // Getterlar
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }

    // Setterlar
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Xato: emailda @ belgisi bo'lishi kerak!");
        }
    }

    public void setPhone(String phone) {
        if (phone.length() >= 9) {
            this.phone = phone;
        } else {
            System.out.println("Xato: telefon raqami juda qisqa!");
        }
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString() {
        return "Customer [name=" + name + ", email=" + email +
                ", phone=" + phone + ", address=" + address + "]";
    }
}
