package Problem_Solving_Day_9;

public class class_9 {
    //1
    public void ongaTekislangan(int N) {
        for (int i = 1; i <= N; i++) {
            int soni = N - i + 1;

            for (int p = 1; p < i; p++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= soni; j++) {
                System.out.print("*");
                if (j != soni) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //2
    public void shakl(int N){
          for (int i = 1; i <= N; i++) {
              for (int j = 1; j <= i; j++) {
                  System.out.print(" ");
              }
              if (i != N) {
                  System.out.print("*");
              }
          }
          System.out.println();
    }
    //3
    public void ekub(int a, int b) {
        int natija = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                natija = i;
            }
        }
        System.out.println("EKUB: " + natija);
    }
    //5
    public void ekuk(int a, int b) {
        int katta = Math.max(a, b);
        int natija = katta;

        while (true) {
            if (natija % a == 0 && natija % b == 0) {
                break;
            }
            natija++;
        }

        System.out.println("EKUK: " + natija);
    }
    //6
    public void ekubVaEkuk(int a, int b) {
        int ekubNatija = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                ekubNatija = i;
            }
        }

        int ekukNatija = Math.max(a, b);
        while (true) {
            if (ekukNatija % a == 0 && ekukNatija % b == 0) {
                break;
            }
            ekukNatija++;
        }

        System.out.println("EKUB: " + ekubNatija);
        System.out.println("EKUK: " + ekukNatija);
    }
    //7
    public void yigindi(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + 1.0 / i;
        }
        System.out.println("Yig'indi: " + s);
    }
    //8
    public void sonlarniTakrorlash(int a, int b) {
        for (int son = a; son <= b; son++) {
            for (int marta = 1; marta <= son; marta++) {
                System.out.print(son);
            }
        }
        System.out.println();
    }
    //9
    public void uchburchak(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
                if (j != i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //10
    public void tubSonlarniChiqarish(int N) {
        for (int son = 2; son <= N; son++) {
            boolean tubmi = true;
            for (int i = 2; i < son; i++) {
                if (son % i == 0) {
                    tubmi = false;
                    break;
                }
            }
            if (tubmi) {
                System.out.print(son + " ");
            }
        }
        System.out.println();
    }
    //11
    public void xShakli(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (j == i || j == N - i + 1) {
                    System.out.print(N);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    //12
    public void ramka(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //13
    public void xShakliYulduzcha(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (j == i || j == N - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                if (j != N) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //15
        public void yulduzchaSoni(String str) {
            int soni = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '*') {
                    soni++;
                }
            }

            System.out.println("'*' belgisi " + soni + " marta uchraydi");
        }
    }
