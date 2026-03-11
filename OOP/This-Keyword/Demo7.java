class Demo7{
			public static void main(String[] args){
					Codex7 c1= new Codex7(21);
					c1.fun();
					Codex7 c2= new Codex7(38);
					c2.fun();
				}
}
class Codex7{
				int a;
				Codex7(int a){
					this.a=a;
				}
				void fun(){
					System.out.println(a);
				}
}


/*
o/p-
21
38
*/