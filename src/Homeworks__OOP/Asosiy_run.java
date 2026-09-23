package Homeworks__OOP;

public class Asosiy_run {

    public static void main(String[] args) {
        Student student1 = new Student("Aziz", 20, 3.5, 45);
        Student student2 = new Student("Vali", 19, 1.5, 15);

        System.out.println("--- 1-talaba ---");
        System.out.println("Ism: " + student1.getName());
        System.out.println("Yosh: " + student1.getAge());
        System.out.println("GPA: " + student1.getGpa());
        System.out.println("Kredit: " + student1.getCredits());
        System.out.println("Kurs : " + student1.getGradeLevel());
        System.out.println("O'tyaptimi: " + student1.isPassing());

        System.out.println("\n--- 2-talaba ---");
        System.out.println("Ism: " + student2.getName());
        System.out.println("GPA: " + student2.getGpa());
        System.out.println("Kurs : " + student2.getGradeLevel());
        System.out.println("O'tyaptimi: " + student2.isPassing());

        System.out.println("\n--- Xato kiritish sinovi ---");
        Student student3 = new Student("Kamola", 25, 5.0, 20);
        System.out.println("Kiritilgan GPA: " + student3.getGpa());
    }

    public class BookRunTask {
        public static void main(String[] args) {
            Book book = new Book("Java Asosi", "Bruce Eckel");

            System.out.println("Kitob: " + book.getTitle() + " - " + book.getAuthor());
            System.out.println("Bo'shmi: " + book.isAvailable());

            System.out.println("\n--- Birinchi kishi olmoqchi ---");
            book.borrow("Ali");
            System.out.println("Bo'shmi: " + book.isAvailable());

            System.out.println("\n--- Ikkinchi kishi olmoqchi (band bo'lgani uchun ololmaydi) ---");
            book.borrow("Nigora");

            System.out.println("\n--- Kitobni qaytarish ---");
            book.returnBook();
            System.out.println("Bo'shmi: " + book.isAvailable());

            System.out.println("\n--- Yana qaytarishga urinish (allaqachon qaytarilgan) ---");
            book.returnBook();
        }
        public class UserRunTask {
            public static void main(String[] args) {
                User user1 = new User("Ali", "ali@gmail.com");
                System.out.println("Ism: " + user1.getName());
                System.out.println("Email: " + user1.getEmail());

                System.out.println("\n--- Noto'g'ri email bilan sinov ---");
                try {
                    User user2 = new User("Nigora", "nigoragmail.com");
                    System.out.println("Bu qator ishga tushmaydi");
                } catch (IllegalArgumentException e) {
                    System.out.println("Xato ushlandi: " + e.getMessage());
                }
            }
        }
    }
}


