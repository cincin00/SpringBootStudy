package jpashop.jpabook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpabookApplication {
	 public static void main(String[] args){
		Hello hello = new Hello();
		hello.setData("gabiacns BootSpring Study");
		String data = hello.getData();
		System.out.println("data::::"+data);
		SpringApplication.run(JpabookApplication.class, args);
	}

}
