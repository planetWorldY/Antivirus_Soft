import javax.swing.*;

public class 01{
  public static void main(String[] args){
    JFrame flame = new JFrame("test");
    flame.seetDefaultCloseOperation(JFlame.EXIT_ON_CLOSE);
    flame.setSize(600,600);
    JMenuBar menuBar = new JMenuBar();
    flame.setJmenuBar(menuBar);
    JMenu fileMenu = new JMenu("file");
    menuBar.add(fileMenu);
      
  }
}
















