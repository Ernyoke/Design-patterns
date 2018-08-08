package behavioral.chainofresponsability;

public class VP extends Handler {
    public void handleRequest(Request request) {
        if (request.getAmmount() <= 1000) {
            System.out.println("VP can approve requests bellow 1000!");
        } else {
            successor.handleRequest(request);
        }
    }
}
