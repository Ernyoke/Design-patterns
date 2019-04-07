package behavioral.chainofresponsibility;

public class Request {
    private int amount;

    public Request(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
