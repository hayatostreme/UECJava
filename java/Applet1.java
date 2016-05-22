//java.appletパッケージをimport
import java.applet.*;
import java.awt.*;
//アプレットは必ずAppletクラスを継承
public class Applet1 extends Applet{
    //アプレットにはmainメソッドは要らない
     public void paint(Graphics g){
     g.drawString("はじめてのJava入門",35,50);
    }

}
