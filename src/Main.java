//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "");
        }
        System.out.println("Задача2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + "");
        }
        System.out.println("Задача3");
        for (int i = 0; i < 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "");
            }
        }
        System.out.println("Задача4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i + "");
        }
        System.out.println("Задача5");
        for(int year = 1904;year<=2096;year+=4){
            System.out.println(year+"Год является високосным");
        }
        System.out.println("Задача6");
        for(int i = 7;i<=98;i+=7){
            System.out.println(i+" ");
        }
        System.out.println("Задача7");
        for(int i = 1;i<=512;i*=2) {
            System.out.println(i + " ");
        }
            System.out.println("Задача8");
            int amount= 29_000;
            int sum= 0 ;
            for(int month = 1;month<=12;month++) {
                sum+=amount;
                System.out.println("Месяц "+month + "сумма накоплений равна "+sum+"рублей");

            }
        System.out.println("Задача9");
         sum = 0 ;
        double percent = 1D/100;
        for(int month = 1; month<=12; month++) {
            sum += amount;
            sum = (int) (sum*(1+percent));
            System.out.println("Месяц " +month + "сумма накоплений равна "+sum+"рублей");

        }
        System.out.println("Задача10");
        int number=2;
        for (int j=1; j<=10;j++){
            System.out.println(number+"*"+j+"="+number*j);
        }





































        }
    }
