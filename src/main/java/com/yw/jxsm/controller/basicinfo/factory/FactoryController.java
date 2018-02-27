package com.yw.jxsm.controller.basicinfo.factory;

import com.yw.jxsm.controller.BaseController;
import com.yw.jxsm.dao.FactoryDao;
import com.yw.jxsm.domain.Factory;
import com.yw.jxsm.service.FactoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class FactoryController extends BaseController{
    @Resource
    FactoryService factoryService;

    @RequestMapping("/basicinfo/factory/list.action")
    public String list(Model model){
        List<Factory> datalist = factoryService.find(null);
        model.addAttribute("datalist",datalist);
        return "/basicinfo/factory/jFactoryList.jsp";
    }
}
