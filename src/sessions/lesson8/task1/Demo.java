package sessions.lesson8.task1;

public class Demo {
    public static void main(String[] args) {
        Laptop samsungLaptop = new SamsungLaptop();
        Laptop macbookLaptop = new MacbookLaptop();
        Seller seller = new Seller();
        seller.startLaptop(samsungLaptop);
        seller.startLaptop(macbookLaptop);
    }
}