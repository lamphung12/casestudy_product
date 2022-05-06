package main;

import manager.managerAccount;
import model.Account;
import filecsv.FileAccount;

import java.io.IOException;
import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) throws IOException {
        Scanner scanner =new Scanner(System.in);
        managerAccount Account= new managerAccount();
        int choice = -1;
        while (choice!=0){
            System.out.println("Menu");
            System.out.println("1.Dang nhap");
            System.out.println("2.Dang ky");
            System.out.println("Moi nhap lua chon");
            choice= scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Dang nhap");
                    System.out.println("Nhap vào usn: ");
                    scanner.nextLine();
                    String usn = scanner.nextLine();
                    System.out.println("Nhập vào pass: ");
                    String pass = scanner.nextLine();

                    break;
                case 2:
                    System.out.println("Dang ky");
                    System.out.println("Nhap vao id");
                    int id= scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap vao userName");
                    String userName = scanner.nextLine();
                    System.out.println("Nhap vao passWord");
                    String passWord = scanner.nextLine();
                    System.out.println("Nhap vao Email");
                    String email = regex.regexEmail.getMail();
                    System.out.println("Nhap so dien thoai");
                    int number = scanner.nextInt();

                    Account acc= new Account(id,userName,passWord,email,number);
                    Account.add(acc);

                    FileAccount.writeToFile(Account.getAccountList());

                    break;
                case 3:
                    System.out.println("Bye");

            }
            System.out.println("---------------------------------------------");
        }


    }
}
