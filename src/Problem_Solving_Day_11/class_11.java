package Problem_Solving_Day_11;

public class class_11 {
    // 1.
    public void juftOrindagiBelgilar(String s) {
        String natija = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                char belgi = s.charAt(i);
                boolean harfmi = (belgi >= 'a' && belgi <= 'z') || (belgi >= 'A' && belgi <= 'Z');
                boolean raqammi = belgi >= '0' && belgi <= '9';
                if (!harfmi && !raqammi) {
                    natija = natija + belgi;
                }
            }
        }
        System.out.println("Natija: " + natija);
    }

    // 2.
    public void boluvchilarKopaytmasi(int son) {
        int kopaytma = 1;
        for (int i = 1; i <= son; i++) {
            if (son % i == 0) {
                kopaytma = kopaytma * i;
            }
        }
        System.out.println("Ko'paytma: " + kopaytma);
    }

    // 3.
    public void sonPalindromi(int son) {
        int asli = son;
        int teskari = 0;
        while (son != 0) {
            int qoldiq = son % 10;
            teskari = teskari * 10 + qoldiq;
            son = son / 10;
        }
        if (asli == teskari) {
            System.out.println(asli + " - palindrom");
        } else {
            System.out.println(asli + " - palindrom emas");
        }
    }

    // 4.
    public void unliHarflarniYulduzga(String str) {
        String natija = "";
        for (int i = 0; i < str.length(); i++) {
            char belgi = str.charAt(i);
            char kichik = Character.toLowerCase(belgi);
            if (kichik == 'a' || kichik == 'e' || kichik == 'i' || kichik == 'o' || kichik == 'u') {
                natija = natija + '*';
            } else {
                natija = natija + belgi;
            }
        }
        System.out.println("Natija: " + natija);
    }

    // 5.
    public void undoshHarflarniPlusga(String str) {
        String natija = "";
        for (int i = 0; i < str.length(); i++) {
            char belgi = str.charAt(i);
            char kichik = Character.toLowerCase(belgi);
            boolean harfmi = (belgi >= 'a' && belgi <= 'z') || (belgi >= 'A' && belgi <= 'Z');
            boolean unlimi = kichik == 'a' || kichik == 'e' || kichik == 'i' || kichik == 'o' || kichik == 'u';
            if (harfmi && !unlimi) {
                natija = natija + '+';
            } else {
                natija = natija + belgi;
            }
        }
        System.out.println("Natija: " + natija);
    }

    // 6.
    public void asciiKodiniOshirish(String str) {
        String natija = "";
        for (int i = 0; i < str.length(); i++) {
            char belgi = str.charAt(i);
            natija = natija + (char) (belgi + 1);
        }
        System.out.println("Natija: " + natija);
    }

    // 7.
    public void belgilarSoniTengmi(String str) {
        int harf = 0, raqam = 0, simvol = 0;
        for (int i = 0; i < str.length(); i++) {
            char belgi = str.charAt(i);
            if ((belgi >= 'a' && belgi <= 'z') || (belgi >= 'A' && belgi <= 'Z')) {
                harf++;
            } else if (belgi >= '0' && belgi <= '9') {
                raqam++;
            } else {
                simvol++;
            }
        }
        if (harf == raqam && raqam == simvol) {
            System.out.println("Ok");
        } else {
            System.out.println("Not");
        }
    }

    // 8.
    public void uchBelgiChiqarish(String str) {
        int uzunlik = str.length();
        char birinchi = str.charAt(0);
        char ortadagi = str.charAt(uzunlik / 2);
        char oxirgi = str.charAt(uzunlik - 1);
        System.out.println("Output: " + birinchi + "" + ortadagi + "" + oxirgi);
    }

    // 9.
    public void belginiAniqlash(char belgi) {
        if (belgi >= '0' && belgi <= '9') {
            System.out.println("RAQAM");
        } else if ((belgi >= 'a' && belgi <= 'z') || (belgi >= 'A' && belgi <= 'Z')) {
            System.out.println("HARF");
        } else {
            System.out.println("SIMVOL");
        }
    }

    // 10.
    public void nTaBelgidanSatr(int n, char belgi) {
        String natija = "";
        for (int i = 0; i < n; i++) {
            natija = natija + belgi;
        }
        System.out.println("Natija = " + natija);
    }

    // 11.
    public void asciiKodBelgi(int n) {
        if (n >= 32 && n <= 126) {
            char belgi = (char) n;
            System.out.println(belgi);
        } else {
            System.out.println("Kod  32-126 oralig'ida bo'lishi kerak:");
        }
    }

    // 12.
    public void ekubEkukTopish(String str) {
        String raqamlar = "";
        for (int i = 0; i < str.length(); i++) {
            char belgi = str.charAt(i);
            if (belgi >= '0' && belgi <= '9') {
                raqamlar = raqamlar + belgi;
            }
        }
        if (raqamlar.length() >= 2) {
            char ekub = raqamlar.charAt(0);
            char ekuk = raqamlar.charAt(1);
            System.out.println("EKUB=" + ekub + ", EKUK=" + ekuk);
        } else {
            System.out.println("raqam topilmadi");
        }
    }

    // 13.
    public void harflarRaqamlarSoniTeng(String str) {
        int harf = 0, raqam = 0;
        for (int i = 0; i < str.length(); i++) {
            char belgi = str.charAt(i);
            if ((belgi >= 'a' && belgi <= 'z') || (belgi >= 'A' && belgi <= 'Z')) {
                harf++;
            } else if (belgi >= '0' && belgi <= '9') {
                raqam++;
            }
        }
        if (harf == raqam) {
            System.out.println("ok");
        } else {
            System.out.println("error");
        }
    }

    // 14.
    public void satrUzunligiYarmiTeng(String str) {
        int harflarVaBelgilar = 0;
        for (int i = 0; i < str.length(); i++) {
            char belgi = str.charAt(i);
            boolean raqammi = belgi >= '0' && belgi <= '9';
            if (!raqammi) {
                harflarVaBelgilar++;
            }
        }
        if (harflarVaBelgilar * 2 == str.length()) {
            System.out.println("ok");
        } else {
            System.out.println("error");
        }
    }
}