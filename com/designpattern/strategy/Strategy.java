package com.designpattern.strategy;

public class Strategy {
    public  static void main(String args[]){
        CompressionContext compressionContext=new CompressionContext(new TarCompression());
        compressionContext.createArchives("Songs");
    }
}
