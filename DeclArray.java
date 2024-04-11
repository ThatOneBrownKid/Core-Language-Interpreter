class DeclArray {
	Id id;
	
	public void parse() {
		Parser.expectedToken(Core.ARRAY);
		Parser.scanner.nextToken();
		id = new Id();
		id.parse();
		Parser.expectedToken(Core.SEMICOLON);
		Parser.scanner.nextToken();
	}
	
	public void print(int indent) {
		for (int i=0; i<indent; i++) {
			System.out.print("\t");
		}
		System.out.print("array ");
		id.print();
		System.out.println(";");
	}
	
	public void execute() {
		Memory.declareArray(id.getId());
	}
}