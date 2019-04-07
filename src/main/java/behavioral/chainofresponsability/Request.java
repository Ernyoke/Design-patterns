package behavioral.chainofresponsability;

public class Request {
    private int amount;

    public Request(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
