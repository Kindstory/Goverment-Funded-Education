package array;

public class DogTest {

	public static void main(String[] args) {
		
		Dog[] dogs = new Dog[5];
		String[] dogNames = {"�۸���1","�۸���2","�۸���3","�۸���4","�۸���5"};
		String[] types = {"������","��Ƽ��","�ú�����","������","������"};
//		dogs[0] = new Dog("�۸���1","������");
//		dogs[1] = new Dog("�۸���2","��Ƽ��");
//		dogs[2] = new Dog("�۸���3","�ú�����");
//		dogs[3] = new Dog("�۸���4","������");
//		dogs[4] = new Dog("�۸���5","������");
		
		for(int i=0; i<dogs.length;i++) {
			dogs[i] = new Dog(dogNames[i],types[i]);
			
		}
		
		for(Dog dog : dogs) System.out.println(dog.showDogInfo());
		
	}

}
