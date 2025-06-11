//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 6;

        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("");

        //Задача 2
        int temperature = 10;

        if (temperature <= 5){
            System.out.println("На улице холодно, нужно одеть шапку");
        }
        else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        System.out.println("");

        //Задача 3
        int speed = 60;

        if (speed > 60){
            System.out.println("Скорость превышена");
        }
        else {
            System.out.println("Превышения скорости нет");
        }
        System.out.println("");

        //Задача 4

        //
        if (age != 1 && age <= 6){
            System.out.println("Нужно ходить в детский сад");
        }
        else {
            if (age >= 7 && age <= 17){
                System.out.println("Нужно ходить в школу");
            }
            else {
                if (age >= 18 && age <=24){
                    System.out.println("Нужно ходить в университет");
                }
                else {
                    System.out.println("Пора на работу");
                }
            }
        }
        //

        System.out.println("");

        //Задача 5
        boolean adult = false;

        //
        if (age < 5){
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        else {
            if(age > 5 && age < 14 && adult){
                System.out.println("Если возраст ребенка равен " + age + ",то ему можно кататься на аттракционе в сопровождении");
            }
            else {
                if (age > 14 ){
                    System.out.println("Если возраст ребенка равен " + age + ",то ему можно кататься на аттракционе без сопровождения взрослого");
                }
                else {
                    System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе без сопровождения взрослого");
                }
            }
        }
        //

        System.out.println("");

        //Задача 6
        int van = 102;
        int seat = 60;
        int people = 10;

        if (people < seat){
            System.out.println("Есть сидячие места");
        }
        else {
            if (people < van ){
                System.out.println("Есть стоячие места");
            }
            else {
                System.out.println("Вагон полностью заполнен");
            }
        }


        System.out.println("");

        //Задача 7
        int one = 5;
        int two = 6;
        int three = 4;

        if (one > two && one > three){
            System.out.println("Первое число самое большое");
        }
        else {
            if (two > one && two > three){
                System.out.println("Второе число самое большое");
            }
            else {
                System.out.println("Третье число самое большое");
            }
        }
    }
}