package cn.justme.graphqldemo.resolvers;

import cn.justme.graphqldemo.entity.School;
import cn.justme.graphqldemo.entity.Student;
import cn.justme.graphqldemo.mappers.SchoolMapper;
import cn.justme.graphqldemo.mappers.StudentMapper;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author shiwei
 * @date 2019/1/23 13:03
 */
@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    private SchoolMapper schoolMapper;

    @Autowired
    private StudentMapper studentMapper;

    public School getSchool(Integer id) {
        return schoolMapper.getById(id);
    }

    public Student student(Integer id) {
        return studentMapper.getById(id);
    }
}
