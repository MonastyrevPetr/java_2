package hw6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    static ServerSocket server;
    static Socket socket;
    static final int PORT = 8189;
    static DataInputStream in;
    static DataOutputStream out;

    public static void main(String[] args) {
        try {
            server = new ServerSocket(PORT);
            System.out.println("Server started");
            socket = server.accept();
            System.out.println("Client connected");
            in=new DataInputStream(socket.getInputStream());
            out=new DataOutputStream(socket.getOutputStream());

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
                            System.out.println("Client " + str);

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
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
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
