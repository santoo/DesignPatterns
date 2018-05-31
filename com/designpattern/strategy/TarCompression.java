package com.designpattern.strategy;

public class TarCompression implements CompressionStratergy {
    @Override
    public void compressFile(String files) {
        System.out.println("File "+files+" compressed in TAR mode>>"+files+".tar.gz");
    }
}
