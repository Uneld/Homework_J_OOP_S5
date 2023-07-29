package Task2;

public class UserManagementApp {
    public static void main(String[] args) {
        UserModel model = new UserModel();
        UserView view = new UserView();
        UserPresenter presenter = new UserPresenter(model, view);

        view.showUserData(model);
        presenter.registerUser();
        presenter.loginUser();
        view.showUserData(model);
        presenter.changePassword();
        view.showUserData(model);
    }
}
