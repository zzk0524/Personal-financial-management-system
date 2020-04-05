package sdut.ls.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sdut.ls.bean.Run;
import sdut.ls.bean.Sort;
import sdut.ls.bean.User;
import sdut.ls.service.UserService;
import sdut.ls.util.Result;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

	@Autowired
	private UserService service;
//	登录
	@PostMapping("/login")
	public Result login(User user,HttpServletRequest request) {
		return service.login(user, request);
	}
//	收入查询
	@GetMapping("/find")
	public Result find(String financename) {
		return service.find(financename);
	}
	//支出查询
	@GetMapping("/finds")
	public Result finds(String financename) {
		return service.finds(financename);
	}
	//增加分类
	@PostMapping("/addSort")
	public Result addSort(@RequestBody Sort sort) {
		return service.addSort(sort);
	}
	//查询显示分类
	@GetMapping("/selectSort")
	public Result selectSort() {
		return service.selectSort();
	}
	//修改分类
	@PostMapping("/updateSort")
	public Result updateSort(@RequestBody Sort sort) {
		return service.updateSort(sort);
	}
	//删除收入分类
	@PostMapping("/deleteSort")
	public Result deleteSort(@RequestBody Sort sort) {
		return service.deleteSort(sort);
	}
	//删除支出分类
	@GetMapping("/selectoutSort")
	public Result selectoutSort() {
		return service.selectoutSort();
	}
	//修改权限
	@PostMapping("/updateroleid")
	public Result updateroleid(@RequestBody String username) {
		System.out.println(username);
		return service.updateroleid(username);
	}
	//增加信息
	@PostMapping("/addRun")
	public Result addRun(@RequestBody Run run) {
		return service.addRun(run);
	}
	//查询显示信息
	@GetMapping("/selectRun")
	public Result selectRun() {
		return service.selectRun();
	}
	//修改信息
	@PostMapping("/updateRun")
	public Result updateRun(@RequestBody Run run) {
		return service.updateRun(run);
	}
	//删除信息
	@PostMapping("/deleteRun")
	public Result deleteRun(@RequestBody Run run) {
		return service.deleteRun(run);
	}
	//查询支出信息
	@GetMapping("/selectoutRun")
	public Result selectoutRun() {
		return service.selectoutRun();
	}
	//查询分类表
	@GetMapping("/findss")
	public Result findss() {
		return service.findss();
	}
	//查询分类表
	@GetMapping("/findsss")
	public Result findsss() {
		return service.findsss();
	}
	@GetMapping("/reportform")
	public Result reportform() {
		return service.reportform();
	}
	@GetMapping("/insum")
	public Result insum() {
		return service.insum();
	}
	@GetMapping("/outsum")
	public Result outsum() {
		return service.outsum();
	}
}
