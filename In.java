class Input implements Stmt {
	Id id;
	
	public void parse() {
		Parser.expectedToken(Core.IN);
		Parser.scanner.nextToken();
		Parser.expectedToken(Core.LPAREN);
		Parser.scanner.nextToken();
		id = new Id();
		id.parse();
		Parser.expectedToken(Core.RPAREN);
		Parser.scanner.nextToken();
		Parser.expectedToken(Core.SEMICOLON);
		Parser.scanner.nextToken();
	}
	
	public void print(int indent) {
		for (int i=0; i<indent; i++) {
			System.out.print("\t");
		}
		System.out.print("in(");
		id.print();
		System.out.println(");");
	}	
	
	public void execute() {
		if (Memory.data.currentToken() == Core.CONST) {
			Memory.store(id.getId(), Memory.data.getConst());
			Memory.data.nextToken();
		} else {
			System.out.println("ERROR: Data file out of values!");
			System.exit(1);
		}
	}
}