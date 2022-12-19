package map.hashmap;

import collection.Member;

public class MemberHaspMapTest {
	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberChris = new Member(1170009024, "Chris");
		Member memberEthan = new Member(1170009025, "Ethan");
		Member memberMichael = new Member(1170009026, "Michael");
		Member memberBrad = new Member(1170009026, "Brad");      // 키값 동일하고 value값 다른거 넣으면 뒤에꺼 추가되네
		
		memberHashMap.addMember(memberChris);
		memberHashMap.addMember(memberEthan);
		memberHashMap.addMember(memberMichael);
		memberHashMap.addMember(memberBrad);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1170009026);
		memberHashMap.showAllMember();
		
		
		
	}

}
