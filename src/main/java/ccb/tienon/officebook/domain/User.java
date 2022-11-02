package ccb.tienon.officebook.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * Time:2022/10/18
 * author : mx
 * describe :
 */

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotEmpty(message = "不能为空")
    private String userId;

    @Email(message = "格式要email")
    private String email;

}
