package array;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogs = new ArrayList<>();
		String[] dogNames = {"港港捞1","港港捞2","港港捞3","港港捞4","港港捞5"};
		String[] types = {"柳稻俺","富萍胶","矫海府救","柳稻俺","柳稻俺"};
//		dogs[0] = new Dog("港港捞1","柳稻俺");
//		dogs[1] = new Dog("港港捞2","富萍胶");
//		dogs[2] = new Dog("港港捞3","矫海府救");
//		dogs[3] = new Dog("港港捞4","柳稻俺");
//		dogs[4] = new Dog("港港捞5","柳稻俺");
		
		for(int i=0; i<dogs.size();i++) { //促矫茄锅 焊扁, 惑加俺充 促矫 汲疙
			dogs.add(new Dog(dogNames[i],types[i]));
			
		}
		
		for(Dog dog : dogs) System.out.println(dog.showDogInfo());
		
	}


	}

}
