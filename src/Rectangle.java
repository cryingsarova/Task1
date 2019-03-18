import java.util.Objects;

public class Rectangle {
    private float length = 1.0f;
    private  float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*length+2*width;
    }

    @Override
    public String toString() {
        return "Rectangle[length="+length+",width="+width+"]";
    }

    @Override
    public int hashCode(){
        int hashCode = 59;
        hashCode = 31 * hashCode+Float.floatToIntBits(length);
        hashCode = 31 * hashCode+Float.floatToIntBits(width);
        return hashCode;
    }

    @Override
    public boolean equals(Object object){
        if (this == object) return true;
        if (object == null || !(object instanceof Rectangle) ) return false;
        Rectangle rectangle = (Rectangle) object;
        return this.length == rectangle.length && this.width == rectangle.length;
    }
}
