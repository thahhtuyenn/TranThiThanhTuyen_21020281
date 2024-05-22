package com.thanhtuyen.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Scanner;
 
import com.thanhtuyen.server.utils.AppUtils;
import com.thanhtuyen.server.utils.RequestDTO;
import com.thanhtuyen.server.utils.ResponseDTO;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		try (Socket socket = new Socket(AppUtils.HOST, AppUtils.PORT);
				Scanner scanner = new Scanner(System.in);
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream())) {
			int choice = 0;
			System.out.println("Connect to server...");
			RequestDTO request = null;
			while (true) {
				System.out.println("------ MENU ------");
				System.out.println("1. ");
				System.out.println("2. ");
				System.out.println("3. ");
				System.out.print("Choose an option: ");
				choice = scanner.nextInt(); scanner.nextLine();
				switch (choice) {
				case 1: {
					request = new RequestDTO();
					
					break;
				}
				default:
					break;
				}
			}
		}
	}

}
