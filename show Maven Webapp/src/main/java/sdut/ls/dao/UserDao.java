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
	//��¼У��
	@Select("select * from users where username=#{username}")
	User login(@Param("username") String username);
	
	@Update("update users set roleid=1 where username=#{username}")
	void updateroleid(@Param("username") String username);
	//�����ѯ
	@Select("select * from inoutrun where financename like CONCAT(CONCAT('%', #{financename}), '%') and inoutsort='����'")
	List<Run> find(@Param("financename") String financename);
	//֧����ѯ
	@Select("select * from inoutrun where financename like CONCAT(CONCAT('%', #{financename}), '%') and inoutsort='֧��'")
	List<Run> finds(@Param("financename") String financename);
	//���ӷ���
	@Insert("insert into inoutsort value(null,#{sort.name},#{sort.inorout})")
	void addSort(@Param("sort")Sort sort);
	//��ѯ��ʾ����
	@Select("select * from inoutsort where inorout='����'")
	List<Sort> selectSort();
	//�޸ķ���
	@Update("update inoutsort set name=#{sort.name} where id=#{sort.id}")
	void updateSort(@Param("sort")Sort sort);
	//ɾ������
	@Delete("delete from inoutsort where id=#{sort.id}")
	void deleteSort(@Param("sort")Sort sort);
	//��ѯ��ʾ֧��
	@Select("select * from inoutsort where inorout='֧��'")
	List<Sort> selectoutSort();
	//������Ϣ
	@Insert("insert into inoutrun value(null,#{run.financename},#{run.sorts},#{run.money},#{run.time},#{run.inoutsort})")
	void addRun(@Param("run")Run run);
	//��ʾ��Ϣ
	@Select("select * from inoutrun where inoutsort='����'")
	List<Run> selectRun();
	//�޸���Ϣ
	@Update("update inoutrun set financename=#{run.financename},sorts=#{run.sorts},money=#{run.money},time=#{run.time} where id=#{run.id}")
	void updateRun(@Param("run")Run run);
	//ɾ����Ϣ
	@Delete("delete from inoutrun where id=#{run.id}")
	void deleteRun(@Param("run")Run run);
	//��ѯ֧����Ϣ
	@Select("select * from inoutrun where inoutsort='֧��'")
	List<Run> selectoutRun();
	
	@Select("select distinct(name) from inoutsort where inorout='����'")
	List<Sort> findss();
	
	@Select("select distinct(name) from inoutsort where inorout='֧��'")
	List<Sort> findsss();
	
	//����
	@Select("select * from inoutrun")
	List<Run> reportform();
	
	@Select("select sum(money) from inoutrun where inoutsort='����'")
	double insum();
	@Select("select sum(money) from inoutrun where inoutsort='֧��'")
	double outsum();
}
