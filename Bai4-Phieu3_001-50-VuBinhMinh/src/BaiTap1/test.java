package BaiTap1;

public class test {

	public static void main(String[] args) {
		int a = (int) (Math.random()*100);
		int b = (int) (Math.random()*100);
		
		if(a > b)
			System.out.println("a lớn hơn b");
		else
			System.out.println("a nhỏ hơn b");
		
		for(int i = 0; i < 10; i += 2) {
			System.out.print(i + " ");
		}
		
		while((int) (Math.random()*10) < 5) {
			System.out.println("while");
		}
		
		do {
			System.out.println("do...while");
		}while((int) (Math.random()*10) < 5);
		
		switch ((int) (Math.random()*5)) {
		case 1:
			System.out.println("case 1");
			break;
		case 2:
			System.out.println("case 2");
			break;
		case 3:
			System.out.println("case 3");
			break;
		case 4:
			System.out.println("case 5");
			break;

		default:
			System.out.println("default");
			break;
		}
		
		
	}

}
