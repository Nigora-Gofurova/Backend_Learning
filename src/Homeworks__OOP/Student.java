package Homeworks__OOP;

public class Student {

        private String name;
        private int age;
        private double gpa;
        private int credits;

        public Student(String name, int age, double gpa, int credits) {
            this.setName(name);
            this.setAge(age);
            this.setGpa(gpa);
            this.setCredits(credits);
        }

        public void setName(String name) {
            if (name == null || name.isEmpty()) {
                System.out.println("Xato: ism bo'sh bo'lmasligi kerak!");
            } else {
                this.name = name;
            }
        }

        public void setAge(int age) {
            if (age < 16 || age > 60) {
                System.out.println("Xato: yosh noto'g'ri kiritildi!");
            } else {
                this.age = age;
            }
        }

        public void setGpa(double gpa) {
            if (gpa < 0 || gpa > 4) {
                System.out.println("Xato: GPA 0 dan 4 gacha bo'lishi kerak!");
            } else {
                this.gpa = gpa;
            }
        }

        public void setCredits(int credits) {
            if (credits < 0) {
                System.out.println("Xato: kredit manfiy bo'la olmaydi!");
            } else {
                this.credits = credits;
            }
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getGpa() {
            return gpa;
        }

        public int getCredits() {
            return credits;
        }

        public boolean isPassing() {
            return gpa >= 2.0;
        }

        public String getGradeLevel() {
            if (credits < 30) return "Freshman";
            else if (credits < 60) return "Sophomore";
            else if (credits < 90) return "Junior";
            else return "Senior";
        }
    }

