package com.capgemini.day11;

public class MyLambda{
	public interface Code{
		public void sum(int a,int b);
	}
	public interface ToLower{
		public String toLower(String str);
	}
	public interface Maximum{
		public int max();
	}
	public interface FirstChar{
		public char firstchar(String str);
	}
	public interface EorO{
		public void eoro(int b);
	}
	public static void main(String[] args) {
		int[] a= new int[]{1,2,3,4,5,5,6,3,6,6};
		
		//DON;T NEED ACCESS SPECIFIER, RETURN TYPE OR METHOD NAME
		//CAN CALL BY VARIABLE NAME
		//METHOD CANNOT BE STORED IN NORMAL OR PRIMITIVE DATA TYPE
		//CREATE AN OBJECT OF THE INTERFACE TO HOLD THE VALUES
		//REMOVE INPUT DATA TYPE
		//REMOVE RETURN statement
		Code c = (aa,b)-> System.out.println(aa+b);
		c.sum(121,121);
	    ToLower tlo = (String str)->{ return str.toLowerCase();};
	    System.out.println(tlo.toLower("viaks"));
	    FirstChar fc = (String st)->{ return st.charAt(0);};
	    System.out.println(fc.firstchar("vgjgjdfjdcdfxc"));
	    Maximum m = ()->{
	    	
			int mm=0;
	    	for(int e:a) {
	    		if((mm == 0)||(e>mm)) {
	    			mm=e;
	    		}
	    	}
	    	return mm;
	    	
	    };
	    System.out.println(m.max());
	    EorO e = (int ef)->{
	    	if(ef % 2 == 0)
	    		System.out.println("Even");
	    	else
	    		System.out.println("Odd");
	    
	    };
	    e.eoro(121122312);
	    e.eoro(212121);
	}
	
}
