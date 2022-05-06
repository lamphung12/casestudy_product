package model;

public class Account {
    private int id;
    private String userName;
    private String passWord;
    private String email;
    private int numberPhone;

    public Account() {
    }

    public Account(int id,String userName, String passWord, String email, int numberPhone) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.numberPhone = numberPhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id +"," + userName + ","
                + passWord + ","
                  + email + "," +
               numberPhone ;
    }
}
