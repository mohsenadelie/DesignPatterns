package com.adeli.strategy;

public class Main {
    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage();
        imageStorage.store("a.xxx",
                new JPEGCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a.xxx",
                new PNGCompressor(), new HighContrastFilter());
    }
}
