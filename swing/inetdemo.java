import java.net.*;
public class inetdemo {
    public static void main(String args[]) throws UnknownHostException {
        InetAddress addr=InetAddress.getLocalHost();
        System.out.println(addr);
        addr=InetAddress.getByName("www.msbte.ac.in");
        System.out.println(addr);
        System.out.println("is muli"+addr.isMulticastAddress());
        InetAddress add[]=InetAddress.getAllByName("www.msbte.ac.in");
        for(int i=0;i<add.length;i++) {
            System.out.println(add[i]);

        }
    }
}
