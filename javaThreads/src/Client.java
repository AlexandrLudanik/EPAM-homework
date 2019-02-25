public class Client implements Runnable {

    private final static int WAITING_TIME = 100;
    private int id;
    private CallCenter callCenter;

    public int getId() {
        return id;
    }

    public Client(CallCenter callCenter, int id) {
        this.callCenter = callCenter;
        this.id = id;
    }

    public void run() {
        Operator operator = null;
        while (operator == null) {
            System.out.println("incoming call from CLIENT " + this.id);
            operator = callCenter.tryCall(this, WAITING_TIME);
        }
        System.out.println("CLIENT : " + this.id + " talking  with OPERATOR : " + operator.getId());
        operator.talk();

        if (operator != null) {
            System.out.println("CLIENT " + getId() + " end call with OPERATOR " + operator.getId());
            callCenter.endCall(operator);
        }
    }
}