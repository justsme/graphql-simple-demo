package cn.justme.graphqldemo.types;

import lombok.Data;

import java.util.List;

/**
 * @author shiwei
 * @date 2019/1/23 13:01
 */

@Data
public class Class {
    private Integer id;

    private String name;

    private Integer ranking;

    private List<Student> students;
}
