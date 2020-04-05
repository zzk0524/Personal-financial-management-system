package sdut.ls.dao;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import sdut.ls.bean.Run;
import sdut.ls.bean.Sort;
import sdut.ls.bean.User;

@Mapper
public interface UserDao {
	//登录校验
	@Select("select * from users where username=#{username}")
	User login(@Param("username") String username);
	
	@Update("update users set roleid=1 where username=#{username}")
	void updateroleid(@Param("username") String username);
	//收入查询
	@Select("select * from inoutrun where financename like CONCAT(CONCAT('%', #{financename}), '%') and inoutsort='收入'")
	List<Run> find(@Param("financename") String financename);
	//支出查询
	@Select("select * from inoutrun where financename like CONCAT(CONCAT('%', #{financename}), '%') and inoutsort='支出'")
	List<Run> finds(@Param("financename") String financename);
	//增加分类
	@Insert("insert into inoutsort value(null,#{sort.name},#{sort.inorout})")
	void addSort(@Param("sort")Sort sort);
	//查询显示分类
	@Select("select * from inoutsort where inorout='收入'")
	List<Sort> selectSort();
	//修改分类
	@Update("update inoutsort set name=#{sort.name} where id=#{sort.id}")
	void updateSort(@Param("sort")Sort sort);
	//删除分类
	@Delete("delete from inoutsort where id=#{sort.id}")
	void deleteSort(@Param("sort")Sort sort);
	//查询显示支出
	@Select("select * from inoutsort where inorout='支出'")
	List<Sort> selectoutSort();
	//增加信息
	@Insert("insert into inoutrun value(null,#{run.financename},#{run.sorts},#{run.money},#{run.time},#{run.inoutsort})")
	void addRun(@Param("run")Run run);
	//显示信息
	@Select("select * from inoutrun where inoutsort='收入'")
	List<Run> selectRun();
	//修改信息
	@Update("update inoutrun set financename=#{run.financename},sorts=#{run.sorts},money=#{run.money},time=#{run.time} where id=#{run.id}")
	void updateRun(@Param("run")Run run);
	//删除信息
	@Delete("delete from inoutrun where id=#{run.id}")
	void deleteRun(@Param("run")Run run);
	//查询支出信息
	@Select("select * from inoutrun where inoutsort='支出'")
	List<Run> selectoutRun();
	
	@Select("select distinct(name) from inoutsort where inorout='收入'")
	List<Sort> findss();
	
	@Select("select distinct(name) from inoutsort where inorout='支出'")
	List<Sort> findsss();
	
	//报表
	@Select("select * from inoutrun")
	List<Run> reportform();
	
	@Select("select sum(money) from inoutrun where inoutsort='收入'")
	double insum();
	@Select("select sum(money) from inoutrun where inoutsort='支出'")
	double outsum();
}
