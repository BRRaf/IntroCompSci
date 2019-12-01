
public class StartD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleObject object = new SimpleObject();
		
		object.Seta(5);
		object.Setb(8);
		
		int a = object.Geta();
		int b = object.Getb();
		
		System.out.println("value 'a' is "+a+", value b is "+b+".");
		
		System.out.println("is 'a' smaller? "+object.isASmaller());
		
		SimpleObject secondobject = new SimpleObject(8,5);
		
		int a2 = secondobject.Geta();
		int b2 = secondobject.Getb();
		
		System.out.println("value 'a' is "+a2+", value b is "+b2+".");
		
		System.out.println("is 'a' smaller? "+secondobject.isASmaller());
		
		
		
		ComplexClass complex = new ComplexClass(3,4,6,5);
		
		complex.ComplexAdd();
		System.out.println(complex.toString());
		
		complex.ComplexSub();
		System.out.println(complex.toString());
		
		complex.ComplexDiv();
		System.out.println(complex.toString());
		
		complex.ComplexMul();
		System.out.println(complex.toString());
		
		complex.ComplexCon();
		System.out.println(complex.ComplexCon());
		
		complex.Complexabs();
		System.out.println(complex.Complexabs());
	}

}
