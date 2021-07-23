//20210724
//트리
//그래프이론,그래프탐색,트리,깊이우선탐색 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Q1068 {
	static int nodes[][];
	static int num;// 노드개수
	static int removed = -10;
	public static void main(String[] args) throws  NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine().trim());// br은 스트링타입이어서 int타입으로 변환,트리의 노드의 개수
		nodes = new int[num][2];
		String[] str = br.readLine().trim().split(" ");// 한줄로 읽고 각각 자른다.
		for (int i = 0; i < num; i++) {// 이중배열
			int parent = Integer.parseInt(str[i]);// 입력받은 값은 부모노드
			nodes[i][0] = parent;// 첫번째는 부모노드 번호
			if (parent == -1) {
				continue;//루트노드 				
			} 
			nodes[parent][1]++;// 두번째는 자식노드 개수 ++
			
		}
		int remove = Integer.parseInt(br.readLine().trim());// 지울 노드 번호
		removeNode(remove);
		int r=result();
		System.out.println(r);
	}

	static void removeNode(int remove) {
		int parent = nodes[remove][0];
		if (nodes[remove][0] != -1) {// 루프노드가 아니면
			nodes[parent][1]--;// 제거된노드의 부모노드의 자식개수--
		}
		nodes[remove][0] = removed;// 지워진 노드는 -10으로 저장
		if (nodes[remove][1] != 0) {// 자식노드가 있으면
			for (int i = 0; i < num; i++) {
				if (nodes[i][0] == remove) {
					removeNode(i);
				}
			}
		}
	}

	static  int result() {
		int count = 0;
		for (int i = 0; i < num; i++) {
			if (nodes[i][0] != removed & nodes[i][1] == 0) //제거된 노드가 아니고 자식 노드 수가 0이면 
				count++;
		}
		return count;
	}
}
