package boolens.b;

	import java.util.Arrays;

	public class IntegerSet {

	    private static final int MIN = 0;
	    private static final int MAX = 100;
	    private boolean[] a;

	 
	    public IntegerSet() {
	        a = new boolean[MAX + 1];
	    }

	 
	    public static IntegerSet union(IntegerSet c1, IntegerSet c2) {
	        IntegerSet r = new IntegerSet();
	        for (int i = 0; i <= MAX; ++i) {
	            r.a[i] = c1.a[i] | c2.a[i];
	        }
	        return r;
	    }

	  
	    public static IntegerSet intersection(IntegerSet c1, IntegerSet c2) {
	        IntegerSet r = new IntegerSet();
	        for (int i = 0; i <= MAX; ++i) {
	            r.a[i] = c1.a[i] & c2.a[i];
	        }
	        return r;
	    }

	    public void insertElement(int i) {
	        a[i] = true;
	    }
	    
	    public void deleteElement(int i) {
	        a[i] = false;
	    }

	 
	    public String toSetString() {
	        StringBuffer sb = new StringBuffer();
	        for (int i = 0; i <= MAX; ++i) {
	            if (a[i])
	                sb.append(i).append(",");
	            else
	                sb.append("-").append(",");
	        }
	        return sb.toString();
	    }

	   
	    public static boolean isEqualTo(IntegerSet c1, IntegerSet c2) {
	        return Arrays.equals(c1.a, c2.a);
	    }
	}
	

