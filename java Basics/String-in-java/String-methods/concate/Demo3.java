class Demo3{
				public static void main(String [] args){
					String s="girish";
					System.out.println(s);
					System.out.println(System.identityHashCode(s));
					String s1=" jagadale";
					s=s.concat(s1);
					System.out.println(s);
					System.out.println(System.identityHashCode(s));
				}
}
					