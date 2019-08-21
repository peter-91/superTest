public class TestData {
    public enum User {
        correctuser("tunein.user125@gmail.com", "Tunein123"),
        incorrectuser("tunein.user125@gmail.com", "unein123");

        private final String email;
        private final String password;

        User(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public String NAME() {
            return email;
        }

        public String PASSWORD() {
            return password;
        }

    }
}
