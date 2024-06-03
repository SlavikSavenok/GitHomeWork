package homeWork_9_2;

public class Main {
    public static void main(String[] args) {
        String login;
        String password;
        String confirmPassword;

    }
    public boolean CheckException(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
            if (login.length() > 20 || login.contains(" ")) {
                throw new WrongLoginException();
            }

            if (password.length() > 20 || password.contains(" ") || !password.contains("1") || !password.equals(confirmPassword))
                throw new WrongPasswordException();
            return true;
    }
}
