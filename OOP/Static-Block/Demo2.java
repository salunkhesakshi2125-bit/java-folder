class Demo2{
			static int a=22;
			int b=33;
}

/*
bytecode-

class Demo2 {
  static int a;

  int b;

  Demo2();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        33
       7: putfield      #7                  // Field b:I
      10: return

  static {};
    Code:
       0: bipush        22
       2: putstatic     #13                 // Field a:I
       5: return
}

*/