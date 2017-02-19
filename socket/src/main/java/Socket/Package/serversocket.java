package Socket.Package;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import sun.rmi.runtime.Log;

public class serversocket {
    public static void main(String args[]) throws IOException {
      new serverThread().start();
    }
}
