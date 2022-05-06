package filecsv;

import model.Account;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileAccount {
    public static List<Account> readFromFile() throws FileNotFoundException {
        File file = new File("acc.csv");
        List<Account>accountList =new ArrayList<>();
        Scanner sc= new Scanner(file);
        sc.nextLine();
        while (sc.hasNext()){
            String line = sc.nextLine();
            if(line.equals("")){
                break;
            }
            String arr[] = line.split(",");
            accountList.add(new Account(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],Integer.parseInt(arr[4])));
        }
       return accountList;
    }

    public static void writeToFile(List<Account>list) throws FileNotFoundException {
        File file = new File("acc.csv");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.print("id,userName,passWord,email,numberPhone\n");
        for (int i = 0; i <list.size() ; i++) {
            printWriter.print(list.get(i));
        }
        printWriter.close();
    }
}
