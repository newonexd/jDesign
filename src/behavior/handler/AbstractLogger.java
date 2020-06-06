package behavior.handler;

public abstract class AbstractLogger {
    static int INFO = 1;
    static int DEBUG = 2;
    static int ERROR = 3;

    protected AbstractLogger logger;
    protected int level;

    public void setLogger(AbstractLogger logger) {
        this.logger = logger;
    }

    protected abstract void write(String message);

    public void log(int level, String message) {
        if (this.level <= level)
            write(message);
        if (this.logger != null)
            this.logger.log(level, message);
    }
}

class InfoLogger extends AbstractLogger {
    public InfoLogger() {
        this.level = INFO;
    }

    @Override
    protected void write(String message) {
        System.out.println("Info Log::Logger:" + message);
    }
}

class DebugLogger extends AbstractLogger {
    public DebugLogger() {
        this.level = DEBUG;
    }

    @Override
    protected void write(String message) {
        System.out.println("Debug Log::Logger:" + message);
    }
}

class ErrorLogger extends AbstractLogger {
    public ErrorLogger() {
        this.level = ERROR;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Log::Logger:" + message);
    }
}