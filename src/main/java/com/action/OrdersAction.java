package com.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Orders;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.dao.OrdersServiceDao;

@Controller
public class OrdersAction {
	
	//http://localhost:8181/ssm_layui/findall.action
	@Autowired
	private OrdersServiceDao ordrService;
	@RequestMapping(value="/findall",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> findAll(int page,int limit){
		Page infoPage = PageHelper.startPage(page, limit);
		List<Orders> list=ordrService.findAll();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", 0);
		
		map.put("msg", "");
		map.put("count", infoPage.getTotal());
		map.put("data", list);
		
		return map;
	}
	@RequestMapping(value="/getall",produces="application/json;charset=UTF-8")
	@ResponseBody
   public  List<Orders> getAll(){
	   
	   return ordrService.findAll();
   }
}
