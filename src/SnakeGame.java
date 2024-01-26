import javax.swing.ImageIcon;

public class SnakeGame{
    public static void main(String[] args){
        GameFrame frame = new GameFrame();
        ImageIcon image= new ImageIcon("../public/snake.png");
        frame.setIconImage(image.getImage());
    }
}