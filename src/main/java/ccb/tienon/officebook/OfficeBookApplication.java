package ccb.tienon.officebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @参数 : 测试
 * @返回值 : 测试
 * @author : mx
 * @Time : 2022/9/27
 * @desc : 测试
 */
@SpringBootApplication
@RestController
public class OfficeBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(OfficeBookApplication.class, args);
    }

}
