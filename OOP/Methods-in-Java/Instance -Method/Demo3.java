class Demo3{
					public static void main(String [] args){
						Codex3.fun();
					}
}
class Codex3{
					void fun(){
						System.out.println("in fun");
					}
}

/*
o/p-

error: non-static method fun() cannot be referenced from a static context
                                                Codex3.fun();
                                                      ^
1 error

*/