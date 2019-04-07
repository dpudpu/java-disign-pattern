package exam03;

public class Member {
    private String name;
    private int totalSpend;

    public Member(String name) {
        this.name = name;
        totalSpend = 0;
    }

    // 회원은 하나의 책을 1권 이상 살 수 있다.
    // 회원이 책을 살 때마다 누적 금액이 저장된다.
    public void buyBook(int price){
        this.totalSpend += price;
    }

    public String getName() {
        return name;
    }

    public int getTotalSpend() {
        return totalSpend;
    }
}
