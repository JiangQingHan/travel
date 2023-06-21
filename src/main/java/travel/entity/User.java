package travel.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("User")
public class User {
    private Integer userId;

    private String phoneNumber;

    private String password;

    private String username;

    private Gender gender;

    private Date birthday;
}
