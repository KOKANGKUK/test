package chapter4;

import java.util.Scanner;

public class Prac01OpenChallenge {

	public static void main(String[] args) {
		System.out.println("끝말잇기 게임을 시작합니다...");
		Scanner sc = new Scanner(System.in);
		System.out.print("참가하는 인원은 몇명입니까 >> ");
		int cnt = sc.nextInt();
		Player[] players = new Player[cnt];
		for (int i = 0; i < cnt; i++) {
			System.out.print("참가자의 이름을 입력하세요.>> ");
			players[i] = new Player(sc.next());
		}
		System.out.println("시작하는 단어는 아버지 입니다.");
		run(players);

	}

	public static void run(Player[] players) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		String word = "아버지";
		int lastIdx = word.length() - 1;
		char lastChar = word.charAt(lastIdx);
		char firstChar = word.charAt(0);

		while (true) {
			lastChar = word.charAt(lastIdx);
			String player = players[i % players.length].name;
			System.out.print(player + ">>");
			word = sc.next();
			firstChar = word.charAt(0);
			if (lastChar == firstChar) {
				i++;
			} else {
				System.out.println(player + "가 졌습니다.");
				break;
			}
		}
	}

}

class Player {
	public String name = null;

	public Player() {

	}

	public Player(String name) {
		this.name = name;
	}

}