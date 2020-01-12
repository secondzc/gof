package com.meituan.gof.strategy;

import com.meituan.gof.LogWriter;

public class ConsoleLogger implements LogWriter {
    @Override
    public void info(String msg) {
        System.out.println(msg);
    }
}
