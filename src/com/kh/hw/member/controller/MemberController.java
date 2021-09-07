package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

import java.util.Scanner;

public class MemberController {
    private Member[] m = new Member[SIZE];
    public static final int SIZE = 10;


    //실제 저장된 회원의 숫자
    public int existMemberNum() {
        int cnt = 0; //숫자를 세는 변수
        for (int i = 0; i < m.length; i++) {
            if (m[i] == null) {
                break;
            }
            cnt++;
        }
        return cnt;
    }

    //아이디 중복체크하는 메서드
    public boolean checkId(String inputId) {

        for (Member member : m) {
            if(member == null) break;
            if (inputId.equals(member.getId())) {
                return false;
            }
        }
        return true;
    }

    public void insertMember(String id, String name, String password, String email, String gender, int age) {
        //charAt(index)  : 문자열에서 해당 위치의 글자 하나를 추출
        int c = existMemberNum();
        System.out.println("c = " + c);
        m[c] = new Member(id, name, password, email, gender.charAt(0), age);
        return;
    }

    //아이디를 입력하면 그 아이디에 해당하는 회원 1명의 정보를 리턴
    public Member searchId(String id) {
        for (Member member : m) {
            if (id.equals(member.getId())) {
                return member;
            }
        }
        return null;
    }

    //이름을 입력하면 그 이름에 해당하는 회원들의 정보를 리턴
    public Member[] searchName(String name) {

        Member[] n = new Member[SIZE];

        for (int i = 0; i < SIZE + 1; i++) {
            if (name.equals(m[i].getName())) {
                n[i] = m[i];
            }
        }

        return null;
    }

    //이메일을 입력하면 그 이메일에 해당하는 회원 1명의 정보를 리턴
    public Member searchEmail(String email) {
        return null;
    }

    public boolean updatePassword(String id, String password) {
        return false;
    }

    public boolean updateName(String id, String name) {
        return false;
    }


    public boolean updateEmail(String id, String email) {
        return false;
    }

    public boolean delete(String id) {
        return false;
    }

    public void delete() {
        return;
    }

    public Member[] printAll() {
        return null;
    }

}
