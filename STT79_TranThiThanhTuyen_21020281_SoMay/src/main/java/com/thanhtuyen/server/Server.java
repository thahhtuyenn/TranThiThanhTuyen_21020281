package com.thanhtuyen.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.thanhtuyen.server.entity.Gender;
import com.thanhtuyen.server.entity.Person;
import com.thanhtuyen.server.utils.AppUtils;
import com.thanhtuyen.server.utils.RequestDTO;
import com.thanhtuyen.server.utils.ResponseDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class Server {
	public static void main(String[] args) throws IOException {
		try (ServerSocket server = new ServerSocket(AppUtils.PORT)) {
			System.out.println("Server is running on port: " + AppUtils.PORT);
			while (true) {
				Socket client = server.accept();
				System.out.println("Client connected: " + client.getInetAddress().getHostAddress());
				Server serverTemp = new Server();
				new Thread(serverTemp.new HandlerClient(client)).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public class HandlerClient implements Runnable {
		private Socket client;
		

		public HandlerClient(Socket client) {
			this.client = client;
		}


		@Override
		public void run() {
			try (ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
					ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream())) {
				while (true) {
					RequestDTO request = (RequestDTO) ois.readObject();
					System.out.println("Request received: " + request.getRequest());

					switch (request.getRequest()) {
					case "": {
						
						break;
					}

					default: {
						ResponseDTO response = new ResponseDTO("error", "Invalid request");
						oos.writeObject(response);
						oos.flush();
						break;
					}

					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
