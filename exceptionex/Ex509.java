package exceptionex;

public class Ex509 {
	private String userPW;

	public String getUserPW() {
		return userPW;
	}

	public void setUserPW(String userPW) throws Exception {
		if (userPW == null) {
			throw new Exception("아이디는 null일 수 없습니다.");
		} else if (userPW.length() < 5) {
			throw new Exception("비밀번호는 5자 미만일 수 없습니다.");
		} else if (userPW.matches("[a-zA-Z]+")) {
			throw new Exception("비밀번호는 문자열로만 이루어질 수 없습니다.");
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

		userPW = "sdfd";  // 5자 미만 이면서 문자열로만 이루어졌을떄, 위에 예외메시지부터 출력 
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
