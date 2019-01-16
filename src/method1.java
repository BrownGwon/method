
public class method1 {
	public static void numbering(){ //컴퓨터는 함수 안에 {} <- 가로를 정의라고 생각함.
		int i = 0;
		while (i < 10){
			System.out.println(i);
			i++;
			
		}
		
		
		
	}
	
	public static void main(String[] args){
		numbering(); // numbering() 가로가 위에있는 numbering 내용을 호출하는것
		numbering(); // 컴퓨터는 numbering ()<- 가로를 호출이라고 생각함.
		numbering(); // 즉 현재코드는 저위에 넘버링 내용을 호출한것이다.
		numbering(); // 아래 와 같이 내용이 들어있는것.
	 
//		int i = 0;
//		while (i < 10){
//			System.out.println(i);
//			i++;
		
		
		
		
		
		
	}
	
	
	
	

}
