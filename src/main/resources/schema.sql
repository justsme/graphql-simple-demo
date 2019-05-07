create table t_school (
  id int not null AUTO_INCREMENT,
  name varchar(30) comment '班级名称',
  ranking int comment '班级排名',
  primary key (id)
);


create table t_student (
  id int not null primary key AUTO_INCREMENT,
  name varchar(30) comment '学生姓名',
  age int comment '学生年龄',
  class_id int comment '所以班级id'
);