package day07.static_;

import day07.inherit.SnowTire;

public class Calculator {

    String color; //계산기 색상
    static double pi; // 원주율, 어느 계산기에서나 원주율은 같음.

    //원의 넓이를 구하는 메서드
    double calcAreaCircle(int r) {
        return pi*r*r;

    }

    void paint(String color) {
        this.color = color;

    }




}
