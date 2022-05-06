package filecsv;

import model.Room;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRoom {
    public static List<Room> readFromFile() throws FileNotFoundException {
        File file= new File("room.csv");
        List<Room> roomList = new ArrayList<>();
        Scanner sc= new Scanner(file);
        sc.nextLine();
        while (sc.hasNext()){
            String line = sc.nextLine();
            if(line.equals("")){
                break;
            }
            String arr[] = line.split(",");
            roomList.add(new Room(Integer.parseInt(arr[0]),arr[1],arr[2],Integer.parseInt(arr[3]),Integer.parseInt(arr[4])));
        }
        return roomList;
    }

    public static void writeToFile(List<Room>list) throws FileNotFoundException {
        File file = new File("room.csv");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("id,nameRoom,Status,priceRoom,Number\n");
        for (int i = 0; i < list.size(); i++) {
           printWriter.println(list.get(i));
        }

        printWriter.close();

    }


}
