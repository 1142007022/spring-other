package com.kaishengit.controller;

import com.google.common.collect.Maps;
import com.kaishengit.dto.Result;
import com.kaishengit.entitys.Power;
import com.kaishengit.entitys.Roles;
import com.kaishengit.exception.ServiceException;
import com.kaishengit.service.PowerService;
import com.kaishengit.service.RolesPowerKeyService;
import com.kaishengit.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/manager")
public class RolesController {

    @Autowired
    private PowerService powerService;
    @Autowired
    private RolesService rolesService;
    @Autowired
    private RolesPowerKeyService rolesPowerKeyService;

    @PostMapping("/roles/update/{id}")
    public String update(Roles roles,Integer[] powerIds){
        System.out.println("---------"+roles.getId());
       roles.setUpdateTime(new Date());
        rolesPowerKeyService.update(powerIds,roles);
       return "redirect:/manager/roles";
    }

    @GetMapping("/roles/update/{id}")
    public String update(@PathVariable Integer id,Model model){
        Roles roles = rolesService.findById(id);
        model.addAttribute("roles",roles);
        List<Power> powerList = powerService.findAllPower();
        List<Power> rolesPowerList = powerService.findMyPowerById(id);
        Map<Power,Boolean> map = checkedPower(rolesPowerList,powerList);
        model.addAttribute("map",map);
        model.addAttribute("powerList",powerList);
        return "manager/roles/update";
    }

    private Map<Power, Boolean> checkedPower(List<Power> rolesPowerList, List<Power> powerList) {
        Map<Power,Boolean> resultMap = Maps.newLinkedHashMap();
        for(Power power : powerList) {
            boolean flag = false;
            for(Power rolesPower : rolesPowerList) {
                if(power.getPowerName().equals(rolesPower.getPowerName())) {
                    flag = true;
                    break;
                }
            }
            resultMap.put(power,flag);
        }
        return resultMap;
    }

    @GetMapping("/roles/del/{id}")
    @ResponseBody
    public Result delById(@PathVariable Integer id,Model model){
        try {
            rolesService.delById(id);
            Result result = Result.success();
            return result;
        }catch (ServiceException e){
            Result result = Result.error(e.getMessage());
            return result;
        }
    }

    @GetMapping("/roles")
    public String home(Model model){
        List<Roles> rolesList = rolesService.findAllRoles();
        model.addAttribute("rolesList",rolesList);
        return "manager/roles/home";
    }

    @GetMapping("/roles/add")
    public String addRoles(Model model){
        List<Power> powerList = powerService.findAllPower();
        model.addAttribute("powerList",powerList);
        return "manager/roles/add";
    }

    @PostMapping("/roles/add")
    public String addRoles(Roles roles, Integer[] powerIds, RedirectAttributes redirectAttributes){

        rolesService.addRolesAndPowers(roles,powerIds);
        return "redirect:/manager/roles";
    }

}
