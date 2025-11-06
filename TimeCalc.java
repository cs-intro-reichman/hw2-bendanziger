public class TimeCalc {
    public static void main(String[] args) {
     String time = args[0];
	   int minutesToadd = Integer.parseInt(args[1]);
	   String hours = time.substring(0, 2);
       String minutes = time.substring(3, 5);
	   int numHours = Integer.parseInt(hours);
	   int numMinutes = Integer.parseInt(minutes);
	   int TotalMinutes = ((numHours * 60) + numMinutes + minutesToadd);
       int TotalHours = (TotalMinutes / 60);
	   int newHours = TotalHours % 24;
	   int newMinutes = TotalMinutes - (TotalHours * 60);
	   if(newHours < 10){
       hours = "0" + newHours;
	   }
	   else{
		hours = "" + newHours;
	   }
	   if(newMinutes < 10){
       minutes = "0" + newMinutes;
	   }
	   else{
		minutes = "" + newMinutes;
	   }
       System.out.println(hours + ":" + minutes);
    }
}
