class Demo{
			public static void main(String [] args){
				Codex c = new Codex();
			}
}
class Codex{
		Codex(){
			this(21);
			System.out.println("in contr");
		}
		Codex(int a){
			System.out.println("in para contr");
		}
}

/*
o/p- 
in para contr
in contr
*/