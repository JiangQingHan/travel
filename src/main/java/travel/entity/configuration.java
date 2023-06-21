package travel.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("configuration")
public class configuration {
    private Integer configurationId;
    private Integer roomId;
    private String text;
    private String imageUrl;
}
