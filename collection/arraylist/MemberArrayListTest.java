package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberChr = new Member(1001, "Chris");
		Member memberEth = new Member(1002, "Ethan");
		Member memberMic = new Member(1003, "Michael");
		Member memberBen = new Member(1004, "Benjamin");
		
		memberArrayList.addMember(memberChr);
		memberArrayList.addMember(memberEth);
		memberArrayList.addMember(memberMic);
		memberArrayList.addMember(memberBen);
		
		memberArrayList.insertMember(2, memberEth);
		memberArrayList.insertMember(1, memberMic);
		memberArrayList.insertMember(0, memberChr);
		
		
		memberArrayList.showAllMember();
		
		
		
		
		memberArrayList.removeMember(memberBen.getMemberId());
		memberArrayList.showAllMember();
	}

}


// size는 요소의 개수, capacity는 용량 1개당 몇 바이트씩 해서 ㅇㅇ