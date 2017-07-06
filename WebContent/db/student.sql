--删除学生表
drop table tb_student;
delete TB_STUDENT;
--删除序列
drop SEQUENCE st_seq;
--创建学生表
CREATE TABLE tb_student(
id int PRIMARY KEY not null,
stid varchar2(18) unique not null,
name varchar2(25) not null,
password varchar2(10) not null,
gender varchar2(3) not null,
phone varchar2(11),
province varchar2(50) not null,
city varchar2(50) not null,
area varchar2(50) not null,
birthday date not null,
description varchar2(240)
);
--创建序列
CREATE SEQUENCE st_seq INCREMENT BY 1 START WITH 1;

--插入一条数据验证
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612901','刘晋','1314','男','15611771927', '山西省','运城市','稷山县',to_date('1996-11-22','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612902','韩壮壮','1314','男','15611826201','山西省','运城市','稷山县',to_date('1994-03-07','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612903','郭鑫雨','1314','女','18404968705','山西省','太原市','迎泽区',to_date('1995-08-29','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612904','李汉峰','1314','男','18801652730','山西省','太原市','杏花岭区',to_date('1995-08-09','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612906','张立云','1314','女','18234927655','山西省','朔州市','右玉县',to_date('1993-11-21','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612907','胡杨','1314','男','15611769215', '山西省','大同市','城区',to_date('1994-02-20','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612908','吴超','1314','男','18404986327', '山西省','吕梁市','离石区',to_date('1993-04-18','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612909','周凯津','1314','女','13643428284','山西省','大同市','城区',to_date('1995-08-21','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612910','解琨','1314','男','15611825375', '山西省','晋城市','高平市',to_date('1994-09-28','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612911','万凡','1314','男','18404967022', '山西省','大同市','城区',to_date('1993-01-04','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612912','王云泽','1314','男','15611771560','山西省','长治市','武乡县',to_date('1996-11-16','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612913','张晓泽','1314','男','15611823753','山西省','长治市','郊区',to_date('1993-05-23','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612914','张弛','1314','男','15611826673', '山西省','临汾市','尧都区',to_date('1993-04-02','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612915','杜一凡','1314','女','13903590577','山西省','运城市','盐湖区',to_date('1995-08-10','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612916','王兆飞','1314','男','15611770213','山西省','吕梁市','中阳县',to_date('1993-02-26','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612917','张旺旺','1314','男','15611772251','山西省','临汾市','洪洞县',to_date('1992-02-28','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612918','智九公','1314','男','15611771807','山西省','忻州市','定襄县',to_date('1995-11-01','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612919','徐娜','1314','女','18404984087', '山西省','忻州市','五台县',to_date('1993-02-09','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612920','贾利鑫','1314','女','18404982481','山西省','运城市','新绛县',to_date( '1994-06-04','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612921','张琦','1314','女','18404984762', '山西省','朔州市','朔城区',to_date('1993-05-02','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612922','刘业坤','1314','男','13994838211','山西省','吕梁市','离石区',to_date('1995-05-17','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612923','和璐媛','1314','女','18535444575','山西省','长治市','长子县',to_date('1995-06-05','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612924','梁慧超','1314','男','18404968424','山西省','朔州市','怀仁县',to_date('1994-03-07','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612925','孙涛','1314','男','18404968126', '山西省','运城市','临猗县',to_date('1998-08-01','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612926','杨晓旋','1314','男','18404967750','山西省','长治市','壶关县',to_date('1994-09-10','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612927','赵健','1314','男','18635950905', '山西省','运城市','垣曲县',to_date('1994-09-05','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612928','李灵枝','1314','女','15652659371','山西省','吕梁市','岚县',to_date('1995-10-15','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612929','曹玉涛','1314','男','15611771563','山西省','晋城市','阳城县',to_date('1994-01-23','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612930','杨璐宇','1314','女','18404984259','山西省','运城市','新绛县',to_date('1996-01-07','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612931','曹晨洁','1314','女','15611820568','山西省','长治市','郊区',to_date('1995-03-30','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612932','马诚','1314','男','13613550305', '山西省','长治市','郊区',to_date('1995-03-05','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612933','侯东昌','1314','男','18404968084','山西省','忻州市','偏关县',to_date('1994-08-30','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612934','郭杰','1314','男','15611821290', '山西省','临汾市','翼城县',to_date('1993-07-05','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612935','李珊珊','1314','女','15611769228','山西省','朔州市','贾庄乡',to_date('1992-03-24','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612936','王丹凤','1314','女','15611820656','山西省','吕梁市','岚县',to_date('1994-02-28','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612937','张洁','1314','女','18404983614', '山西省','运城市','盐湖区',to_date('1994-09-20','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612938','王海琛','1314','男','15611820291','山西省','太原市','小店区',to_date('1995-04-03','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612939','高鹏','1314','男','13393446321', '山西省','晋中市','榆次区',to_date('1994-02-22','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612940','孙国庆','1314','男','18404968741','山西省','大同市','阳高县',to_date('1994-10-11','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612941','张鹏','1314','男','17080033737', '山西省','晋中市','昔阳县',to_date('1995-05-09','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612942','李宇清','1314','男','18404984497','山西省','晋城市','高平市',to_date('1994-12-02','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612943','李志刚','1314','男','18404969092','山西省','大同市','大同县',to_date('1992-06-05','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612944','张宇','1314','男','15611761789', '山西省','晋中市','左权县',to_date('1994-08-25','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612945','魏鹏辉','1314','男','15611771790','山西省','长治市','武乡县',to_date('1995-03-01','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612946','张方荣','1314','男','15234355307','山西省','运城市','平陆县',to_date('1995-02-27','yyyy-mm-dd'),'同学');
insert into tb_student(id,stid,name,password,gender,phone,province,city,area,birthday,description) values(st_seq.nextval,'20131612947','李彬彬','1314','男','15835481294','山西省','晋城市','阳城县',to_date('1994-04-20','yyyy-mm-dd'),'同学');

--查询信息
select * from tb_student;

