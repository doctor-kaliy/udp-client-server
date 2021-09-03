package info.kgeorgiy.ja.kosogorov.hello;

public interface HelloClient {
    void run(String host, int port, String prefix, int threads, int requests);
}
