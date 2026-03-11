class Demo17 {
    			public static void main(String[] args) {
      				  int num = 1023;
      				  int temp = num;
    				  boolean hasZero = false;

        			while (temp > 0) {
            				int rem = temp % 10;
            				if (rem == 0) {
                				hasZero = true;
                				break;
            				}
            				temp = temp / 10;
        			}

        			if (hasZero) {
           				 System.out.println("Duck Number");
       				 } else {
           				 System.out.println("Not Duck Number");
       				 }
    			}
}
