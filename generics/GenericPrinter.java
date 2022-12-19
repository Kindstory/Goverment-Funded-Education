package generics;

public class GenericPrinter<T> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String hiIamsandy() {
		return "안녕 난 샌디야";
	}
	
	public void hiIamBen() {
		System.out.println("리턴값이 없으면 프린트린 안에다 못 넣는다고, 걍 밖에서 뽑는다 치사해서");
	}
	@Override
	public String toString() {
		return material.toString();
	}

}
