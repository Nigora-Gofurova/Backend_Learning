package Homeworks_OOP;

public class Person_Task {
    public class Person {
        private String ism;
        private String familiya;
        private int tugilganYil;
        private String jinsi;
        private String kasbi;

        public Person(String ism, String familiya, int tugilganYil, String jinsi, String kasbi) {
            this.ism = ism;
            this.familiya = familiya;
            this.tugilganYil = tugilganYil;
            this.jinsi = jinsi;
            this.kasbi = kasbi;
        }

        public int yosh() {
            int hozirgiYil = 2026;
            int yosh = hozirgiYil - tugilganYil;
            return yosh;
        }

        public void kasbniOzgartir(String yangiKasb) {
            this.kasbi = yangiKasb;
            System.out.println(ism + " kasbini o'zgartirdi: " + yangiKasb);
        }

        public String toString() {
            return ism + " " + familiya + " (" + jinsi + ")\nYoshi: " + yosh() + "\nKasbi: " + kasbi;
        }
    }
}
