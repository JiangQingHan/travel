package travel.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import travel.entity.admin;

public interface adminMapper extends BaseMapper<admin> {
    @Select("select * from admin  WHERE name = #{name};")
    admin getByName(String name);
}
