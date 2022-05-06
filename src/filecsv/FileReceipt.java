package filecsv;

import manager.managerReceipt;
import manager.managerRoom;
import model.Receipt;
import model.Room;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReceipt {
    public static List<Receipt> readFromFile() throws FileNotFoundException {
        managerRoom managerRoom = new managerRoom();

        File file= new File("receipt.csv");
        List<Receipt> list = new ArrayList<>();
        Scanner sc= new Scanner(file);
        sc.nextLine();
        while (sc.hasNext()){
            String line = sc.nextLine();
            if(line.equals("")){
                break;
            }
            String arr[] = line.split(",");
            Room room = managerRoom.findById(Integer.parseInt(arr[4]));
          Receipt receipt1 = new Receipt(Integer.parseInt(arr[0]),Integer.parseInt(arr[1])
                  ,Integer.parseInt(arr[2]),arr[3],room );
          list.add(receipt1);
        }
        return list;
    }

    public static void writeToFile(List<Receipt>list) throws FileNotFoundException {
        File file = new File("receipt.csv");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("id,startTime,endTime,rentalAgentName,room,totalRent\n");
        for (int i = 0; i < list.size(); i++) {
            printWriter.println(list.get(i));
        }

        printWriter.close();

    }
}
