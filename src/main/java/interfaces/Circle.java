package interfaces;

public class Circle implements Shape, Shape3D{

	@Override
	public void rollAround() {
		System.out.println("Rolls very quick");
	}

	@Override
	public void rollAroundIn3D() {

	}


}
