package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    Scanner sc= new Scanner(System.in);
    public static final String Username_Regex = "^\\w{3,7}$";
    public static final String Password_Regex = "^\\w{1,6}$";
    public static final String Email_Regex = "^\\w+@\\w+\\.[A-Z]{2,4}$";
    public static final String PhoneNumber_Regex = "^08+\\d{8}$";

    public Validate() {
    }

    public String checkUserName(){
        Pattern pattern = Pattern.compile(Username_Regex);
        String userName;
        do {
            System.out.println("Nhap ten tai khoan");
            userName= sc.nextLine();
            if(!pattern.matcher(userName).matches()){
                System.out.println(userName + "Ten khong hop le");
            }else{
                break;
            }
        }while (true);
        return userName;

    }

    public String checkPassword(){
        Pattern pattern = Pattern.compile(Password_Regex);
        String passWord;
        do {
            System.out.println("Nhap passWord");
            passWord= sc.nextLine();
            if(!pattern.matcher(passWord).matches()){
                System.out.println(passWord + "PassWord khong hop le");
            }else{
                break;
            }
        }while (true);
        return passWord;
    }

    public String checkEmail(){
        Pattern pattern = Pattern.compile(Email_Regex);
        String Email;
        do {
            System.out.println("Nhap Email");
            Email= sc.nextLine();
            if(!pattern.matcher(Email).matches()){
                System.out.println(Email + "Email khong hop le");
            }else{
                break;
            }
        }while (true);
        return Email;

    }

    public int checkPhone() {
        Pattern pattern = Pattern.compile(PhoneNumber_Regex);
        String phoneNumber;
        do {
            System.out.println("Nhap so dien thoai");
            phoneNumber = sc.nextLine();
            if (!pattern.matcher(phoneNumber).matches()) {
                System.out.println(phoneNumber + "So dien thoai khong hop le");
            } else {
                break;
            }
        } while (true);


        return 0;
    }

}




