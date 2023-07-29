package Task2;

import java.io.*;

public class UserModel {
    private final String defaultString = "Default";
    private final String fileName = "user.txt";
    private User user;

    private boolean flagSuccessRead = false;

    public UserModel() {
        this.user = new User(defaultString, defaultString, defaultString);

        loadUserData();
    }

    public boolean isFlagSuccessRead() {
        return flagSuccessRead;
    }

    public String getName() {
        return user.getName();
    }

    public String getLogin() {
        return user.getLogin();
    }

    public String getPassword() {
        return user.getPassword();
    }

    public boolean checkUser(DataUserView dataUserView) {
        return this.user.getName().equals(dataUserView.getName()) && this.user.getLogin().equals(dataUserView.getLogin()) && this.user.getPassword().equals(dataUserView.getPassword());
    }

    public boolean validateUserDefaultInModel() {
        String name = user.getName();
        String login = user.getLogin();
        String password = user.getPassword();
        return !(name.equals(defaultString) || login.equals(defaultString) || password.equals(defaultString));
    }

    public DataUserView getDataUserView() {
        DataUserView data = new DataUserView();
        data.setName(user.getName());
        data.setLogin(user.getLogin());
        data.setPassword(user.getPassword());

        return data;
    }

    boolean validateLogPass(DataUserView dataUserView) {
        return this.user.getLogin().equals(dataUserView.getLogin()) && this.user.getPassword().equals(dataUserView.getPassword());
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.user.setPassword(password);
    }

    // Методы сохранения и загрузки данных пользователя
    public void saveUserData() {
        if (validateUserDefaultInModel()) {
            try (FileWriter writer = new FileWriter(fileName)) {
                String writeData = user.getName() + "," + user.getLogin() + "," + user.getPassword();
                writer.write(writeData);
                System.out.println("Запись завершена.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Не верные данные пользователя");
        }
    }

    public void loadUserData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String readLine = reader.readLine();
            String[] readData = readLine.split(",");
            if (readData.length == 3) {
                user.setName(readData[0]);
                user.setLogin(readData[1]);
                user.setPassword(readData[2]);
                flagSuccessRead = true;
                System.out.println("Считывание завершено");
            } else {
                System.out.println("Ошибка данных файла");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл отсутствует");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
