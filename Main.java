class Main {
	public static void main(String[] args) {
		// Initialize the scanner with the input file
		Scanner S = new Scanner(args[0]);
		Parser.scanner = S;
		
		Procedure p = new Procedure();
		
		p.parse();
		
		Memory.data = new Scanner(args[1]);
		
		p.execute();

		// Decrement down remaining arrays. 
		if(Memory.garbage.peek() != 0){
			for (int i = Memory.garbage.peek()-1; i>=0; i--){
				System.out.println("gc: " + i);
			}
		}
	}
}