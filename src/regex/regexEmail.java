package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regexEmail {
    public static String getMail(){
        Scanner sc= new Scanner(System.in);
        while (true){
            System.out.println("Nhap email can kiem tra");
            String  mail = sc.nextLine();
            Pattern p = Pattern.compile("^[A-Za-z][A-Za-z0-9]+@[A-Za-z]+(\\\\.[A-Za-z]{1,3})$");
            if(p.matcher(mail).matches()){
                System.out.println(mail);
            }else{
                System.out.println("Vui long nhap lai mail");
            }
        }
    }


}
