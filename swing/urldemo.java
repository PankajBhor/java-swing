import java.net.*;
public class urldemo {
    public static void main(String args[]) throws MalformedURLException{
        URL u1=new URL("https://www.google.com:80/about.html");
        System.out.println("Hostname: "+u1.getHost());
        System.out.println("Protocol: "+u1.getProtocol());
        System.out.println("File: "+u1.getFile());
        System.out.println("Port: "+u1.getPort());
        System.out.println("Path: "+u1.getPath());
    }
}
