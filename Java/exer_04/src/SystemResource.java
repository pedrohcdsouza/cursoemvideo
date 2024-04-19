import java.awt.Dimension;
import java.awt.Toolkit;

public class SystemResource {
    public static void main(String[] args) {
        Dimension resource = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int)resource.getWidth();
        int height = (int)resource.getHeight();
        System.out.println(width);
        System.out.println(height);
}   }
