package behavioral.chainofresponsability;

public class Director extends Handler {
    public void handleRequest(Request request) {
        if (request.getAmount() <= 500) {
            System.out.println("Director can approve requests bellow 500!");
        } else {
            successor.handleRequest(request);
        }
    }
}
