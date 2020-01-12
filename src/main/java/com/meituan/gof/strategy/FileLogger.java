package com.meituan.gof.strategy;

import com.meituan.gof.LogWriter;

public class FileLogger implements LogWriter {
    @Override
    public void info(String msg) {
        // get file
        // write to file
        // close resource
    }
}
