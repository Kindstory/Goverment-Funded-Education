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
		return "�ȳ� �� �����";
	}
	
	public void hiIamBen() {
		System.out.println("���ϰ��� ������ ����Ʈ�� �ȿ��� �� �ִ´ٰ�, �� �ۿ��� �̴´� ġ���ؼ�");
	}
	@Override
	public String toString() {
		return material.toString();
	}

}
