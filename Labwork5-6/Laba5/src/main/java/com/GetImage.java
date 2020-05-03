package com;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GetImage {

    static String path = "";

    private boolean FindImage(String name)
    {
        File folder = new File(path);
        File[] files = folder.listFiles();

        for (File nameFile:files) {
            String [] splitName = nameFile.getName().split("\\.");

            if (splitName[0].equals(name)) {
                path +=  "/" +  nameFile.getName();  //  Create new path if file find
                return  true;
            }
        }
        return false;
    }


    public BufferedImage GetImage(String name) throws IOException {
        path = "/Users/dima/Desktop/images";
        
        if (this.FindImage(name)) {
             return ImageIO.read( new File(path));
        }
        return null;
    }
}