package manager;

import model.Account;

import java.util.ArrayList;
import java.util.List;

public class managerAccount implements General<Account>{
    private List<Account>accountList = new ArrayList<>();
    public static Account currentUser = null;

    public managerAccount() {

    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    @Override
    public void add(Account account) {
        accountList.add(account);

    }

    @Override
    public void edit(int id, Account account) {
        accountList.set(findIndexById(id), account);
    }

    @Override
    public void delete(int id) {
        accountList.remove(findIndexById(id));
    }

    @Override
    public Account findById(int id) {
        return accountList.get(findIndexById(id));

    }

    @Override
    public void display() {
        for (int i = 0; i <accountList.size() ; i++) {
            System.out.println(accountList.get(i));
        }
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public int login(String username, String password) {
        for (Account account : accountList) {
            if (account.getUserName().equals(username) && account.getPassWord().equals(password)) {
            currentUser = account;
                return 1;
            }
        }
        return 0;
    }
}
