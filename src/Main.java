//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // task 1
        for (int i = 1; i < 11; i++){
            System.out.println(i);
        }

        // task 2

        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }

        // task 3

        for (int i = 0; i <= 16; i++){
            int number = i % 2;
            if(number == 0){
                System.out.println(i);
            }
        }

        // task 4

        for (int i = 10; i > -11; i--){
            System.out.println(i);
        }

        // task 5

        for(int i = 1904; i <= 2096; i++){
            int year = i % 4;
            if(year == 0){
                System.out.println(i + " год является високосным.");
            }
        }

        // task 6

        for(int i = 7; i <= 98; i = i + 7){
            if(i % 7 == 0){
                System.out.println(i);
            }
        }

        // task 7
        // На самом деле было сложно, так как не понимал почему я не могу просто умножить i, оказалось перед этим надо i= поставить)

        for(int i = 1; i <= 512; i=i*2){
            System.out.println(i);
        }

        // task 8

        for(int i = 1; i <= 12; i++){
            int salary = 29000;
            int sumSalary = salary * i;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sumSalary + " рублей.");
        }

        // task 9

        int salary = 29000;
        int sumSalary = 0;
        for(int i = 1; i <= 12; i++){
            sumSalary = (salary + (salary / 100)) * i;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sumSalary + " рублей.");
        }

        // task 10

        for(int i = 1; i <= 10; i++){
            int number = 2 * i;
            System.out.println("2 * " + i + " = " + number );
        }
    }
}