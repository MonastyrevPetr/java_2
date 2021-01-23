package hw6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    static Socket socket;
    static final int PORT = 8189;
    static final String IP_ADDRESS="localhost";
    static DataInputStream in;
    static DataOutputStream out;

    public static void main(String[] args) {
        try {
            socket=new Socket(IP_ADDRESS,PORT);
             in = new DataInputStream(socket.getInputStream());
           out = new DataOutputStream(socket.getOutputStream());
            Scanner sc=new Scanner(System.in);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                    while (true) {
                            String str = in.readUTF();
                            if (str.equals("/end")) {
                                System.out.println("Client disconnected");
                                break;
                            }
                            System.out.println("Server " + str);
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();


            while (true) {
                String str = sc.nextLine();
                if (str.equals("/end")) {
                    System.out.println("Server disconnected");
                    break;
                }
                out.writeUTF(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}