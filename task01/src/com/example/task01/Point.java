package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {

    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void flip(){
        int temp = x;
        x = -y;
        y = -temp;
    }
    public double distance(Point point){

        double disX = x - point.x;
        double disY = y - point.y;

        return Math.sqrt(disX * disX + disY * disY);
    }
    public String toString(){

        return  String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
