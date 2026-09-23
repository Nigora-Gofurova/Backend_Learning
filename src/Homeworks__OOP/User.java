package Homeworks__OOP;

public class User {

        private final String name;
        private final String email;

        public User(String name, String email) {
            if (!email.contains("@")) {
                throw new IllegalArgumentException("Email noto'g'ri: @ belgisi yo'q!");
            }
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }
    }
