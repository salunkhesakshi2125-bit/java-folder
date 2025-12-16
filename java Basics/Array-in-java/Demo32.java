class Demo32{
				public static void main(String[]args){
					int[]arr={4,1,5,2};
					int count=0;
					for(int i=1;i<arr.length;i++){
						if(arr[0]<arr[i]){
							count++;
						}
					}
					if (count==arr.length-1){		
						System.out.println("sorted");
					}else{
						System.out.println(" not sorted");
					}
				}
}