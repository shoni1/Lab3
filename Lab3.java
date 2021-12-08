import java.util.Scanner;
public class Lab3 {
    public static void main(String [] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите dd/mm/yyyy : ");
        String date = console.nextLine();
        console.close();
        if(!date.matches("(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[012])/(19|[2-9][0-9])\\d\\d")) {
            System.out.println("Введите существующую дату");
        }
        else {
            String[] a = date.split("/");
            String lst = a[a.length - 1];
            int time = Integer.parseInt(lst);
            if (time >= 1990 && time <= 9990) System.out.println("Верный формат");
            if (time >9990) {
                System.out.println("Введите любую дату до 9990 года");
            }
            if (time < 1990) System.out.println("Введите любую дату после 1989 года");
        }
    }
}