package demo.test.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * Created by dell on 2018/3/27.
 */
@Mapper
public interface TestMapper {

    @Select("select * from tf_f_test")
    List<Map<String,Object>> testQuery();
}
