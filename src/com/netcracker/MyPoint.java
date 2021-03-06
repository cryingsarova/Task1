package com.netcracker;

public class MyPoint {
    private int x=0;
    private int y=0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] resultArray = new int[]{x,y};
        return resultArray;
    }

    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }

    public double distance(int x, int y){
        return Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2));
    }

    public double distance(MyPoint another){
       return distance(another.getX(),another.getY());
    }

    public double distance(){
        return distance(0,0);
    }

    @Override
    public int hashCode() {
        int hashCode = 59;
        hashCode = 31 * hashCode + x;
        hashCode = 31 * hashCode + y;
        return hashCode;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || !(object instanceof MyPoint)) return false;
        return x == ((MyPoint) object).x && y == ((MyPoint) object).y;
    }


}
