class Demo8{
				public static void main(String [] args){
					Codex8 c1= new Codex8(21);
					c1.fun();
					Codex8 c2= new Codex8(38);
					c2.fun();

				}
}
class Codex8{
				int a;
				Codex8(int a){
					a=a;
					System.out.println(a);
				}
				void fun(){
					System.out.println("instance var :"+this.a+"local var : "+a);
				}
}


/*
o/p-

21
instance var :0local var : 0
38
instance var :0local var : 0

*/