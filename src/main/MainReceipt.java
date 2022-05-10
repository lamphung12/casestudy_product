package main;

import filecsv.FileReceipt;
import manager.managerReceipt;
import manager.managerRoom;
import model.Receipt;
import model.Room;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class MainReceipt {
    public static void menu() throws FileNotFoundException {
        managerReceipt managerReceipt = new managerReceipt();
        managerRoom managerRoom= new managerRoom();
        Scanner scanner = new Scanner(System.in);
        Receipt receipt = new Receipt();

        int choice = -1;
        while (choice!=0) {
            System.out.println("-----MENU");
            System.out.println("---VUI LONG LUA CHON----");
            System.out.println("1.Hien thi hoa don thanh toan\n" +
                    "2.Them hoa don dat phong\n" +
                    "3.Danh sach phong con trong\n" +
                    "4.Sua thong tin hoa don\n" +
                    "5.Xoa hoa don\n" +
                    "6.Ghi vao file\n" +
                    "7.Doc tu file\n" +
                    "8.Sap xep hoa don theo gia tu cao den thap\n" +
                    "9.Thoat\n"
            );
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    managerReceipt.display();
                    break;
                case 2:
                    System.out.println("Them hoa don dat phong");
                    System.out.println("Nhap id hoa don");
                    int id = scanner.nextInt();
                    System.out.println("Nhap thoi gian bat dau thue");
                    int startTime = scanner.nextInt();
                    System.out.println("Nhap thoi gian ket thuc ");
                    int endTime = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap ten nguoi cho thue");
                    String name= scanner.nextLine();
                    System.out.println("Nhap vao id room");
                    managerRoom.printRoomCon("c");
                    int idRoom = scanner.nextInt();
                    Room room = managerRoom.findById(idRoom);

                    Receipt receipt1 = new Receipt(id,startTime,endTime,name,room);
                    managerReceipt.add(receipt1);
                    FileReceipt.writeToFile(managerReceipt.getReceiptList());
                    break;

                case 3:
                    System.out.println(" Danh sach phong con trong");
                    String con= scanner.nextLine();
                    managerRoom.printRoomCon(con);

                    break;

                case 4:
                    System.out.println("Nhap id hoa don can sua");
                    int idd= scanner.nextInt();
                    System.out.println("Nhap id hoa don can sua ");
                    int idSua = scanner.nextInt();
                    System.out.println("Nhap thoi gian bat dau thue");
                    int startTimeSua = scanner.nextInt();
                    System.out.println("Nhap thoi gian ket thuc ");
                    int endTimeSua = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap ten nguoi cho thue");
                    String nameSua= scanner.nextLine();
                    System.out.println("Nhap vao id room");
                    managerRoom.display();

                    int idRoomSua = scanner.nextInt();
                    Room room1 = managerRoom.findById(idRoomSua);
                    Receipt receipt2 = new Receipt(idSua,startTimeSua,endTimeSua,nameSua,room1);
                    managerReceipt.edit(idd,receipt2);
                    break;
                case 5:
                    System.out.println("Nhap id xoa");
                    int idXoa = scanner.nextInt();
                    managerReceipt.delete(idXoa);
                    break;
                case 6:
                    break;
                case 7:

                case 8:
                    managerReceipt.sapXep();
                    break;
                case 9:
                    System.exit(0);
                    break;
            }
        }

    }
    public static void main(String[] args) throws FileNotFoundException {
        menu();
    }
}
