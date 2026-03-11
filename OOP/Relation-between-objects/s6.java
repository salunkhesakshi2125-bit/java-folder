class Demo{
			public static void main(String [] args){
				Department d = null;
				System.out.println(d.deptName);
			}
}
class Department{
			String deptName;
			String hodName;
}

/*
o/p-
Exception in thread "main" java.lang.NullPointerException: Cannot read field "deptName" because "<local1>" is null
        at Demo.main(s6.java:4)
*/