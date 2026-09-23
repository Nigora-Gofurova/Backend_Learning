package Homeworks__OOP;

public class Book {
        private String title;
        private String author;
        private boolean borrowed;
        private String borrowerName;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.borrowed = false;
            this.borrowerName = null;
        }

        public boolean isAvailable() {
            return !borrowed;
        }

        public boolean canBeBorrowed() {
            return isAvailable();
        }

        public void borrow(String personName) {
            if (canBeBorrowed()) {
                borrowed = true;
                borrowerName = personName;
                System.out.println(personName + " kitobni oldi: " + title);
            } else {
                System.out.println("Kitob band, olib bo'lmaydi: " + title);
            }
        }

        public void returnBook() {
            if (borrowed) {
                System.out.println(borrowerName + " kitobni qaytardi: " + title);
                borrowed = false;
                borrowerName = null;
            } else {
                System.out.println("Bu kitob band emas edi, qaytarish shart emas.");
            }
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }

