package facade;

public class AccountService {
    public void login(String username, String password) {
        System.out.println("Logging in user: " + username);
    }

    public void logout() {
        System.out.println("Logging out user.");
    }

    public void subscribe() {
        System.out.println("Subscribing user to the service.");
    }

    public void unsubscribe() {
        System.out.println("Unsubscribing user from the service.");
    }
}
