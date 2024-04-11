import java.util.*;

class Loop implements Stmt {
	Cond cond;
	StmtSeq ss;
	
	public void parse() {
		Parser.scanner.nextToken();
		cond = new Cond();;
		cond.parse();
		Parser.expectedToken(Core.DO);
		Parser.scanner.nextToken();
		ss = new StmtSeq();
		ss.parse();
		Parser.expectedToken(Core.END);
		Parser.scanner.nextToken();
	}
	
	public void print(int indent) {
		for (int i=0; i<indent; i++) {
			System.out.print("\t");
		}
		System.out.print("while ");
		cond.print();
		System.out.println(" do");
		ss.print(indent+1);
		for (int i=0; i<indent; i++) {
			System.out.print("\t");
		}
		System.out.println("end");
	}
	
	public void execute() {
		while (cond.execute()) {
			Memory.pushScope();
			// Create new level to stack and copy previous levels value
			Memory.garbage.push(Memory.garbage.peek());
			ss.execute();
			Memory.popScope();
			// Pop the garbage stack, but onky print if any discrepancies between the
			// level being popped and the level below.
			int pop = Memory.garbage.pop();
			if( pop != Memory.garbage.peek()){
			   System.out.println("gc: " + Memory.garbage.peek());
			}
		}
	}
}