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
//	��¼
	@PostMapping("/login")
	public Result login(User user,HttpServletRequest request) {
		return service.login(user, request);
	}
//	�����ѯ
	@GetMapping("/find")
	public Result find(String financename) {
		return service.find(financename);
	}
	//֧����ѯ
	@GetMapping("/finds")
	public Result finds(String financename) {
		return service.finds(financename);
	}
	//���ӷ���
	@PostMapping("/addSort")
	public Result addSort(@RequestBody Sort sort) {
		return service.addSort(sort);
	}
	//��ѯ��ʾ����
	@GetMapping("/selectSort")
	public Result selectSort() {
		return service.selectSort();
	}
	//�޸ķ���
	@PostMapping("/updateSort")
	public Result updateSort(@RequestBody Sort sort) {
		return service.updateSort(sort);
	}
	//ɾ���������
	@PostMapping("/deleteSort")
	public Result deleteSort(@RequestBody Sort sort) {
		return service.deleteSort(sort);
	}
	//ɾ��֧������
	@GetMapping("/selectoutSort")
	public Result selectoutSort() {
		return service.selectoutSort();
	}
	//�޸�Ȩ��
	@PostMapping("/updateroleid")
	public Result updateroleid(@RequestBody String username) {
		System.out.println(username);
		return service.updateroleid(username);
	}
	//������Ϣ
	@PostMapping("/addRun")
	public Result addRun(@RequestBody Run run) {
		return service.addRun(run);
	}
	//��ѯ��ʾ��Ϣ
	@GetMapping("/selectRun")
	public Result selectRun() {
		return service.selectRun();
	}
	//�޸���Ϣ
	@PostMapping("/updateRun")
	public Result updateRun(@RequestBody Run run) {
		return service.updateRun(run);
	}
	//ɾ����Ϣ
	@PostMapping("/deleteRun")
	public Result deleteRun(@RequestBody Run run) {
		return service.deleteRun(run);
	}
	//��ѯ֧����Ϣ
	@GetMapping("/selectoutRun")
	public Result selectoutRun() {
		return service.selectoutRun();
	}
	//��ѯ�����
	@GetMapping("/findss")
	public Result findss() {
		return service.findss();
	}
	//��ѯ�����
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
