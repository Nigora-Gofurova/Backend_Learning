package Problem_Solving_Day_10;

public class class_10 {
    // 1.
    public void pdpAcademy(String s) {
        int soni = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                soni++;
            }
        }
        if (soni > 8) {
            System.out.println("PDP");
        } else {
            System.out.println("ACADEMY");
        }
    }
        // 2.
        public void raqamlarYigindisi (String str){
            int yigindi = 0;
            for (int i = 0; i < str.length(); i++) {
                char belgi = str.charAt(i);
                if (belgi >= '0' && belgi <= '9') {
                    yigindi = yigindi + (belgi - '0');
                }
            }
            System.out.println("Yig'indi: " + yigindi);
        }

        // 3.
        public void kabisaYil ( int yil){
            boolean kabisa = (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);
            System.out.println(kabisa);
        }

        // 4.
        public void belgilarniSanash (String str){
            int raqam = 0, kichik = 0, katta = 0;
            for (int i = 0; i < str.length(); i++) {
                char belgi = str.charAt(i);
                if (belgi >= '0' && belgi <= '9') {
                    raqam++;
                } else if (belgi >= 'a' && belgi <= 'z') {
                    kichik++;
                } else if (belgi >= 'A' && belgi <= 'Z') {
                    katta++;
                }
            }
            System.out.println("Raqamlar: " + raqam);
            System.out.println("Kichik harflar: " + kichik);
            System.out.println("Katta harflar: " + katta);
        }

        // 5.
        public void mukammalSon ( int N){
            int yigindi = 0;
            for (int i = 1; i < N; i++) {
                if (N % i == 0) {
                    yigindi = yigindi + i;
                }
            }
            if (yigindi == N) {
                System.out.println(N + " - mukammal son");
            } else {
                System.out.println(N + " - mukammal son emas");
            }
        }

        // 6.
        public void harfAlmashtirishKattaKichik (String str){
            String natija = "";
            for (int i = 0; i < str.length(); i++) {
                char belgi = str.charAt(i);
                if (belgi >= 'a' && belgi <= 'z') {
                    natija = natija + Character.toUpperCase(belgi);
                } else if (belgi >= 'A' && belgi <= 'Z') {
                    natija = natija + Character.toLowerCase(belgi);
                } else {
                    natija = natija + belgi;
                }
            }
            System.out.println("Natija: " + natija);
        }

        // 7.
        public void parolTekshirish (String parol){
            boolean uzunlikOk = parol.length() >= 8;
            boolean kichikBor = false;
            boolean yulduzchaBor = false;
            boolean sonBor = false;

            for (int i = 0; i < parol.length(); i++) {
                char belgi = parol.charAt(i);
                if (belgi >= 'a' && belgi <= 'z') kichikBor = true;
                if (belgi == '*') yulduzchaBor = true;
                if (belgi >= '0' && belgi <= '9') sonBor = true;
            }

            if (uzunlikOk && kichikBor && yulduzchaBor && sonBor) {
                System.out.println("Parol mos keladi");
            } else {
                System.out.println("Parol mos kelmaydi");
            }
        }

        // 8.
        public void kattaHarflarniYulduzchaga (String str){
            String natija = "";
            for (int i = 0; i < str.length(); i++) {
                char belgi = str.charAt(i);
                if (belgi >= 'A' && belgi <= 'Z') {
                    natija = natija + '*';
                } else {
                    natija = natija + belgi;
                }
            }
            System.out.println("Natija: " + natija);
        }

        // 9.
        public void uchburchak ( double a, double b){
            double c = Math.sqrt(a * a + b * b);
            double yuza = (a * b) / 2;
            double perimetr = a + b + c;
            System.out.println("Gipotenuza: " + c);
            System.out.println("Yuza: " + yuza);
            System.out.println("Perimetr: " + perimetr);
        }

        // 10.
        public void harflarSoni (String str){
            int soni = 0;
            for (int i = 0; i < str.length(); i++) {
                char belgi = str.charAt(i);
                if ((belgi >= 'a' && belgi <= 'z') || (belgi >= 'A' && belgi <= 'Z')) {
                    soni++;
                }
            }
            System.out.println("Harflar soni: " + soni);
        }

        // 11a.
        public void kvadratSonmi ( int N){
            boolean topildi = false;
            for (int i = 0; i * i <= N; i++) {
                if (i * i == N) {
                    topildi = true;
                    break;
                }
            }
            if (topildi) {
                System.out.println(N + " - biror sonning kvadrati");
            } else {
                System.out.println(N + " - biror sonning kvadrati emas");
            }
        }

        // 11b.
        public void harfBolmaganBelgilar (String str){
            String natija = "";
            for (int i = 0; i < str.length(); i++) {
                char belgi = str.charAt(i);
                boolean harfmi = (belgi >= 'a' && belgi <= 'z') || (belgi >= 'A' && belgi <= 'Z');
                if (!harfmi) {
                    natija = natija + belgi;
                }
            }
            System.out.println("Natija: " + natija);
        }

        // 12.
        public void sDarajaHisoblash ( int S, int N){
            int natija = 1;
            for (int i = 1; i <= N; i++) {
                natija = natija * S;
            }
            System.out.println(S + " ning " + N + "-darajasi: " + natija);
        }

        // 13.
        public void bolishQoldigiVaButuni ( int n, int k){
            int butun = 0;
            int qoldiq = n;
            while (qoldiq >= k) {
                qoldiq = qoldiq - k;
                butun = butun + 1;
            }
            System.out.println("Butun qism: " + butun);
            System.out.println("Qoldiq: " + qoldiq);
        }

        // 14.
        public void satrniTeskariChiqarish (String str){
            String natija = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                natija = natija + str.charAt(i);
            }
            System.out.println("Natija: " + natija);
        }

        // 15.
        public void kattaHarfTaqqoslash (String str){
            int katta = 0, kichik = 0;
            for (int i = 0; i < str.length(); i++) {
                char belgi = str.charAt(i);
                if (belgi >= 'A' && belgi <= 'Z') {
                    katta++;
                } else if (belgi >= 'a' && belgi <= 'z') {
                    kichik++;
                }
            }
            if (katta > kichik) {
                System.out.println("PDP");
            } else {
                System.out.println("ACADEMY");
            }
        }

        // 16.
        public void yettigaBogliq ( int a, int b){
            boolean natija = (a == 7) || (b == 7) || (a + b == 7) || (a - b == 7) || (b - a == 7);
            System.out.println(natija);
        }

        // 17.
        public void raqamBolmaganBelgilar (String str){
            String natija = "";
            for (int i = 0; i < str.length(); i++) {
                char belgi = str.charAt(i);
                if (!(belgi >= '0' && belgi <= '9')) {
                    natija = natija + belgi;
                }
            }
            System.out.println("Natija: " + natija);
        }
    }
