package com.IvanV1121.Homework2Part2.Chapter8;

public class Main {
    public static void main(String[] args){

        /* При инициализации класса в конструктор передаются значения на шкале, которые соответствуют
        красной отметке на корпусе замка, а при вызове методов поворота влево и вправо, в них передаются
        значения, на которые нужно повернуть вороток замка для совпадения требуемого значения с красной меткой.
         */

        Combolock combolock = new Combolock(10, 35, 20);

        combolock.turnLeft(10);
        combolock.turnRight(15);
        combolock.turnLeft(25);
    }
}
