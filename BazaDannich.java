package SortByAlph;


import java.util.*;

public class BazaDannich implements Comparable<BazaDannich> {

    private double numberPhone;
    private String surname;
    private String name;
    private String lastname;
    private int numberCard ;
    private int debet;
    private double credit;
    private int timeCitiy;
    private int timeCitiyOn;

    public BazaDannich (double numberPhone, String surname, String name, String lastname, int numberCard, int debet, double credit, int timeCitiyOn, int timeCitiy) {
        this.numberPhone = numberPhone;
        this.surname = surname;
        this.name = name;
        this.lastname = lastname;
        this.numberCard = numberCard;
        this.debet = debet;
        this.credit =credit;
        this.timeCitiyOn = timeCitiyOn;
        this.timeCitiy = timeCitiy;
    }



    public int gettimeCitiy() {
        return timeCitiy;
    }

    public int gettimeCitiyOn() {
        return timeCitiyOn;
    }

    public String getName() {return name;}

    public String getLastname() {
        return lastname;
    }


    @Override
    public int compareTo(BazaDannich peremennaya) {
        return name.compareTo(peremennaya.getName());
    }

    public String toString() {
        return "Book{" +
                "numberPhone=" + numberPhone +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", numberCard=" + numberCard +
                ", debet=" + debet +
                ", credit=" + credit +
                ", timeCity=" + timeCitiy+
                ",  timeCitiyOn='" + timeCitiyOn + '\'' +
                '}';
    }

    // Метод для ввода издательства с консоли.
    public static int inputCitiyOn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите время звонков проведенное по меж городу: ");
        return scanner.nextInt();
    }
    public static int inputCitiy() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите время звонков по городу: ");
        return scanner.nextInt();
    }
    public static void printByTimeCitiy ( List<BazaDannich> dannie, int inputTimeCitiy){
        System.out.println(" Время проведенное по городу -> " + inputTimeCitiy + " минут(а) " + " : ");
        for( BazaDannich dannies : dannie){
            if(dannies.gettimeCitiy()>inputTimeCitiy){
                System.out.println(dannies);
            }
        }
    }

    // Метод для вывода книги по заданным параметрам
    public static void printByTimeCitiyOn ( List<BazaDannich> dannie, int inputTimeCitiyOn){
        System.out.println(" Время проведенное по меж городу -> " + inputTimeCitiyOn + " минут(а) " + " : ");
        for( BazaDannich dannies : dannie){
            if(dannies.gettimeCitiyOn()>= 1 ){
                System.out.println(dannies);
            }
        }
        System.out.println("");
    }


//Типо хотфикс
}
