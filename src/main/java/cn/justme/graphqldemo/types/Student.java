package cn.justme.graphqldemo.types;

import lombok.Data;

/**
 * @author shiwei
 * @date 2019/1/23 13:01
 */

@Data
public class Student {

    private Integer id;

    private String name;

    private Integer age;

    private Class classDTO;

}
