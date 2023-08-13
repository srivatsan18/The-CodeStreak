public interface LogHandler {
    void handleRequest(LogLeveller level);
    void setNextHandler(LogHandler nextHandler);
}
