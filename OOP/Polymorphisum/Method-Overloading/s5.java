class Demo{
			public static void main(String [] args ){
				Codex c  = new Codex();
				c.add(12,22);
				c.add(10,20,30);
			}
}
class Codex{
			void add(int a,int b){
				System.out.println(a+b);
			}
			void add(int a,int b,int c){
				System.out.println(a+b+c);
			}
}
/*
o/p-34
60
*/