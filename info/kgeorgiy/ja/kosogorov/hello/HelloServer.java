package info.kgeorgiy.ja.kosogorov.hello;

public interface HelloServer extends AutoCloseable {
    void start(int port, int threads);
}
