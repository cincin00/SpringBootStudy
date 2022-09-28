package jpashop.jpabook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpabookApplication {
	 public static void main(String[] args){
		// 예제1. 데이터 출력
		Hello hello = new Hello();
		hello.setData("gabiacns BootSpring Study");
		String data = hello.getData();
		System.out.println("data::::"+data);
		// 예제2. 테이블 세팅
		//Member member = new Member();

		SpringApplication.run(JpabookApplication.class, args);
	}

}
