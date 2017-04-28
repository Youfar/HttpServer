import utils.Logger;

import java.io.IOException;
import java.net.*;

public class SimpleJavaHTTPServer {

    private static Logger logger = new Logger(SimpleJavaHTTPServer.class.getSimpleName());

    public static void main(String[] args) throws IOException {

        final int portNumber = 8000;

        ServerSocket serverSocket = new ServerSocket(portNumber);
        logger.log("serving HTTP on localhost port " + portNumber);
        serverSocket.accept();
        logger.log("Hello Request!");
        serverSocket.close();
    }
}
