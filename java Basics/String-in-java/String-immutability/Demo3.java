class Demo3{
			public static void main(String [] args){
				String s ="sai";
				System.out.println(System.identityHashCode(s));
				String  s1 ="sakshi";
				s=s+s1;
				System.out.println(System.identityHashCode(s));
				 s ="sai sakshi";
				System.out.println(System.identityHashCode(s));

			}
}