class TryFinallyTest{

	private static void run(String[] args){
			System.out.println("Entering run...");
			try{
				double value = Double.parseDouble(args[0]);
				System.out.printf("Square of %f is %f%n", value, value * value);
			}finally{
				System.out.println("Exiting run.");
			}
	}

	public static void main(String[] args){
		try{
			run(args);
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Done!");
	}
}

