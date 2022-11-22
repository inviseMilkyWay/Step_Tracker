import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numMenu;
        StepTracker stepTracker = new StepTracker();
        stepTracker.menu();
        numMenu = scan.nextInt();

        switch (numMenu)
        {
            case 1:
                System.out.println("Ввод данных в приложение\n");
                stepTracker.months();
                int a = scan.nextInt();

                switch (a)
                {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        break;
                    case 12:
                        break;
                }

                break;
            case 2:
                System.out.println("2)Вывод данных из приложение");
                int b = scan.nextInt();
                break;
            case 3:
                System.out.println("3)Выход из приложения");
                System.exit(0);
                break;
            default:
                System.out.println("Выберите правильный пункт меню");
        }
    }
}
class StepTracker
{
    //Scanner scan = new Scanner(System.in);
    void menu()
    {
        System.out.println("1)Ввод данных в приложение");
        System.out.println("2)Вывод данных из приложение");
        System.out.println("3)Выход из приложения");
    }
    void months()
    {
        System.out.println("0) Январь");
        System.out.println("1) Февраль");
        System.out.println("2) Март");
        System.out.println("3) Апрель");
        System.out.println("4) Май");
        System.out.println("5) Июнь");
        System.out.println("6) Июль");
        System.out.println("7) Август");
        System.out.println("8) Сентябрь");
        System.out.println("9) Октябрь");
        System.out.println("10) Ноябрь");
        System.out.println("11) Декабрь");
    }
    int[] january = new int[30];
    
}