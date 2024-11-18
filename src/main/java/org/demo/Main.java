package org.demo;


public class Main {
    public static void main(String[] args) {

        LogProcessor logProcessor =
                new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR, "Exception is there ");
        logProcessor.log(LogProcessor.DEBUG, "Debug log printed...");
        logProcessor.log(LogProcessor.INFO, "Just for info");

    }
}