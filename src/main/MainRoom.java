package main;

import filecsv.FileRoom;
import manager.managerRoom;
import model.Room;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainRoom {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        FileRoom fileRoom = new FileRoom();
        managerRoom managerRoom = new managerRoom();
        int choice = -1;
        while (choice!=0) {
            System.out.println("-----MENU");
            System.out.println("---VUI LONG LUA CHON----");
            System.out.println("1.Hien thi phong\n" +
                    "2.Them phong\n" +
                    "3.Tim phong theo id\n" +
                    "4.Sua thong tin phong\n" +
                    "5.Đoi trang thai, chuyen tu con phong sang het phong\n" +
                    "6.Ghi vao file\n" +
                    "7.Doc tu file\n" +
                    "8.Tim theo so phong ngu\n"+
                    "9.In ra cac phong con trong \n"+
                    "10.Thoat\n"
            );
            choice= sc.nextInt();

            switch (choice){
                case 1:
                    managerRoom.display();
                    break;
                case 2:
                    System.out.println("Nhap id phong");
                    int id =sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhap ten phong");
                    String nameRoom = sc.nextLine();
                    System.out.println("Nhap trang thai phong");
                    String status = sc.nextLine();
                    System.out.println("Nhap gia phong");
                    int price = sc.nextInt();
                    System.out.println("Nhap so phong ngu");
                    int numberOfBed = sc.nextInt();

                    Room room = new Room(id,nameRoom,status,price,numberOfBed);
                    managerRoom.add(room);
                    break;

                case 3:
                    System.out.println("Nhap id phong can tim kiem");
                    int id1 = sc.nextInt();
                    System.out.println(managerRoom.findIndexById(id1));
                    break;

                case 4:
                    System.out.println("Nhap id phong can sua");
                    int id2= sc.nextInt();
                    System.out.println("Nhap id phong can sua");
                    int idSua = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhap ten phong can sua");
                    String nameSua = sc.nextLine();
                    System.out.println("Nhap trang thai phong sua");
                    String statusSua = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Nhap gia phong");
                    int giaSua = sc.nextInt();
                    System.out.println("Nhap so phong ngu");
                    int soPhong = sc.nextInt();
                    Room room1 = new Room(idSua,nameSua,statusSua,giaSua,soPhong);
                    managerRoom.edit(id2,room1);
                 break;

                case 5:
                    System.out.println("Nhap id can chuyen doi");
                    int id4 = sc.nextInt();
                    managerRoom.status(id4);
                    break;
                case 6:
                    FileRoom.writeToFile(managerRoom.getRoomList());
                    break;

                case 7:
                    FileRoom.readFromFile();
                    break;

                case 8:
                    System.out.println("Nhap so phong ngu can tim kiem");
                    int numberRoom = sc.nextInt();
                    managerRoom.displayNumberBedRoom(numberRoom);
                    break;

                case 9:
//                    System.out.println("Nhap trang thai cua phong");
//                    String con= sc.nextLine();
//                    managerRoom.printRoomCon(con);
//                    break;

            }

        }
    }
}
