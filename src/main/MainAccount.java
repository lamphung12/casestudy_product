package main;

import manager.managerAccount;
import model.Account;
import filecsv.FileAccount;

import java.io.IOException;
import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) throws IOException {
        Scanner scanner =new Scanner(System.in);
        managerAccount managerAccount= new managerAccount();
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
                    if(managerAccount.login(usn,pass)==1){
                         choice =-1;
                         do {
                             if(managerAccount.currentUser.getUserName().equals("Admin")){
                                 System.out.println("Menu Customer");
                                 System.out.println("1:Xem thong tin tai khoan");
                                 System.out.println("2.Doi pass");
                                 System.out.println("3.Them sua xoa tai khoan");
                                 System.out.println("4:Quay ve dang nhap");
                             }else{
                                 MainReceipt.menu();
                             }

                             System.out.println("Nhap vao lua chon");
                               int choice1 = scanner.nextInt();
                               if (choice1 == 4) break;
                             switch (choice1){
                                 case 1:
                                     managerAccount.display();
                                     break;
                                 case 2:
                                     System.out.println("Nhap pass moi");
                                     scanner.nextLine();
                                     String newPass= scanner.nextLine();
                                     managerAccount.currentUser.setPassWord(newPass);
                                     FileAccount.writeToFile(managerAccount.getAccountList());
                                     break;
                                 case 3:
                                     System.out.println("1.Them tai khoan");
                                     System.out.println("2.Sua tai khoan");
                                     System.out.println("3.Xoa tai");
                                     int choice2=scanner.nextInt();
                                        switch (choice2) {
                                           case 1:
                                              System.out.println("Nhap tai khoan can them");
                                              System.out.println("Nhap vao id");
                                              int id = scanner.nextInt();
                                              scanner.nextLine();
                                              System.out.println("Nhap userName ");
                                              String userName = scanner.nextLine();
                                              System.out.println("Nhap passWord");
                                              String passWord = scanner.nextLine();
                                              System.out.println("Nhap vao Email");
                                              String email = scanner.nextLine();
                                              System.out.println("Nhap so dien thoai");
                                              int number = scanner.nextInt();
                                              Account acc = new Account(id, userName, passWord, email, number);
                                              managerAccount.add(acc);
                                              FileAccount.writeToFile(managerAccount.getAccountList());
                                               break;
                                           case 2:
                                              System.out.println("Sua tai khoan");
                                              System.out.println("Nhap id cua tai khoan can sua");
                                              int id1 = scanner.nextInt();
                                              System.out.println("Nhap vao id");
                                              int idSua = scanner.nextInt();
                                              scanner.nextLine();
                                              System.out.println("Nhap userName ");
                                              String userNameSua = scanner.nextLine();
                                              System.out.println("Nhap passWord");
                                              String passWordSua = scanner.nextLine();
                                              System.out.println("Nhap vao Email");
                                              String emailSua = scanner.nextLine();
                                              System.out.println("Nhap so dien thoai");
                                              int numberSua = scanner.nextInt();
                                              Account accSua = new Account(idSua, userNameSua, passWordSua, emailSua, numberSua);
                                              managerAccount.edit(id1, accSua);

                                                break;
                                           case 3:
                                              System.out.println("Xoa tai khoan");
                                              System.out.println("Nhap id tai khoan can xoa");
                                              int idXoa = scanner.nextInt();
                                              managerAccount.delete(idXoa);
                                                break;
                                            case 4:

                                 }
                             }
                         }while (choice!=0);
                    }

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
                    String email = scanner.nextLine();
                    System.out.println("Nhap so dien thoai");
                    int number = scanner.nextInt();

                    Account acc= new Account(id,userName,passWord,email,number);
                    managerAccount.add(acc);

                    FileAccount.writeToFile(managerAccount.getAccountList());

                    break;
                case 3:
                    System.exit(0);
                    System.out.println("Bye");


            }


            System.out.println("---------------------------------------------");
        }


    }
}
