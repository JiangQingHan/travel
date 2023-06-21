package travel.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("accommodation")
public class accommodation {
    private Integer roomId;
    private BigDecimal price;
    private status status;
    private Integer configurationId;
    private String imageUrl;
}
