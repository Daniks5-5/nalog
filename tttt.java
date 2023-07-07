import java.util.Scanner;
public class tttt {
     public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     Money getmoney = new Money();
     getmoney.GetMoney();


    
}
}

class Money{
    final double nalog = 13;
    final double nalog2 =13;
    double money;
    double cleanmoney;
    double NDFL;
    /**
     * 
     */
    public void GetMoney(){
        Scanner in = new Scanner(System.in);
            System.out.println("Программа расчета чистой заработной платы");
            System.out.println("Вам рассчиать зарплату с учётом НДФЛ? Напишите : yes или noy");
            String x = in.nextLine();
            switch(x){
                case "yes" : 

             System.out.println("Ведите вашу зарплату без учёта налога");
            float money = in.nextInt();
            System.out.println("Ваш НДФЛ :");
            double NDFL = (money*nalog)/100;
            System.out.println(NDFL);
            double cleanmoney = money - NDFL;
            System.out.println("Ваша заработная плата без учёта налога :");
            System.out.println(cleanmoney);
            break;

            case "noy" : 

            System.out.println("Ведите вашу зарплату ");
            float money2 = in.nextInt();
            System.out.println("Ваш НДФЛ :");
            double NDFL2 = (money2*nalog2)/100;
            System.out.println(NDFL2);
            double cleanmoney2 = money2 + NDFL2;
            System.out.println("Ваша заработная плата без учёта налога :");
            System.out.println(cleanmoney2);
            break;
            
            default : 
            System.out.println("Вы ввели не подходящий ответ ");
   
            }
        }

        }
        
        