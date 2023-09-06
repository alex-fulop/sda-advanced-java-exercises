package enumerations;

public enum Sizes {
	XS(34),
	S(36),
	M(38),
	L(40),
	XL(42),
	XXL(44);

	private int sizeInNrs;

	Sizes(int sizeInNrs) {
		this.sizeInNrs = sizeInNrs;
	}

	public int getSizeInNrs() {
		return sizeInNrs;
	}

	public void evaluateSize(Sizes size) {
		if(size == XL) {
			System.out.println("Sorry, we don't have that size in stock");
		} else {
			System.out.println("Yeah we have it");
		}
	}

}
