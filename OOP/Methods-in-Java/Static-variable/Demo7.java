class Demo7{
				public static void main(String [] args ){
					Codex7 c1 = new Codex7();
					c1.a++;
					c1.fun();
				}
}
class Codex7{
				static int a=21;
				void fun(){
					System.out.println("in fun :"+a);
				}
}

/*
o/p-
in fun: 22
*/