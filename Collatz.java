// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
    int N = Integer.parseInt(args[0]);
	String mode = args[1];
	int seed = 1;
	int steps = 2;

	for(int count = 1; count <= N; count++){
		if (mode.equals("v")) System.out.print(seed + " ");
		if(seed%2 == 0){
			seed = seed / 2;
		}
		else{
			seed = seed * 3 + 1;
		}
		 if (mode.equals("v")) System.out.print(seed + " ");
		while(seed != 1){
			if(seed%2 == 0){
			seed = seed / 2;
		}
		else{
			seed = seed * 3 + 1;
		}
		if (mode.equals("v")) System.out.print(seed + " ");
		steps++;
		}
       if (mode.equals("v")) System.out.println("(" + steps + ")");
	   seed = count + 1;
	   steps = 2;
	}
	System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
	}

