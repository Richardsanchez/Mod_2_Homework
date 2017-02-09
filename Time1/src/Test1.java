/**
 * Created by richarddev on 1/31/17.
 */
public class Test1 {
    public static void main(String[] args) {

        Time time1 = new Time();
        Time time2 = new Time(555550000);

        System.out.println(time1.getHour() + ":" + time1.getMinute() +
                ":" + time1. getSecond());
        System.out.println(time2.getHour() + ":" + time2.getMinute() +
                ":" + time2. getSecond());
    }
}
