class Demo2{
				public static void main(String [] args){
					String s="sai";
					System.out.println(s);
					System.out.println(System.identityHashCode(s));
					String s1="sakshi";
					s.concat(s1);
					System.out.println(s);
					System.out.println(System.identityHashCode(s));
				}
}
					