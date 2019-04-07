package exam03;

public class Store {

    public void rent(Member member, Book book, int quantity, Sale sale){
        member.buyBook((int)(book.getPrice()*quantity*sale.salePercent()));
    }
}
