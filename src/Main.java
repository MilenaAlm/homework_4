public class Main {
    public static void main(String[] args) {
        // Задача 1;
        System.out.println("Задача 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
        }
        // Задача 2;
        System.out.println("Задача 2");
        int weather = 4;
        if (weather <= 5) {
            System.out.println("На улице " + weather + " градуса, нужно надеть шапку ");
        } else {
            System.out.println("На улице " + weather + " градусов, можно идти без шапки ");
        }
        // Задача 3;
        System.out.println("Задача 3");
        int speed = 58;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно ");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, придется заплатить штраф ");
        }
        //Задача 4;
        System.out.println("Задача 4");
        int age3 = 30;
        if (age3 >= 2 && age3 <= 6) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в детский сад");
        } else if (age3 >= 7 && age3 < 18) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в школу");
        } else if (age3 >= 18 && age3 < 24) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в университет");
        } else if (age3 >= 24) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить на работу");
        }
        //Задача 5;
        System.out.println("Задача 5 ");
        int kidage = 16;
        if (kidage <= 5) {
            System.out.println("Eсли возраст ребенка равен " + kidage + ", то ему нельзя кататься на аттракционе");
        } else if (kidage < 14) {
            System.out.println("Eсли возраст ребенка равен " + kidage + ", то ему можно кататься на аттракционе в сопровождения взрослого");
        } else {
            System.out.println("Eсли возраст ребенка равен " + kidage + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        //Задача 6;
        System.out.println("Задача 6 ");
        int totalPlaces = 102;
        int totalSeatPlaces = 60;
        int usedPlaces = 55;
        if (usedPlaces >= totalPlaces) {
            System.out.println(" В вагоне нет мест");
        } else if (usedPlaces >= totalSeatPlaces) {
            System.out.println(" В вагоне остались только стоячие места");
        } else {
            System.out.println(" В вагоне есть сидячие и стоячие места");
        }
        //Задача 6;
        System.out.println("Задача 6 ");
        int one = 5;
        int two = 6;
        int three = 3;
        if (one > two) {
            if (one > three) {
                System.out.printf("one");
            } else {
                System.out.printf("tree");
            }
        } else {
            if (two > three) {
                System.out.printf("two");
            } else {
                System.out.printf("tree");
            }
        }
    }
}





