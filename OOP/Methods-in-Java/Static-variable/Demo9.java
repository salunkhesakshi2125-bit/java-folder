class Demo9{
				public static void main(String [] args ){
					Codex9 c1 = new Codex9();
					c1.a++;
					c1.b++;
					c1.fun();

					Codex9 c2 = new Codex9();
					c2.fun();

				}
}
class Codex9{
				static int a=21;
				int b=20;
				void fun(){
					System.out.println("in fun :"+a);
					System.out.println("in fun :"+b);

				}
}

/*
o/p-
in fun :22
in fun :21
in fun :22
in fun :20

*/