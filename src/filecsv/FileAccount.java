package filecsv;

import model.Account;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileAccount {
    public static List<Account> readFromFile() throws FileNotFoundException {
        File file = new File("/Users/macpro/IdeaProjects/CastudyModul2/acc1.csv");
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

    public static void writeToFile(List<Account>list) throws IOException {
        File file = new File("/Users/macpro/IdeaProjects/CastudyModul2/acc1.csv");

        PrintWriter printWriter = new PrintWriter(file);
        BufferedWriter bf = new BufferedWriter(printWriter);
        printWriter.print("id,userName,passWord,email,numberPhone\n");
        for (int i = 0; i <list.size() ; i++) {
            printWriter.println(list.get(i));
        }
        printWriter.close();
        bf.close();
    }
}
