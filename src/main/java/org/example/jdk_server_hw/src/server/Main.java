package org.example.jdk_server_hw.src.server;


import org.example.jdk_server_hw.src.server.client.domain.ClientController;
import org.example.jdk_server_hw.src.server.client.ui.ClientGUI;
import org.example.jdk_server_hw.src.server.server.domain.ServerController;
import org.example.jdk_server_hw.src.server.server.repository.FileStorage;
import org.example.jdk_server_hw.src.server.server.ui.ServerWindow;

public class Main {
    public static void main(String[] args) {
        ServerController serverController = new ServerController(new ServerWindow(), new FileStorage());

        new ClientController(new ClientGUI(), serverController);
        new ClientController(new ClientGUI(), serverController);
    }
}
