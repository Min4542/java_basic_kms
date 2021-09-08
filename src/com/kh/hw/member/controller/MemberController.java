package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

import java.util.Scanner;

public class MemberController {
    private Member[] m = new Member[SIZE];
    public static final int SIZE = 10;

    public MemberController() {

        m[0] = new Member("abc", "김철수", "1234", "abc@eamil.com", 'm', 12);
        m[1] = new Member("aㅇ", "김철수", "1ㅇㅈ", "abcㄷㅊ@eamil.com", 'm', 123);
        m[2] = new Member("ㄹㅇㄷ", "김갑수", "123ㅇ4", "abcㅇㅈㅊ@eamil.com", 'm', 156);
    }

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
            if (member == null) break;
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
        for (int i = 0; i < existMemberNum(); i++) {
            if (id.equals(m[i].getId())) {
                return m[i];
            }
        }
        return null;
    }

    //이름을 입력하면 그 이름에 해당하는 회원들의 정보를 리턴
    public Member[] searchName(String name) {

        //이름이 일치하는 회원들을 저장하는 배열
        Member[] foundMembers = {};

        for (int i = 0; i < existMemberNum(); i++) {
            if (name.equals(m[i].getName())) {
                foundMembers = pushMember(foundMembers, m[i]);
            }
        }

        return foundMembers;
    }

    //멤버 배열에 데이터를 추가하는 메서드
    private Member[] pushMember(Member[] targets, Member newMember) {

        Member[] temp = new Member[targets.length + 1];


        for (int i = 0; i < targets.length; i++) {
            temp[i] = targets[i];
        }


        temp[temp.length - 1] = newMember;

        return temp;

    }


    //이메일을 입력하면 그 이메일에 해당하는 회원 1명의 정보를 리턴
    public Member searchEmail(String email) {

        for (int i = 0; i < existMemberNum(); i++) {
            if (email.equals(m[i].getEmail())) {
                return m[i];
            }
        }
        return null;
    }

    public boolean updatePassword(String id, String password) {
        Member member = searchId(id);
        if (member != null) {
            member.setPassword(password);
            return true;
        } else {
            return false;
        }

    }

    public boolean updateName(String id, String name) {
        return false;
    }


    public boolean updateEmail(String id, String email) {
        return false;
    }

    //회원정보 하나를 삭제하는 메서드
    public boolean delete(String id) {

        if (!checkId(id)) {
            int idx = 0;
            for (int i = 0; i < SIZE; i++) {
                if (id.equals(m[i].getId())) {
                    idx = i;
                    break;
                }
            }
            for (int i=0; i<10; i++) {
                m[idx] = m[idx + 1];
                m[idx + 1] = null;
            }

            return true;
        }else {
            return false;}
    }

    public void delete() {
        for (int i = 0; i < m.length; i++) {
            m[i] = null;
        }

        return;
    }

    public Member[] printAll() {
        return null;
    }

}
