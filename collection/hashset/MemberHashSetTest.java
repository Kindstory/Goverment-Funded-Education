package collection.hashset;

import collection.Member;

public class MemberHashSetTest {
	public static void main(String [] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		
		Member memberAlive = new Member(1001, "����ֳ�");
		Member memberDead = new Member(1002, "�� �����Ŵ�?");
		Member memberWhoAreYou = new Member(1003, "Who the fuck are you?");
		
		
		memberHashSet.addMember(memberAlive);
		memberHashSet.addMember(memberDead);
		memberHashSet.addMember(memberWhoAreYou);
		memberHashSet.showAllMember();
		
		Member memberSon = new Member(1004, "Mr.Son");
		memberHashSet.addMember(memberSon);
		memberHashSet.showAllMember();
		
		
		
	}

}
