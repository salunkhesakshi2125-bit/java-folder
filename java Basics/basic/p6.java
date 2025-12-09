class demo{
			public static void main (String[] args){
				System.out.println("hello");
				demo.fun();
			}

			public  void fun(){
				System.out.println(" sakshi");
			}
}

//in this case compiler gives error- non-static method fun() cannot be referenced from a static context demo.fun();