package day08;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {

        //2차원 배열
        int[][] arr2d = {
                {1, 2, 3},

                {4, 5, 6},

                {7, 8, 9}
        };
        System.out.println("arr2d.length = " + arr2d.length);
        System.out.println(Arrays.toString(arr2d[0]));
        System.out.println(arr2d[2][1]);

        arr2d[1][2] = 100;

        arr2d[2] = new int[]{10, 20, 30}; //alt + enter 선언시에만 new type[]생략 가능

        System.out.println("======================================");

        for (int[] arr : arr2d) {
            for (int n : arr) {
                System.out.print( n + " ");
            }
            System.out.println();// 단순 줄 기행
        }

        //배열 생성문으로 생성하기
        //3행 5열짜리 배열
        int[][] testArr = new  int[6][2];

        //iter 쓰면 가능
        for (int[] ints : testArr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        //3차원 배열
       int[][][] arr3d = {
            { // 0번 인덱스
                {1,2,3}, //0번의 0번 인덱스
                {4,5,6},
                {7,8,9}
            },
            {// 1번 인덱스
                {10,11,12},
                {13,14,15},
                {16,17,18}
            },
            {// 2번 인덱스
                {19,20,21},
                {22,23,24},
                {25,26,27}}
        };

        System.out.println(arr3d[2][0][1]);

        int[][][] arr2dTest = new int[2][4][3];
        for (int[][] ints : arr2dTest) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }

    }

}

//한 명의 4과목 시험 점수 저장  1차원 배열

//한 학급 30명의 4과목 점수 2차원 배열

//한 학년의 학급 30명의 4과목 점수 3차원 배열