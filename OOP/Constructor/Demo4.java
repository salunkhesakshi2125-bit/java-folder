class Demo4{
				public static void main(String [] args){
				
				}
}
class Codex4{
				int a=21;
}

/*

Bytecode-
class Codex4 {
  int a;

  Codex4();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        21
       7: putfield      #7                  // Field a:I
      10: return
}
*/