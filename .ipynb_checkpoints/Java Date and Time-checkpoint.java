import java.time.LocalDate;
class Result {
    public static String findDay(int month, int day, int year) 
    {
        LocalDate ld=LocalDate.of(year,month,day);
        String str=(ld.getDayOfWeek()).toString();
        return str;
    }
}