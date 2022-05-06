package Manager;

import Model.Receipt;

import java.util.ArrayList;
import java.util.List;

public class managerReceipt implements General<Receipt>{
   private List<Receipt>receiptList = new ArrayList<>();

    public managerReceipt() {
    }

    public List<Receipt> getReceiptList() {
        return receiptList;
    }

    public void setReceiptList(List<Receipt> receiptList) {
        this.receiptList = receiptList;
    }

    @Override
    public void add(Receipt receipt) {

    }

    @Override
    public void edit(int id, Receipt receipt) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Receipt findById(int id) {
        return null;
    }

    @Override
    public void display() {

    }

    @Override
    public int findIndexById(int id) {
        return 0;
    }
}
