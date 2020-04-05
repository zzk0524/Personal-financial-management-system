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
			result.setMessage("查询成功");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("查询失败");
		}
		return result;
	}
	public Result insum() {
		Result result=new Result();
		try {
			result.setData(dao.insum());
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("查询成功");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("查询失败");
		}
		return result;
	}
	public Result reportform() {
		Result result=new Result();
		try {
			result.setData(dao.reportform());
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("查询成功");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("查询失败");
		}
		return result;
	}
	//查询分类表
		public Result findsss() {
			Result result=new Result();
			try {
				result.setData(dao.findsss());
				result.setCode(1);
				result.setSuccess(true);
				result.setMessage("查询成功");
			}catch(Exception e){
				e.printStackTrace();
				result.setCode(500);
				result.setSuccess(false);
				result.setMessage("查询失败");
			}
			return result;
		}
	//查询分类表
	public Result findss() {
		Result result=new Result();
		try {
			result.setData(dao.findss());
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("查询成功");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("查询失败");
		}
		return result;
	}
	//查询支出信息
	public Result selectoutRun() {
		Result result=new Result();
		try {
			result.setData(dao.selectoutRun());
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("查询成功");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("查询失败");
		}
		return result;
	}
	//删除信息
	public Result deleteRun(Run run) {
		Result result=new Result();
		try {
			dao.deleteRun(run);
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("删除成功");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("删除失败");
		}
		return result;
	}
	//修改信息
	public Result updateRun(Run run) {
		Result result=new Result();
		try {
			dao.updateRun(run);
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("更新成功");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("更新失败");
		}
		return result;
	}
	//显示信息
	public Result selectRun() {
		Result result=new Result();
		try {
			result.setData(dao.selectRun());
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("查询成功");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("查询失败");
		}
		return result;
	}
	//增加信息
	public Result addRun(Run run) {
		Result result=new Result();
		try {
			dao.addRun(run);
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("添加成功");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("添加失败");
		}
		return result;
	}
	//修改权限
	public Result updateroleid(String username) {
		Result result=new Result();
		try {
			dao.updateroleid(username);
			result.setCode(3);
			result.setSuccess(true);
			result.setMessage("更新成功");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("更新失败");
		}
		return result;
	}
	//查询支出分类
	public Result selectoutSort() {
		Result result=new Result();
		try {
			result.setData(dao.selectoutSort());
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("查询成功");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("查询失败");
		}
		return result;
	}
	//删除分类
	public Result deleteSort(Sort sort) {
		Result result=new Result();
		try {
			dao.deleteSort(sort);
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("删除成功");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("删除失败");
		}
		return result;
	}
	//修改分类
	public Result updateSort(Sort sort) {
		Result result=new Result();
		try {
			dao.updateSort(sort);
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("更新成功");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("更新失败");
		}
		return result;
	}
	//显示分类
	public Result selectSort() {
		Result result=new Result();
		try {
			result.setData(dao.selectSort());
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("查询成功");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("查询失败");
		}
		return result;
	}
	//增加分类
	public Result addSort(Sort sort) {
		Result result=new Result();
		try {
			dao.addSort(sort);
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("添加成功");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("添加失败");
		}
		return result;
	}
	//支出查询
	public Result finds(String financename ) {
		Result result=new Result();
		try {
			result.setData(dao.finds(financename));
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("查询成功");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("服务器异常");
		}
		return result;
	}
	//收入查询
	public Result find(String financename ) {
		Result result=new Result();
		try {
			result.setData(dao.find(financename));
			result.setCode(1);
			result.setSuccess(true);
			result.setMessage("查询成功");
		}catch(Exception e){
			e.printStackTrace();
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("服务器异常");
		}
		return result;
	}
	//登录验证
	public Result login(User user,HttpServletRequest request) {
	
		Result result=new Result();
		result.setSuccess(true);
		User u =null;
		try {
			u=dao.login(user.getUsername());
			
		}catch(Exception e){
			result.setSuccess(false);
			result.setCode(500);
			result.setMessage("服务器错误");
			return result;
		}
		if(u!=null) {
			if(StringUtils.isEmpty(user.getUsername())) {
				result.setCode(500);
				result.setSuccess(false);
				result.setMessage("请输入用户名");
				return result;
			}
			if(StringUtils.isEmpty(user.getPassword())) {
				result.setCode(500);
				result.setSuccess(false);
				result.setMessage("请输入密码");
				return result;
			}
			if(user.getPassword().equals(u.getPassword())) {
				result.setCode(2);
				result.setMessage("登陆成功");
				result.setData(u);
				request.getSession().setAttribute(u.getId()+"",u);
				return result;
			}
			result.setCode(1);
			result.setMessage("密码错误");
			return result;
		}
		if(StringUtils.isEmpty(user.getUsername())) {
			result.setCode(500);
			result.setSuccess(false);
			result.setMessage("请输入用户名");
			return result;
		}
		result.setCode(0);
		result.setMessage("用户名错误");
		return result;

	}
}
