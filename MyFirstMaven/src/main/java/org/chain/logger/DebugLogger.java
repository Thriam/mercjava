package org.chain.logger;

class DebugLogger extends Logger {

    public DebugLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("DEBUG: " + message);
    }
}
