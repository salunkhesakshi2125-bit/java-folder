class Demo2{
				public static void main(String [] args){
					Codex2 c1 = new Codex2();
					System.out.println(c1.a);
					System.out.println(Codex2.b);
				}
}
class Codex2{
				int a=32;
				//static variable
				static int b=12;
}

/*
o/p-
32
12
*/