import java.util.ArrayList;
import java.util.List;


public class CallCenter {
    private final static int NUMBER_TRYING = 2;
    List<Operator> operators = new ArrayList<Operator>();

    public CallCenter(List<Operator> operators) {
        this.operators.addAll(operators);
    }


    public Operator tryCall(Client client, int waitingTime) {
        int numberTrying = 0;
        boolean success = true;
        while (success) {
            for (Operator operator : operators) {
                if (searchFreeOperator(operator, client)) {
                    return operator;
                }
            }
            if (success) {
                numberTrying++;
                if (checkCountTrying(numberTrying, waitingTime, client)) {
                    return null;
                }
            }
        }
        return null;
    }

    public void endCall(Operator operator) {
        operator.setClient(null);
        operators.add(operator);
    }

    private boolean checkCountTrying(int numberTrying, int waitingTime, Client client) {
        if (numberTrying == NUMBER_TRYING) {
            System.out.println("Client " + client.getId() + " put down the phone");
            return true;

        } else {
            System.out.println("Client " + client.getId() + " is waiting for response from operator.");
            try {
                wait(waitingTime);
            } catch (Exception e) {
                System.out.println("Client " + client.getId() + " NO ANSWER");
            }
        }
        return false;

    }

    private boolean searchFreeOperator(Operator operator, Client client) {
        if (operator.getClient() == null) {
            operator.setClient(client);
            operators.remove(operator);
            return true;
        }
        return false;
    }
}