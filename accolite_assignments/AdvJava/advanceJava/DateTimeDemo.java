package advanceJava;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


System.out.println("***********Showing Local Date and Time of different time zones************");

System.out.println(LocalDateTime.now(ZoneId.of("GMT"))+"  GMT");
System.out.println(LocalDateTime.now(ZoneId.of("Africa/Lome"))+"  Africa/Lome");
System.out.println(LocalDateTime.now(ZoneId.of("Asia/Kuwait"))+"  Asia/Kuwait");
System.out.println(LocalDateTime.now(ZoneId.of("Pacific/Efate"))+"  Pacific/Efate");
System.out.println(LocalDateTime.now(ZoneId.of("America/Bogota"))+"  America/Bogota");





List<LocalDate> dates=new ArrayList<LocalDate>();

dates.add(LocalDate.now(ZoneId.of("GMT")));
dates.add(LocalDate.now(ZoneId.of("Africa/Lome")));
dates.add(LocalDate.now(ZoneId.of("Asia/Kuwait")));
dates.add(LocalDate.now(ZoneId.of("Pacific/Efate")));
dates.add(LocalDate.now(ZoneId.of("America/Bogota")));

List<LocalTime> time=new ArrayList<LocalTime>();

time.add(LocalTime.now(ZoneId.of("GMT")));
time.add(LocalTime.now(ZoneId.of("Africa/Lome")));
time.add(LocalTime.now(ZoneId.of("Asia/Kuwait")));
time.add(LocalTime.now(ZoneId.of("Pacific/Efate")));
time.add(LocalTime.now(ZoneId.of("America/Bogota")));


//sorting local dates
Collections.sort(dates);

//sorting local time
Collections.sort(time);


System.out.println("***************** displaying sorted Local Date of Different time zones********************");
	
for(LocalDate t:dates)
{
System.out.println(t);	
}



System.out.println("***************** displaying sorted Local Time of Different time zones********************");

for(LocalTime t:time)
{
System.out.println(t+" "+t);	
}
		
	}

}
