package innerClass;

public class OuterClass {
	private static int outerField = 10;

	public int getOuterField() {
		return outerField;
	}

	public static class InnerClass {
		public void innerMethod() {
			System.out.println("InnerClass's innerMethod called.");
			System.out.println("Accesing outerField from inner class: " + outerField);
		}
	}
 }
