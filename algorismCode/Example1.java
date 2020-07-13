package com.estsoft.myapplication;

import org.junit.Test;

public class Example1 {


    public int solution() {
        int answer = -1;
        return answer;
    }
    //몬스터의 체력이 주어지고 배열사이에 플레이어가 있을때,
    //공격력과 데미지 범위를 인풋으로 알려주고 몇마리 죽는지, 단 외곽은 데미지 반

    @Test
    public void test() {
//        int[][] maps = {{1, 28, 41, 22, 25, 79, 4}, {39, 20, 10, 17, 19, 18, 8}, {21, 4, 13, 12, 9, 29, 19}, {58, 1, 20, 5, 8, 16, 9}, {5, 6, 15, 2, 39, 8, 29}, {39, 7, 17, 5, 4, 49, 5}, {74, 46, 8, 11, 25, 2, 11}};
//        int p = 19;
//        int r = 6;

        int[][] maps = {{9, 8, 17, 55, 19, 7}, {1, 25, 5, 39, 28, 8}, {88, 19, 28, 3, 2, 9}, {76, 73, 7, 18, 16, 14}, {99, 8, 8, 7, 11, 9}, {1, 18, 4, 10, 3, 6}};
        int p = 16;
        int r = 4;



        int x = maps.length;
        int y = maps[0].length;

        int[][] deck = init(maps, x, y);
        int result = 0;

        int testx =0;
        int testy =0;

        print(deck);
        for (int i = 0; i < deck.length; i++) {
            if (i % 2 == 1) {
                continue;
            }
            for (int j = 0; j < deck.length; j++) {
                if (j % 2 == 1) {
                    continue;
                }
                deck = init(maps, x, y);
                int c = calculate(deck, i, j, p, r);
                if (c >= result) {
                    testx = i;
                    testy = j;
                    result = c;
                }
            }
        }
        System.out.println();
//
//
        calculate(deck, testx, testy, p, r);
        print(deck);
//
        System.out.println("testx : " + testx);
        System.out.println("testy : " + testy);
        System.out.println("result : " + result);

    }

    public int calculate(int[][] deck, int X, int Y, int p, int r) {
        int length = r;
        int deadMonster = 0;

        for (int i = X - length; i < X + length; i++) {
            if (X - length < 0 || X + length >= deck.length) {
                continue;
            }
            for (int j = Y - length; j < Y + length; j++) {
                if (Y - length < 0 || Y + length >= deck.length) {
                    continue;
                }
                //거리계산
                int abs = Math.abs(X - i) + Math.abs(Y - j);
                if (abs > r) {
                    continue;
                }

                if (abs == r) {
                    if ((p / 2) >= deck[i][j] && deck[i][j] > 0) {
                        deck[i][j] = -1;
                        deadMonster++;
                    }
                } else {
                    if (p >= deck[i][j] && deck[i][j] > 0) {
                        deck[i][j] = -1;
                        deadMonster++;
                    }
                }
            }
        }
        deck[X][Y] = 99;
//        System.out.println("deadMonster : " + deadMonster);
        return deadMonster;
    }

    //deck 즉 몬스터의 배열 주변에 벽이 생기도록 일단 생성
    //배열은 해당 길이의 두배의 + 1개의 크기
    // 000
    // 0x0 이렇게 생기도록
    // 000
    public int[][] init(int[][] maps, int x, int y) {
        int[][] deck = new int[(x * 2 + 1)][(y * 2) + 1];
        for (int i = 0; i < deck.length; i++) {
            if (i % 2 == 0) {
                continue;
            }
            for (int j = 0; j < deck[0].length; j++) {
                if (j % 2 == 0) {
                    continue;
                }
                deck[i][j] = maps[i / 2][j / 2];
            }
        }
        return deck;
    }

    public void print(int[][] deck) {
        for (int i = 0; i < deck.length; i++) {
            for (int j = 0; j < deck[i].length; j++) {
                System.out.print(String.format("%02d", deck[i][j]) + "  ");
            }
            System.out.println();
        }
    }
}
