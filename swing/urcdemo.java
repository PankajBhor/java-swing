import java.net.*;
import java.util.*;
import java.io.*;
public class urcdemo {
    public static void main(String args[]) throws MalformedURLException,IOException{
        URL u1=new URL("https://www.google.com");
        URLConnection u2=u1.openConnection();
        System.out.println("Hostname: "+u2.getContentType());
        System.out.println("Protocol: "+new Date(u2.getDate()));
        System.out.println("File: "+new Date(u2.getLastModified()));
        System.out.println("Port: "+new Date(u2.getExpiration()));
        System.out.println("Path: "+u2.getContentLength());
    }
}
