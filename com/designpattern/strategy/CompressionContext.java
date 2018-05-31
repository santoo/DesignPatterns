package com.designpattern.strategy;

public class CompressionContext {
    private CompressionStratergy compressionStratergy;

    public  CompressionContext(CompressionStratergy compressionStratergy){
        this.compressionStratergy=compressionStratergy;
    }


    public void createArchives(String files){
        compressionStratergy.compressFile(files);
    }
}
