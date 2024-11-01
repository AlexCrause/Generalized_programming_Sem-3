package org.example.jdk_server_hw.src.server.server.ui;

import org.example.jdk_server_hw.src.server.server.domain.ServerController;

public interface ServerView {
    void showMessage(String message);
    void setServerController(ServerController serverController);
}
