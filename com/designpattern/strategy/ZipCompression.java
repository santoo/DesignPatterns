package com.designpattern.strategy;

public class ZipCompression implements CompressionStratergy{
    @Override
    public void compressFile(String files) {
        System.out.println("File "+files+" compressed in Zip mode >>"+files+".zip");
    }
}
