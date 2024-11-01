package org.example.jdk_server_hw.src.server.server.repository;

public interface Repository<T> {
    void save(T text);
    T load();
}
