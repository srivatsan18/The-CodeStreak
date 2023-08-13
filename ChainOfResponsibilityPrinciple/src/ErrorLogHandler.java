public class ErrorLogHandler implements LogHandler{

    @Override
    public void handleRequest(LogLeveller level) {
        System.out.println("This is an Error Log");
    }

    @Override
    public void setNextHandler(LogHandler nextHandler) {
        //Do  nothing
    }
}
