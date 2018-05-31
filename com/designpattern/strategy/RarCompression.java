package com.designpattern.strategy;

public class RarCompression implements CompressionStratergy{
    @Override
    public void compressFile(String files) {
        System.out.println("File: "+files+" compressed in rar mode >> "+files+".rar");
    }
}
