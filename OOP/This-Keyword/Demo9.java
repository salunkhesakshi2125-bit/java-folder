class Demo9{
				public static void main(String [] args){
					Codex9 c1= new Codex9(21);
					c1.fun();
					Codex9 c2= new Codex9(38);
					c2.fun();

				}
}
class Codex9{
				int a;
				Codex9(int a){
					a=40;
					this.a=a;
				}
				void fun(){
					System.out.println("instance var :"+this.a+"local var : "+a);
				}
}


/*
o/p-
instance var :40local var : 40
instance var :40local var : 40

*/