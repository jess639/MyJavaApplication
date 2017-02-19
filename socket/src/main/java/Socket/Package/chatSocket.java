package Socket.Package;
import java.io.IOException;
import java.net.Socket;
/**
 * Created by Jess on 2017/2/15.
 */
public class chatSocket extends Thread {
    Socket socket ;
    public chatSocket(Socket socket){
        this.socket = socket;
    }

    public void out(String out){
        try {
            socket.getOutputStream().write(out.getBytes("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {

     int count =0;
        while (true){
            count++;
            out("loop+"+count);
            try {
                Thread.sleep(1111);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
