package org.glavo.viewer.gui.support;

import java.net.URL;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.glavo.viewer.gui.AboutDialog;

/**
 *
 */
public class ImageUtils {

    private static final Image classFileIcon = loadImage("/ClassFile.png");

    public static ImageView createImageView(String imgName) {
        return new ImageView(loadImage(imgName));
    }

    public static Image loadImage(String imgName) {
        URL imgUrl = AboutDialog.class.getResource(imgName);
        return new Image(imgUrl.toString());
    }


}