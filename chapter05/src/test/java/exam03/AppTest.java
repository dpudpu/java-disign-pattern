package exam03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
    private Book book;
    private Member member;
    private Sale sale;
    private Store store;

    @Before
    public void setup(){
        book = new Book("자바의신",30000);
        member = new Member("대준");
        store = new Store();
        sale = new SpecialSale();
    }

    @Test
    public void 작동테스트(){
        int quantity = 2;
        store.rent(member, book, quantity, sale);
        Assert.assertEquals((int)(book.getPrice()*quantity*sale.salePercent()), member.getTotalSpend());
    }
}
