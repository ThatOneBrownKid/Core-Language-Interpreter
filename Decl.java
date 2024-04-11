class Decl implements Stmt {
	DeclInteger declInt;
	DeclArray declArr;
	
	public void parse() {
		if (Parser.scanner.currentToken() == Core.INTEGER) {
			declInt = new DeclInteger();
			declInt.parse();
		} else {
			declArr = new DeclArray();
			declArr.parse();
		}
	}
	
	public void print(int indent) {
		if (declInt != null) {
			declInt.print(indent);
		} else {
			declArr.print(indent);
		}
	}
	
	public void execute() {
		if (declInt != null) {
			declInt.execute();
		} else {
			declArr.execute();
		}
	}
}