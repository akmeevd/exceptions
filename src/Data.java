public class Data {

    public static boolean inputData(String login, String password, String confirmPassword) throws WrongLoginException,
            WrongPasswordException {
        if (!login.matches("^[0-9a-zA-Z_]*$") || login.length() > 20 || login.length() <= 0) {
            throw new WrongLoginException("Некорректно");
        }
        if (!password.matches("^[0-9a-zA-Z_]*$") || password.length() > 20 || password.length() <= 0) {
            throw new WrongPasswordException("Некорректно");
        }
        if (confirmPassword != password) {
            throw new WrongPasswordException("Некорректно");
        }
        return true;
    }
}