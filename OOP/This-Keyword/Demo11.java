class Demo11{
				public static void main(String [] args){
					Codex11 c1 = new Codex11();
				}
}
class Codex11{
			Codex11(){
				this(21);
				System.out.println("in no para constructor");
			}
			Codex11(int a){
				System.out.println("in  para constructor  "+this);
			}
}


/*

o/p-
in  para constructor  Codex11@2f92e0f4
in no para constructor*/