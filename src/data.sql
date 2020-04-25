--sql文件
CREATE TABLE t_emp(
	id INT PRIMARY KEY AUTO_INCREMENT,
	last_name VARCHAR(50),
	birth DATE,
	email VARCHAR(30),
	gender VARCHAR(2),
	d_id INT
);

CREATE TABLE t_dept(
	id INT PRIMARY KEY AUTO_INCREMENT,
	dept_name VARCHAR(100)
);

INSERT INTO t_dept VALUES (1,'Java研发部'),(2,'Php研发部'),(3,'人力资源部');
INSERT INTO t_emp VALUES (1,'张三',NOW(),'zhangsan@qq.com',1,1);
INSERT INTO t_emp VALUES (2,'李四',NOW(),'lisi@qq.com',1,1);
INSERT INTO t_emp VALUES (3,'王五',NOW(),'wangwu@qq.com',1,1);
INSERT INTO t_emp VALUES (4,'赵六',NOW(),'zhaoliu@qq.com',1,1);
INSERT INTO t_emp VALUES (5,'张三丰',NOW(),'zhangsanfeng@qq.com',1,1);
INSERT INTO t_emp VALUES (6,'张翠山',NOW(),'zhangcuishan@qq.com',1,1);
INSERT INTO t_emp VALUES (7,'张无忌',NOW(),'zhangwuji@qq.com',1,1);
INSERT INTO t_emp VALUES (8,'花无缺',NOW(),'huawuque@163.com',1,2);
INSERT INTO t_emp VALUES (9,'小鱼儿',NOW(),'xiaoyuer@163.com',1,2);
INSERT INTO t_emp VALUES (10,'秦始皇',NOW(),'qinshihuang@163.com',1,2);
INSERT INTO t_emp VALUES (11,'汉武帝',NOW(),'hanwudi@163.com',1,2);
INSERT INTO t_emp VALUES (12,'唐太宗',NOW(),'tangtaizong@163.com',1,2);
INSERT INTO t_emp VALUES (13,'武则天',NOW(),'wuzetian@163.com',0,3);
