package Problem_Solving_Day_13;

public class class_13 {
    // 1.
    public void sonlarKublari(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " ning kubi: " + (i * i * i));
        }
    }

    // 2.
    public void kamida2taRaqamBirXil() {
        for (int i = 100; i <= 999; i++) {
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;
            if (a == b || b == c || a == c) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    // 3.
    public void raqamlarYigindisi9yoki15() {
        for (int i = 10; i <= 99; i++) {
            int onlar = i / 10;
            int birlar = i % 10;
            int yigindi = onlar + birlar;
            if (yigindi == 9 || yigindi == 15) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }

    // 4.
    public void uchXonaliRaqamlarYigindisi5() {
        for (int i = 100; i <= 999; i++) {
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;
            if (a + b + c == 5) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }

    // 5.
    public int daraja(int S, int N) {
        int natija = 1;
        for (int i = 1; i <= N; i++) {
            int vaqtinchalik = 0;
            for (int j = 1; j <= S; j++) {
                vaqtinchalik = vaqtinchalik + natija;
            }
            natija = vaqtinchalik;
        }
        return natija;
    }

    // 6.
    public void konsolShakli6(int n) {
        for (int qator = 1; qator <= 9 - n; qator++) {
            for (int k = 0; k < qator; k++) {
                System.out.print(n + k);
            }
            System.out.println();
        }
    }

    // 7.
    public void konsolShakli7(int n) {
        for (int qator = 1; qator <= n; qator++) {
            for (int bosh = 1; bosh < qator; bosh++) {
                System.out.print(" ");
            }
            System.out.println(1);
        }
    }

    // 8.
    public void uchburchak(double a, double b) {
        double c = Math.sqrt(a * a + b * b);
        double perimetr = a + b + c;
        System.out.println("Gipotenuza: " + c);
        System.out.println("Perimetr: " + perimetr);
    }

    // 9.
    public void karraJadvali2dan9gacha() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    // 10.
    public void konsolShakli10(int n) {
        int markaz = n / 2;
        for (int qator = 0; qator < n; qator++) {
            if (qator == markaz) {
                for (int i = 0; i < n; i++) {
                    System.out.print("+");
                    if (i != n - 1) {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            } else {
                for (int i = 0; i < markaz; i++) {
                    System.out.print("   ");
                }
                System.out.println("+");
            }
        }
    }

    // 11.
    public void tubSonmi(int n) {
        boolean tub = true;
        if (n < 2) {
            tub = false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                tub = false;
                break;
            }
        }
        if (tub) {
            System.out.println(n + " - tub son");
        } else {
            System.out.println(n + " - tub son emas");
        }
    }

    // 12.
    public void nGachaTubSonlar(int n) {
        for (int son = 2; son <= n; son++) {
            boolean tub = true;
            for (int i = 2; i < son; i++) {
                if (son % i == 0) {
                    tub = false;
                    break;
                }
            }
            if (tub) {
                System.out.print(son + "  ");
            }
        }
        System.out.println();
    }

    // 13.
    public void aSoniBMarta(int a, int b) {
        for (int i = 1; i <= b; i++) {
            System.out.println(a);
        }
    }

    // 14.
    public void ekub(int a, int b) {
        int x = a;
        int y = b;
        while (y != 0) {
            int qoldiq = x % y;
            x = y;
            y = qoldiq;
        }
        System.out.println("EKUB(a, b) = " + x);
    }

    // 15.
    public void konsolShakli15(int n) {
        for (int qator = 0; qator < n; qator++) {
            for (int ustun = 0; ustun < n; ustun++) {
                boolean chegara = (qator == 0) || (qator == n - 1) || (ustun == 0) || (ustun == n - 1);
                if (chegara) {
                    System.out.print("% ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // 16.
    public void daraja2(int a, int n) {
        int natija = 1;
        for (int i = 1; i <= n; i++) {
            natija = natija * a;
        }
        System.out.println(a + " ning " + n + "-darajasi: " + natija);
    }

    // 17.
    public void ekuk(int a, int b) {
        int x = a;
        int y = b;
        while (y != 0) {
            int qoldiq = x % y;
            x = y;
            y = qoldiq;
        }
        int ekubQiymati = x;
        int ekukQiymati = (a * b) / ekubQiymati;
        System.out.println("EKUK(a, b) = " + ekukQiymati);
    }

    // 18.
    public void konsolShakli18(int n) {
        for (int qator = 1; qator <= n; qator++) {
            for (int k = 1; k <= qator; k++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }

    // 19.
    public void konsolShakli19(int n) {
        for (int i = 1; i <= n - 1; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("+");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    // 20.
    public void konsolShakli20(int n) {
        for (int qator = 1; qator <= n; qator++) {
            for (int k = 1; k <= qator; k++) {
                System.out.print(qator + " ");
            }
            System.out.println();
        }
    }
}