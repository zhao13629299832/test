package Servlet;

public class demo {

	public static void main(String[] args) {
		for(int i=1,j=1;i<10;j++){
			System.out.print(i+"*"+j+"="+(i*j)+"\t");
			if(j==i){
				System.out.println();
				j=0;
				i++;
			}
		}

	}

}
