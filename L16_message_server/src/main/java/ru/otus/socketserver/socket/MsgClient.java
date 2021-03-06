package ru.otus.socketserver.socket;

import ru.otus.socketserver.messages.Msg;

import java.io.IOException;

/**
 * Created by tully.
 */
public interface MsgClient {
    void send(Msg msg);

    Msg pool();

    Msg take() throws InterruptedException;

    void close() throws IOException;

    void register();
}
