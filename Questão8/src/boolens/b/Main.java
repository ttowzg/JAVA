package boolens.b;

public class Main {

	public static void main(String[] args) {
		
	    IntegerSet s1 = new IntegerSet ();
        IntegerSet s2 = new IntegerSet ();
        
	int array1[] = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
	int array2[] = {0, 10, 20, 30, 35, 45, 55, 65, 75, 80, 90, 100};
	
        for (int x : array1) {
            s1.insertElement (x);
        }
        
        System.out.println (s1.toSetString());
        
        for (int x : array2) {
            s2.insertElement (x);
        }
        
        System.out.println (s2.toSetString());
        IntegerSet uniao = IntegerSet.union (s1, s2);
        System.out.println (uniao.toSetString());
        IntegerSet interseccao = IntegerSet.intersection (s1, s2);
        System.out.println (interseccao.toSetString());
        System.out.println (IntegerSet.isEqualTo (s1, s2));
	}
	
}
