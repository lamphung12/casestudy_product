package manager;

import filecsv.FileReceipt;
import model.Receipt;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class managerReceipt implements General<Receipt>{
   private List<Receipt>receiptList = new ArrayList<>();

    public managerReceipt() throws FileNotFoundException {
        receiptList = FileReceipt.readFromFile();
    }

    public List<Receipt> getReceiptList() {
        return receiptList;
    }

    public void setReceiptList(List<Receipt> receiptList) {
        this.receiptList = receiptList;
    }

    @Override
    public void add(Receipt receipt) {
     receiptList.add(receipt);

    }

    @Override
    public void edit(int id, Receipt receipt) {
     receiptList.set(findIndexById(id), receipt);
    }

    @Override
    public void delete(int id) {
     receiptList.remove(findIndexById(id));
    }

    @Override
    public Receipt findById(int id) {
       return receiptList.get(findIndexById(id));

    }


//    public Receipt findById(int id) {
//     return receiptList.get(findIndexById(id));
//    }

    @Override
    public void display() {
     for (int i = 0; i <receiptList.size() ; i++) {
      System.out.println(receiptList.get(i));
     }
    }

    @Override
    public int findIndexById(int id) {
     for (int i = 0; i < receiptList.size(); i++) {
      if (receiptList.get(i).getId() == id) {
       return i;
          }
     }
     return -1;

    }
}
