package com.meituan.gof;

import com.meituan.gof.strategy.ConsoleLogger;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger(Main.class);
        logger.setLogWriter(new ConsoleLogger());
        logger.info("zcy test info");
    }
}
