import com.fastcgi.FCGIInterface;
import java.io.*;
import static java.lang.System.out;

class TinyFCGI {
    public static void main (String args[]) {
        int count = 0;
        FCGIInterface fcgiinterface = new FCGIInterface();
        while(fcgiinterface.FCGIaccept() >= 0) {
            count++;
            out.println("Content-type: text/html\n\n");
            out.println("<html>");
            out.println(
                "<head><TITLE>FastCGI-Hello Java stdio</TITLE></head>");
            out.println("<body>");
            out.println("<H3>FastCGI-HelloJava stdio</H3>");
            out.println("request number " + count +
                               " running on host "
                               + System.getProperty("SERVER_NAME"));
            out.println("</body>");
            out.println("</html>");
        }
    }
}
