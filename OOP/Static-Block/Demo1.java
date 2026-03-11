class Demo1{
			static  int a = 10;
}				

/*

Bytecode-
class Demo1 {
  static int a;

  Demo1();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  static {};
    Code:
       0: bipush        10
       2: putstatic     #7                  // Field a:I
       5: return
}

*/