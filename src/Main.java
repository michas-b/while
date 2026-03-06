
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int firstFriday = 4;
        for (; firstFriday <= 31; firstFriday += 7) {
            System.out.println("«Сегодня пятница, " + firstFriday + " число. Необходимо подготовить отчет».");
        }

        //Задача 2
        int distance = 0;
        do {
            System.out.println("Держитесь! Осталось " + (42195 - distance) + " метров");
            distance += 500;
        } while (distance < 42195);

        distance = 0;
        for (; distance <= 42195; distance += 500) {
            System.out.println("Держитесь! Осталось " + (42195 - distance) + " метров");
        }

        //Задача 3
        int buget = 1000;
        int countDay = 0;
        while (buget > 0) {
            countDay++;
            if (countDay % 5 == 0) {
                continue;
            }
            System.out.println("День " + countDay + " бюджет:" + (buget -= 100));
        }

        buget = 1000;
        countDay = 0;
        for (; buget > 0; ) {
            countDay++;
            if (countDay % 5 == 0) {
                continue;
            }
            System.out.println("День " + countDay + " бюджет:" + (buget -= 100));
        }

        //Задача 4
        int month = 0;
        int total = 0;
        while (true) {
            if (month % 6 == 0) {
                total += ((total / 100) * 7);
            }
            System.out.println("Месяц " + month + " общая сумма накоплений:" + total);
            total += 15000;
            if (total >= 12_000_000) {
                break;
            }
            month++;
        }

        //Задача 5
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge <= 100 && overheats <= 3) {
            if (minute % 10 == 0 && minute > 0) {
                overheats++;
                minute += 2;
                continue;
            }
            if (overheats == 3) {
                System.out.println("Зарядка прекращена. Текущий заряд: " + charge + " %");
                break;
            }
            minute++;
            charge += 2;
        }
        System.out.println("Время зарядки составило " + minute + " минут");
    }
}