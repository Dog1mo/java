package dnf_cal;
import java.io.IOException;
import java.util.Scanner;

public class main {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);

		Data D = new Data();

		System.out.println(" ● 템렙계산기");
		System.out.println();
		System.out.println(" ● 첫번째 장비의 레벨과 경험치를 순서대로 입력해주세요");
		System.out.println("   ex)	1Lv	0.00%	20Lv	10.00%	34Lv	1.50%	45Lv	21.68%");
		System.out.println("   →	1	0	20	10	34	1.5	45	21.68");
		int a1 = sc.nextInt(); // a,b는 각각 템렙
		float aExp1 = sc.nextFloat(); // 장비 경험치 퍼센트
		int a2 = sc.nextInt();
		float aExp2 = sc.nextFloat();
		int a3 = sc.nextInt();
		float aExp3 = sc.nextFloat();
		int a4 = sc.nextInt();
		float aExp4 = sc.nextFloat();

		System.out.printf("\n ● 첫번째 장비 레벨과 경험치를 확인해주세요 \n");
		System.out.printf("    1옵션 - " + a1 + "Lv (%.2f%%)\n", aExp1);
		System.out.printf("    2옵션 - " + a2 + "Lv (%.2f%%)\n", aExp2);
		System.out.printf("    3옵션 - " + a3 + "Lv (%.2f%%)\n", aExp3);
		System.out.printf("    4옵션 - " + a4 + "Lv (%.2f%%)\n", aExp4);


		System.out.print("\n ● 두번째 장비의 레벨과 경험치를 순서대로 입력해주세요 \n");
		int b1 = sc.nextInt();
		float bExp1 = sc.nextFloat();
		int b2 = sc.nextInt();
		float bExp2 = sc.nextFloat();
		int b3 = sc.nextInt();
		float bExp3 = sc.nextFloat();
		int b4 = sc.nextInt();
		float bExp4 = sc.nextFloat();

		System.out.print("\n ● 두번째 장비 레벨과 경험치를 확인해주세요 \n");
		System.out.printf("    1옵션 - " + b1 + "Lv (%.2f%%)\n", bExp1);
		System.out.printf("    2옵션 - " + b2 + "Lv (%.2f%%)\n", bExp2);
		System.out.printf("    3옵션 - " + b3 + "Lv (%.2f%%)\n", bExp3);
		System.out.printf("    4옵션 - " + b4 + "Lv (%.2f%%)\n", bExp4);

		// La1은 장비 총 경험치
		// 
		float La1 = (float) (D.L[a1] + ((D.L[a1+1] - D.L[a1]) * (aExp1 * 0.01))); 
		float La2 = (float) (D.L[a2] + ((D.L[a2+1] - D.L[a2]) * (aExp2 * 0.01)));
		float La3 = (float) (D.L[a3] + ((D.L[a3+1] - D.L[a3]) * (aExp3 * 0.01)));
		float La4 = (float) (D.L[a4] + ((D.L[a4+1] - D.L[a4]) * (aExp4 * 0.01)));
		float Lb1 = (float) (D.L[b1] + ((D.L[b1+1] - D.L[b1]) * (bExp1 * 0.01)));
		float Lb2 = (float) (D.L[b2] + ((D.L[b2+1] - D.L[b2]) * (bExp2 * 0.01)));
		float Lb3 = (float) (D.L[b3] + ((D.L[b3+1] - D.L[b3]) * (bExp3 * 0.01)));
		float Lb4 = (float) (D.L[b4] + ((D.L[b4+1] - D.L[b4]) * (bExp4 * 0.01)));

		System.out.println("\n----------------------------------------------------");
		System.out.print("\n ● 성장 후 경험치입니다");

		float sum1 = La1 + Lb1;
		for(int i = 1; i < 70; i++) {
			float x = sum1 - D.L[i];
			if(x < 0) {
				float y = (sum1 - D.L[i-1]) * 100 / (D.L[i] - D.L[i-1]);
				System.out.printf("\n    1옵션 - " + (i-1) + "Lv (%.2f%%)", y);
				break;
			}
		}


		float sum2 = La2 + Lb2;
		for(int i = 1; i < 70; i++) {
			float x = sum2 - D.L[i];
			if(x < 0) {
				float y = (sum2 - D.L[i-1]) * 100 / (D.L[i] - D.L[i-1]);
				System.out.printf("\n    2옵션 - " + (i-1) + "Lv (%.2f%%)", y);
				break;
			}
		}


		float sum3 = La3 + Lb3;
		for(int i = 1; i < 70; i++) {
			float x = sum3 - D.L[i];
			if(x < 0) {
				float y = (sum3 - D.L[i-1]) * 100 / (D.L[i] - D.L[i-1]);
				System.out.printf("\n    3옵션 - " + (i-1) + "Lv (%.2f%%)", y);
				break;
			}
		}


		float sum4 = La4 + Lb4;
		for(int i = 1; i < 70; i++) {
			float x = sum4 - D.L[i];
			if(x < 0) {
				float y = (sum4 - D.L[i-1]) * 100 / (D.L[i] - D.L[i-1]);
				System.out.printf("\n    4옵션 - " + (i-1) + "Lv (%.2f%%)", y);
				break;
			}
		}

		System.out.printf("\n\n추가로 성장하시겠습니까?(Y/N)\n");
		String anser1 = sc.next();
		if(anser1.equals("Y") || anser1.equals("y")) {
			System.out.println("ㅋㅋ 써줘서 고마오~ 여기까지만 만듬..");
		}
		
		else if(anser1.equals("N") || anser1.equals("n")){
			System.out.println("초기화 후 다시 진행하시겠습니까?");
			String anser2 = sc.next();

			if(anser2.equals("Y") || anser2.equals("y")) {
				System.out.println("ㅋㅋ 써줘서 고마오~ 여기까지만 만듬..");
			}
			
			else if(anser2.equals("N") || anser2.equals("n")){
				System.out.println("ㅋㅋ 써줘서 고마오~ 여기까지만 만듬..");
			}
		}
		else System.out.println("다시 입력해주세요");

	}
}

