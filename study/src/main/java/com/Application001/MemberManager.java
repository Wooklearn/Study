package com.Application001;

public class MemberManager {
//    System.out.println("1. 회원 등록");
//    System.out.println("2. 회원 정보 조회");

    // 회원 등록
    public void memberInsert(Member[] members) {
        for (int i = 0; i < members.length; i++) {
            System.out.println(members[i].toString()+"Joined");
        }

    }
    // 회원 정보 조회
    public void memberSearch() {


    }

}
