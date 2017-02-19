package Socket.Package;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Jess on 2017/2/15.
 */
public class serverThread extends Thread {


    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(123);
            while (true){
                Socket socket = serverSocket.accept();
//                new chatSocket(socket).start();

                new Thread(new EchoThread(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
