
public class Vollmond {

    public static boolean isSchalt(int jahr) {
        if (jahr % 4 == 0 && (jahr % 100 != 0) && jahr % 400 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        //int eingabe = Integer.parseInt(args[0]);
        int eingabe = 5;
        int x = 29;
        int y = 0;
        int days = 0;

        String[] monate = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};

        int month = 0;
        int februar = 28;
        int jahr = 2022;

        for (int i = 1; i <= eingabe;) {

            if (month == 0 || month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11) {
                days = 31;
            }
            if (month == 1) {
                if (isSchalt(jahr)) {
                    februar = 29;
                } else {
                    februar = 28;
                }
                days = februar;
            }
            if (month == 3 || month == 5 || month == 8 || month == 10) {
                days = 30;
            }
            if (x >= 29) {       //Ausgabe der Monate X und sein Jahr X
                x = x -29;
                System.out.println(jahr+ ", " +monate[month]);
                i++;
            }
            y = days -29;  //Berechnung des Monate X
            x = x + y;
            month++;
            if (month == 11) {
                jahr++;
                month = 0;
            }

        }
    }
}