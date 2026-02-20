package org.chain.logger;

class ErrorLogger extends Logger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}
