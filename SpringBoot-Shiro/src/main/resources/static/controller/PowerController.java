package com.kaishengit.controller;

import com.kaishengit.dto.Result;
import com.kaishengit.entitys.Power;
import com.kaishengit.exception.ServiceException;
import com.kaishengit.service.PowerService;
import com.kaishengit.shiro.CustomerFilterChainDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/manager")
public class PowerController {

    @Autowired
    private PowerService powerService;

    @Autowired
    private CustomerFilterChainDefinition customerFilterChainDefinition;

    private Logger logger = LoggerFactory.getLogger(PowerController.class);

    @PostMapping("/power/update/{id}")
    public String update(Power power){
        powerService.update(power);

        return "redirect:/manager/power";
    }

    @GetMapping("/power/update/{id}")
    public String update(@PathVariable Integer id,Model model){
        Power power = powerService.findPowerById(id);
        model.addAttribute("power",power);
        List<Power> powerList = powerService.findAllPower();
        model.addAttribute("powerList",powerList);
        return "manager/power/update";
    }

    @GetMapping("/exit")
    public String exit(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.invalidate();
       return "redirect:/";
    }


    @GetMapping("/power")
    public String home(Model model){
        List<Power> powerList = powerService.findAllPower();
        model.addAttribute("powerList",powerList);
        return "manager/power/home";
    }

    @GetMapping("/power/add")
    public String addPower(Model model){
        List<Power> powerList = powerService.findAllPower();
        model.addAttribute("powerList",powerList);
        return "manager/power/add";
    }

    @PostMapping("/power/add")
    public String addPower(Power power){
        powerService.addPower(power);
        customerFilterChainDefinition.update();
        return "redirect:/manager/power";
    }


    @GetMapping("/power/del/{id}")
    @ResponseBody
    public Result delPowerById(@PathVariable Integer id){

        try {
            powerService.delPowerById(id);
            Result result = Result.success();
            customerFilterChainDefinition.update();
            return result;
        }catch (ServiceException e){
            Result result = Result.error(e.getMessage());
            return result;
        }
    }


}
