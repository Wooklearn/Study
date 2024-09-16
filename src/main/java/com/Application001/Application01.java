package com.Application001;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 정보 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("번호를 누르세요 : ");
            int num = sc.nextInt();

            switch (num) {
                case 1 :
                    System.out.println("회원 등록");
                    // 회원등록하는 함수를 호출할 때 멤버 객체배열을 보내고 그 객체 배열을 출력하는게 목적
                    // 객체 생성의 목적
                    // 1. 기능을 가져오기 위한 클래스 객체 생성
                    // 2. DTO를 사용하기 위한 객체 생성
                    // 왜 객체 생성해야되는데? -> 외부에 있는 클래스니까요!

                    MemberManager manager = new MemberManager();

                    String[] strList = new String[5];

                    String[] str = {"1", "2", "3"};


                    // 배열은 목록
                    // 멤버 배열(목록)에는 멤버가 들어감
                    // Member[] members = {
                    // new Member("siwoo","siwoo01","siwoo",20,'남'),
                    // new Member("siwoo","siwoo01","siwoo",20,'남'),
                    // new Member("siwoo","siwoo01","siwoo",20,'남'),
                    // new Member("siwoo","siwoo01","siwoo",20,'남'),
                    // new Member("siwoo","siwoo01","siwoo",20,'남')
                    // };
                    Member[] members = new Member[5];

                    // 그럼 멤버에는 뭐가들어가야됨? -> 멤버가 들어가야함.
                    // 멤버가 들어가려면 어떻게 만들어서 멤버를 넣어야할까?
                    // Member 목록의 첫번째 공간
                    // 하지만 Member는 DTO이기 때문에 객체를 생성해서 하나씩 넣어줘야 한다.
                    members[0] = new Member("siwoo","siwoo01","siwoo",20,'남');
                    //Member
                    members[1] = new Member("siwoo1","siwoo01","siwoo",20,'남');
                    //Member
                    members[2] = new Member("siwoo1","siwoo01","siwoo",20,'남');
                    //Member
                    members[3] = new Member("siwoo1","siwoo01","siwoo",20,'남');
                    //Member
                    members[4] = new Member("siwoo1","siwoo01","siwoo",20,'남');

                    manager.memberInsert(members);
                    break;
                case 2 :
                    System.out.println("회원 정보 조회");
                    //
                    break;
                case 9 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 누르셨습니다.");
                    break;
            }
        }
    }
}
