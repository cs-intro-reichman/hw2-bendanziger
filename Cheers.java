
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            int num = Integer.parseInt(args[1]);
            int count = 0;
            String upperString = word.toUpperCase();
            while(count < upperString.length()){
             char ch = upperString.charAt(count);
             if (ch == 'A' || ch == 'E' || ch == 'F' || ch == 'H' || ch == 'I' || ch == 'L' || ch == 'M' || ch == 'N' || ch == 'O' || ch == 'R' || ch == 'S' || ch == 'X'){
                System.out.println("Give me an " + ch + ": " + ch + "!");
             }
             else{
                System.out.println("Give me a  " + ch + ": " + ch + "!");
             }
             count++;
            }
            System.out.println("What does that spell?");
            count = 0;
            while(count<num){
                System.out.println(upperString + "!!!");
                count++;
            }
        }
}
