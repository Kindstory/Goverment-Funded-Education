package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberChris = new Member(201106532, "Chris");
		Member memberEthan = new Member(201202132, "Ethan");
		Member memberMichael = new Member(201307532, "Michael");
		
		memberTreeSet.addMember(memberChris);
		memberTreeSet.addMember(memberEthan);
		memberTreeSet.addMember(memberMichael);
		memberTreeSet.showAllMember();
		
		Member memberGood = new Member(202006575, "Good");
		memberTreeSet.addMember(memberGood);
		memberTreeSet.showAllMember();
		
	}

}
