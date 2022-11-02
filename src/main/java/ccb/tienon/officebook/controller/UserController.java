package ccb.tienon.officebook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Time:2022/9/27
 * author : mx
 * describe :
 */
@RestController
public class UserController {

    /**
     * @返回值 : ResponseEntity<String>
     * @author : mx
     * @Time : 2022/9/27
     * @desc : 返回值
     */
    @GetMapping("/hello")
    public ResponseEntity<String> message(){
        return new ResponseEntity<>("hello.ok", HttpStatus.OK);
    }

}
