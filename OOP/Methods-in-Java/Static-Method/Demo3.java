class Demo3{
				public static void main(String [] args){
					Codex3 c1 = new Codex3();
					c1.fun();
				}
}
class Codex3{
				int a=78;
				static void fun (){
					System.out.println("in fun "+a);
				}
}


/*

o/p-
 error: non-static variable a cannot be referenced from a static context
                                        System.out.println("in fun "+a);
                                                                     ^
1 error

*/