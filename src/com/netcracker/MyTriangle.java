package com.netcracker;

public class MyTriangle{
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3,int y3) {
        v1 = new MyPoint(x1,y1);
        v2 = new MyPoint(x2,y2);
        v3 = new MyPoint(x3,y3);
    }

    @Override
    public String toString() {
        return "com.netcracker.MyTriangle[v1="+v1.toString()+
                ",v2="+v2.toString()+
                ",v3="+v3.toString()+"]";
    }

    public double getPerimeter(){
        return v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
    }

    public String getType(){
        if (v1.distance(v2) == v2.distance(v3) && v2.distance(v3) == v3.distance(v1)){
            return "Equilateral";
        }
        else if (v1.distance(v2) == v1.distance(v3) || v1.distance(v2)==v2.distance(v3) || v1.distance(v3) == v2.distance(v3)){
            return "Isosceles";
        }
        else
        {
            return "Scalene";
        }
    }

    @Override
    public int hashCode() {
        int hashCode = 59;
        hashCode = 31 * hashCode + v1.hashCode();
        hashCode = 31 * hashCode + v2.hashCode();
        hashCode = 31 * hashCode + v3.hashCode();
        return hashCode;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || !(object instanceof MyTriangle)) return false;
        return v1.equals(((MyTriangle) object).v1) &&
                v2.equals(((MyTriangle) object).v2) &&
                v3.equals(((MyTriangle) object).v3);
    }




}
