package sdut.ls.service;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import sdut.ls.bean.Run;
import sdut.ls.bean.Sort;
import sdut.ls.bean.User;
import sdut.ls.dao.UserDao;
import sdut.ls.util.Result;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	public Result outsum() {
		Result result=new Result();
		try {
			result.setData(dao.outsum());
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("��ѯ�ɹ�");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("��ѯʧ��");
		}
		return result;
	}
	public Result insum() {
		Result result=new Result();
		try {
			result.setData(dao.insum());
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("��ѯ�ɹ�");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("��ѯʧ��");
		}
		return result;
	}
	public Result reportform() {
		Result result=new Result();
		try {
			result.setData(dao.reportform());
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("��ѯ�ɹ�");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("��ѯʧ��");
		}
		return result;
	}
	//��ѯ�����
		public Result findsss() {
			Result result=new Result();
			try {
				result.setData(dao.findsss());
				result.setCode(1);
				result.setSuccess(true);
				result.setMessage("��ѯ�ɹ�");
			}catch(Exception e){
				e.printStackTrace();
				result.setCode(500);
				result.setSuccess(false);
				result.setMessage("��ѯʧ��");
			}
			return result;
		}
	//��ѯ�����
	public Result findss() {
		Result result=new Result();
		try {
			result.setData(dao.findss());
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("��ѯ�ɹ�");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("��ѯʧ��");
		}
		return result;
	}
	//��ѯ֧����Ϣ
	public Result selectoutRun() {
		Result result=new Result();
		try {
			result.setData(dao.selectoutRun());
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("��ѯ�ɹ�");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("��ѯʧ��");
		}
		return result;
	}
	//ɾ����Ϣ
	public Result deleteRun(Run run) {
		Result result=new Result();
		try {
			dao.deleteRun(run);
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("ɾ���ɹ�");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("ɾ��ʧ��");
		}
		return result;
	}
	//�޸���Ϣ
	public Result updateRun(Run run) {
		Result result=new Result();
		try {
			dao.updateRun(run);
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("���³ɹ�");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("����ʧ��");
		}
		return result;
	}
	//��ʾ��Ϣ
	public Result selectRun() {
		Result result=new Result();
		try {
			result.setData(dao.selectRun());
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("��ѯ�ɹ�");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("��ѯʧ��");
		}
		return result;
	}
	//������Ϣ
	public Result addRun(Run run) {
		Result result=new Result();
		try {
			dao.addRun(run);
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("��ӳɹ�");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("���ʧ��");
		}
		return result;
	}
	//�޸�Ȩ��
	public Result updateroleid(String username) {
		Result result=new Result();
		try {
			dao.updateroleid(username);
			result.setCode(3);
			result.setSuccess(true);
			result.setMessage("���³ɹ�");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("����ʧ��");
		}
		return result;
	}
	//��ѯ֧������
	public Result selectoutSort() {
		Result result=new Result();
		try {
			result.setData(dao.selectoutSort());
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("��ѯ�ɹ�");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("��ѯʧ��");
		}
		return result;
	}
	//ɾ������
	public Result deleteSort(Sort sort) {
		Result result=new Result();
		try {
			dao.deleteSort(sort);
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("ɾ���ɹ�");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("ɾ��ʧ��");
		}
		return result;
	}
	//�޸ķ���
	public Result updateSort(Sort sort) {
		Result result=new Result();
		try {
			dao.updateSort(sort);
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("���³ɹ�");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("����ʧ��");
		}
		return result;
	}
	//��ʾ����
	public Result selectSort() {
		Result result=new Result();
		try {
			result.setData(dao.selectSort());
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("��ѯ�ɹ�");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("��ѯʧ��");
		}
		return result;
	}
	//���ӷ���
	public Result addSort(Sort sort) {
		Result result=new Result();
		try {
			dao.addSort(sort);
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("��ӳɹ�");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("���ʧ��");
		}
		return result;
	}
	//֧����ѯ
	public Result finds(String financename ) {
		Result result=new Result();
		try {
			result.setData(dao.finds(financename));
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("��ѯ�ɹ�");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("�������쳣");
		}
		return result;
	}
	//�����ѯ
	public Result find(String financename ) {
		Result result=new Result();
		try {
			result.setData(dao.find(financename));
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("��ѯ�ɹ�");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("�������쳣");
		}
		return result;
	}
	//��¼��֤
	public Result login(User user,HttpServletRequest request) {
	
		Result result=new Result();
		result.setSuccess(true);
		User u =null;
		try {
			u=dao.login(user.getUsername());
			
		}catch(Exception e){
			result.setSuccess(false);
			result.setCode(500);
			result.setMessage("����������");
			return result;
		}
		if(u!=null) {
			if(StringUtils.isEmpty(user.getUsername())) {
				result.setCode(500);
				result.setSuccess(false);
				result.setMessage("�������û���");
				return result;
			}
			if(StringUtils.isEmpty(user.getPassword())) {
				result.setCode(500);
				result.setSuccess(false);
				result.setMessage("����������");
				return result;
			}
			if(user.getPassword().equals(u.getPassword())) {
				result.setCode(2);
				result.setMessage("��½�ɹ�");
				result.setData(u);
				request.getSession().setAttribute(u.getId()+"",u);
				return result;
			}
			result.setCode(1);
			result.setMessage("�������");
			return result;
		}
		if(StringUtils.isEmpty(user.getUsername())) {
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("�������û���");
			return result;
		}
		result.setCode(0);
		result.setMessage("�û�������");
		return result;

	}
}
