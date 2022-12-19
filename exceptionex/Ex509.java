package exceptionex;

public class Ex509 {
	private String userPW;

	public String getUserPW() {
		return userPW;
	}

	public void setUserPW(String userPW) throws Exception {
		if (userPW == null) {
			throw new Exception("���̵�� null�� �� �����ϴ�.");
		} else if (userPW.length() < 5) {
			throw new Exception("��й�ȣ�� 5�� �̸��� �� �����ϴ�.");
		} else if (userPW.matches("[a-zA-Z]+")) {
			throw new Exception("��й�ȣ�� ���ڿ��θ� �̷���� �� �����ϴ�.");
		}

		this.userPW = userPW;
	}

	public static void main(String[] args) {

		Ex509 test = new Ex509();

		String userPW = null;
		// System.out.println(test.getUserPW());
		try {
			test.setUserPW(userPW);
		} catch (Exception h) {
			System.out.println(h.getMessage());
		}

		userPW = "sdfd";  // 5�� �̸� �̸鼭 ���ڿ��θ� �̷��������, ���� ���ܸ޽������� ��� 
		try {
			test.setUserPW(userPW);
		} catch (Exception h) {
			System.out.println(h.getMessage());
		}
		
		
		userPW = "sdfdssddsfsdfsdfds";
		try {
			test.setUserPW(userPW);
		}catch(Exception h) {
			System.out.println(h.getMessage());
		}
		

	}

}
