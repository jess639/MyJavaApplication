package Socket.Package;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.*;
/**
 * Created by Jess on 2017/2/15.
 */
public class EchoThread implements Runnable {

    private Socket socket = null;
    public EchoThread(Socket client){
        this.socket = client;
    }
    @Override
    public void run() {

        BufferedReader bufferedReader =null;
        PrintStream printStream = null;
        try {
            printStream = new PrintStream(socket.getOutputStream());
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            boolean flag=true;
            while (flag){
                String str = bufferedReader.readLine();
                if(str==null || "".equals(str)){
                    flag = false;
                }else{
                    if(str=="bye"){
                        flag = false;
                    }else {
                        printStream.print("echo:"+str);
                    }
                }
            }
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
