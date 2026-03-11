class Demo13{
				public static void main(String [] args){
					codex13 obj =new codex13();
					codex13 obj1=new codex13();
					obj.a=21;
					obj1.a=30;
					obj.fun();
					obj1.fun();
				}
}
class codex13{
				int a;
				void fun (){
					System.out.println("in fun : "+a);
				}
}