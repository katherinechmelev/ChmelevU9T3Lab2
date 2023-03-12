import java.awt.Graphics;

public class Arc extends Shape{
    private int startAngle;
    private int arcAngle;

    public Arc(){
        super();
        startAngle = 45;
        arcAngle = 45;
    }
@Override
    public void draw(Graphics g){
        g.setColor(getColor());
        g.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startAngle, arcAngle);

}
}
