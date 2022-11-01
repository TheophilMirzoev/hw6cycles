public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10 ; i++){
            System.out.println(" Итерация цикла " + i);
        }

       for( int i = 10; i >= 0 ; i--){
            System.out.println("Итерация цикла " + i);
       }



        for (int i = 0; i < 17 && i % 2 == 0; i = i + 2){
            System.out.println(i);
        }

        for(int i = 10; i >= -10; i--){
            System.out.println(i);
        }

        for(int i = 1904; i < 2096; i = i + 4){
            System.out.println( i + " год является високосным");
        }

       for (int i = 7; i <=98; i = i +7){
           System.out.println(i);
       }
       for (int i = 1; i <= 512; i = i*2){
           System.out.println(i);
       }

       int salary = 29000;
       int salaryAll = 0;
       int month = 1;
       int monthAll = 0;
        for (int i = 0; i < 12; i++) {
            salary = salary + salary/100;
            salaryAll = salaryAll + salary;
            monthAll = (monthAll + month) ;

            switch (monthAll) {
                case 1:
                    System.out.println(" январь" + " сумма накоплений равна " + salaryAll + " рублей");
                    break;
                case 2:
                    System.out.println(" февраль" + " сумма накоплений равна " + salaryAll + " рублей");
                    break;
                case 3:
                    System.out.println(" март" + " сумма накоплений равна " + salaryAll + " рублей");
                    break;
                case 4:
                    System.out.println(" апрель" + " сумма накоплений равна " + salaryAll + " рублей");
                    break;
                case 5:
                    System.out.println(" май" + " сумма накоплений равна " + salaryAll + " рублей");
                    break;
                case 6:
                    System.out.println(" июнь" + " сумма накоплений равна " + salaryAll + " рублей");
                    break;
                case 7:
                    System.out.println(" июль" + " сумма накоплений равна " + salaryAll + " рублей");
                    break;
                case 8:
                    System.out.println(" август" + " сумма накоплений равна " + salaryAll + " рублей");
                    break;
                case 9:
                    System.out.println(" сентябрь" + " сумма накоплений равна " + salaryAll + " рублей");
                    break;
                case 10:
                    System.out.println(" октябрь" + " сумма накоплений равна " + salaryAll + " рублей");
                    break;
                case 11:
                    System.out.println(" ноябрь" + " сумма накоплений равна " + salaryAll + " рублей");
                    break;
                case 12:
                    System.out.println(" декабрь" + " сумма накоплений равна " + salaryAll + " рублей");
                    break;
            }

        }













    }

}