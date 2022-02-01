package com.designpatterns.behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        JPEGCompressor jpegCompressor = new JPEGCompressor();
        BlackAndWhiteFilter blackAndWhiteFilter  = new BlackAndWhiteFilter();
        ImageStorage imageStorage = new ImageStorage(jpegCompressor,blackAndWhiteFilter);
        imageStorage.filter();
        imageStorage.compress();

        imageStorage.store("File",jpegCompressor,blackAndWhiteFilter);

    }
}
