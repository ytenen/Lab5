package data;

public class Coordinates {
    private double x;//Максимальное значение поля 264
    private Integer y;//Поле не может быть null
    public  Coordinates(double x, int y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
