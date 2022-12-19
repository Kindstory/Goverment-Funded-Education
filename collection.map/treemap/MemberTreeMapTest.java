package map.treemap;

import collection.Member;

public class MemberTreeMapTest {
	public static void main(String[] args) {
		MemberTreeMap memberHashMap = new MemberTreeMap();
		
		Member memberEthan = new Member(1170009024, "Ethan");
		Member memberChris = new Member(1170009025, "Chris");
		Member memberMichael = new Member(1170009026, "Michael");
		Member memberBrad = new Member(1170009027, "Brad");
		
		memberHashMap.addMember(memberEthan);
		memberHashMap.addMember(memberChris);
		memberHashMap.addMember(memberMichael);
		memberHashMap.addMember(memberBrad);
			
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1170009027);
		memberHashMap.showAllMember();
		
		
		
	}

}
