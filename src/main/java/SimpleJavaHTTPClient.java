import utils.Logger;

import java.io.IOException;
import java.net.*;
/**
 * Created by cho.oh on 4/28/2017 AD.
 */
public class SimpleJavaHTTPClient {
    private static Logger logger = new Logger(SimpleJavaHTTPServer.class.getSimpleName());

    public static void main(String[] args) throws IOException {

        final String host = "localhost";
        final int portNumber = 8000;

        SocketAddress sockAddr = new InetSocketAddress(host, portNumber);
        Socket socket = new Socket(host, portNumber);

        socket.connect(sockAddr);
        socket.close();

    }
}
