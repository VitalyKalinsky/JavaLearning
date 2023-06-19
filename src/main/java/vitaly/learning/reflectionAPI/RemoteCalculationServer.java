package vitaly.learning.reflectionAPI;

import java.rmi.RemoteException;
import java.rmi.Remote;

interface Calculator extends Remote {

    int multiply(int x, int y) throws RemoteException;
}

public class RemoteCalculationServer implements Calculator {

    @Override
    public int multiply(int x, int y) throws RemoteException {
        return x * y;
    }

}
