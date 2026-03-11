class Demo8{
				public static void main(String [] args ){
					Codex8 c1 = new Codex8();
					c1.a++;
					c1.fun();

					Codex8 c2 = new Codex8();
					c2.fun();

				}
}
class Codex8{
				static int a=21;
				void fun(){
					System.out.println("in fun :"+a);
				}
}

/*
o/p-
in fun: 22
in fun: 22

*/