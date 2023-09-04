package enumerations;

public enum Size {
	XS(36),
	S(38),
	M(40),
	L(42),
	XL(44),
	XXL(46);

	private final int sizeInNrs;

	Size(int sizeInNrs) {
		this.sizeInNrs = sizeInNrs;
	}

	public int getSizeInNrs() {
		return sizeInNrs;
	}
}
