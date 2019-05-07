package cn.justme.graphqldemo.mappers;


import cn.justme.graphqldemo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author shiwei
 * @date 2019/1/23 13:25
 */
@Mapper
public interface StudentMapper {

    @Select("select * from t_student where id = #{id}")
    Student getById(Integer id);

}
