package cn.justme.graphqldemo.mappers;

import cn.justme.graphqldemo.entity.School;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author shiwei
 * @date 2019/1/23 13:14
 */
@Mapper
public interface SchoolMapper {

    @Select("select * from t_school where id= #{id}")
    School getById(Integer id);

}
