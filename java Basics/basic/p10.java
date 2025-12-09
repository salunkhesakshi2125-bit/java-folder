class demo{
			public static void main (String [] args){
				System.out.println("sakshi");
				demo chavi = new demo();
				chavi.fun();
				demo.gun();
				chavi.fun();
			}
		
			void fun(){
				System.out.println("salunkhe");
			}
				

			 static void  gun(){
				System.out.println("sai");
			}	
}

//in this we make a chavi for calling the non static method,we can call multiple methods using one chavi