package my.julie.springyeonjoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // annotation 어노테이션: 클래스에 대한 부가적인 정보 제공, 개발자가 굳이 코드를 짜지 않아도 자동으로 무언가를 만듦
public class SpringYeonjooApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringYeonjooApplication.class, args);
    }
}

/*
 *  Jpa: 쿼리를 한 줄도 안써도 자동으로 생성해줌
 *  H2 : MySQL랑 비슷하게 돌아가는데 스프링이 뜰 때 메모리에만 있는 데이터 베이스 (dev용)
 */