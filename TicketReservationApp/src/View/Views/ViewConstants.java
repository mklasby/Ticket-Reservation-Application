package View.Views;

import java.awt.*;

/**
 * Constants to manipulate size of components and typical fonts
 */
public interface ViewConstants {
    public static final Dimension FRAME_DIMENSION = new Dimension(1000, 1000);
    static public int X_DIMENSION = 1000;
    static public int Y_DIMENSION = 900;
    static public Dimension PICTURE_DIMENSION = new Dimension(X_DIMENSION, Y_DIMENSION);
    static public Font HEADER_FONT = new Font(Font.SERIF, Font.BOLD, 22);
    static public Font SUBTITLE_FONT = new Font(Font.SERIF, Font.BOLD, 18);
    static public Font TYPICAL_FONT = new Font(Font.SERIF, Font.PLAIN, 12);
}