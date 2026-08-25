package Problem_Solving_Day_12;

    public class class_12 {
        // 1.
        public void birinchiNKattaHarflar(int n) {
            for (int i = 0; i < n; i++) {
                char harf = (char) ('A' + i);
                System.out.print(harf + " ");
            }
            System.out.println();
        }

        // 2.
        public void teskariNKichikHarflar(int n) {
            for (int i = n - 1; i >= 0; i--) {
                char harf = (char) ('a' + i);
                System.out.print(harf + " ");
            }
            System.out.println();
        }

        // 3.
        public void birinchiOxirgiBelgi(String str) {
            char birinchi = str.charAt(0);
            char oxirgi = str.charAt(str.length() - 1);
            if (birinchi == oxirgi) {
                System.out.println("ok");
            } else {
                System.out.println("error");
            }
        }

        // 4.
        public void sonniSozga(int son) {
            String[] birlar = {"", "bir", "ikki", "uch", "to'rt", "besh", "olti", "yetti", "sakkiz", "to'qqiz"};
            String[] onlar = {"", "o'n", "yigirma", "o'ttiz", "qirq", "ellik", "oltmish", "yetmish", "sakson", "to'qson"};

            if (son < 10) {
                System.out.println(birlar[son]);
            } else {
                int o = son / 10;
                int b = son % 10;
                if (b == 0) {
                    System.out.println(onlar[o]);
                } else {
                    System.out.println(onlar[o] + " " + birlar[b]);
                }
            }
        }

        // 5.
        public void uchgaBolinadiBeshgaEmasYigindi() {
            int yigindi = 0;
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 != 0) {
                    yigindi = yigindi + i;
                }
            }
            System.out.println("Yig'indi: " + yigindi);
        }

        // 6.
        public void ikkiXonaliFarqBirGaTeng() {
            for (int i = 10; i <= 99; i++) {
                int onlar = i / 10;
                int birlar = i % 10;
                int farq = onlar - birlar;
                if (farq == 1 || farq == -1) {
                    System.out.print(i + ", ");
                }
            }
            System.out.println();
        }

        // 7a.
        public void kvadratSonmi(int N) {
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

        // 7b.
        public void toqRaqamliSonlar200_800() {
            for (int i = 200; i <= 800; i++) {
                String son = String.valueOf(i);
                boolean hammaToq = true;
                for (int j = 0; j < son.length(); j++) {
                    int raqam = son.charAt(j) - '0';
                    if (raqam % 2 == 0) {
                        hammaToq = false;
                        break;
                    }
                }
                if (hammaToq) {
                    System.out.print(i + ", ");
                }
            }
            System.out.println();
        }

        // 8.
        public void raqamlarYigindisiBesh() {
            for (int i = 10; i <= 99; i++) {
                int onlar = i / 10;
                int birlar = i % 10;
                if (onlar + birlar == 5) {
                    System.out.print(i + ", ");
                }
            }
            System.out.println();
        }

        // 9.
        public void uchgaBolinib6gaBolinmaydiganSonlar() {
            for (int i = 100; i <= 900; i++) {
                if (i % 3 == 0 && i % 6 != 0) {
                    System.out.print(i + ", ");
                }
            }
            System.out.println();
        }

        // 10.
        public void sonningXonalarSoni(int son) {
            int nusxa = son;
            if (nusxa < 0) {
                nusxa = -nusxa;
            }
            int soni = 0;
            if (nusxa == 0) {
                soni = 1;
            } else {
                while (nusxa != 0) {
                    nusxa = nusxa / 10;
                    soni++;
                }
            }
            System.out.println("Xonalar soni: " + soni);
        }

        // 11.
        public void nGachaKvadratIldiz(int n) {
            for (int i = 1; i <= n; i++) {
                System.out.println(i + " ning kvadrat ildizi: " + Math.sqrt(i));
            }
        }

        // 12.
        public void uchgaBolinib6gaBolinmaydiganYigindi() {
            int yigindi = 0;
            for (int i = 100; i <= 900; i++) {
                if (i % 3 == 0 && i % 6 != 0) {
                    yigindi = yigindi + i;
                }
            }
            System.out.println("Yig'indi: " + yigindi);
        }

        // 13.
        public void uchXonaliOnlarXonasi7yoki9() {
            for (int i = 100; i <= 999; i++) {
                int onlar = (i / 10) % 10;
                if (onlar == 7 || onlar == 9) {
                    System.out.print(i + ", ");
                }
            }
            System.out.println();
        }

        // 14.
        public void garmonikYigindi(int n) {
            double yigindi = 0;
            for (int i = 1; i <= n; i++) {
                yigindi = yigindi + 1.0 / i;
            }
            System.out.println("S = " + yigindi);
        }

        // 15.
        public void toqVaJuftSonlar() {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        // 16.
        public void dollarniSomgaAylantirish() {
            int kurs = 11300;
            for (int i = 10; i <= 40; i++) {
                int som = i * kurs;
                System.out.println(i + "$ = " + som + " so'm");
            }
        }
    }

