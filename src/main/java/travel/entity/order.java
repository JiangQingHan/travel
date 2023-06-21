package travel.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("`order`")
public class order {
    private Integer orderId;
    private Integer roomId;
    private Integer userId;
    private String rating;
    private Date time;
    private BigDecimal price;
}
