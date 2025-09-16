public class printDate {
    public static void printAmerican(int year, int date, String month, String day){
        System.out.println(day + " " + date + " " + month + " " + year);

        
    }
    
    public static void printEuropean(String day,  String month, int date, int year){
        System.out.println(day + "," + " " + month + " " + date + "," + " " + year);
    }
    
    
    public static void main(String[] args) {

        printAmerican(1978, 6, "November", "Monday");
        printEuropean("Monday", "November", 6, 1978);
    }
}