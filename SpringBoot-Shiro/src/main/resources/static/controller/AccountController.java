package com.kaishengit.controller;

import com.kaishengit.dto.Result;
import com.kaishengit.entitys.Account;
import com.kaishengit.entitys.Roles;
import com.kaishengit.exception.ServiceException;
import com.kaishengit.service.AccountRolesKeyService;
import com.kaishengit.service.AccountService;
import com.kaishengit.service.RolesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/manager")
public class AccountController {

    @Autowired
    private AccountRolesKeyService accountRolesKeyService;
    @Autowired
    private AccountService accountService;
    @Autowired
    private RolesService rolesService;

    private Logger logger = LoggerFactory.getLogger(AccountController.class);

    @PostMapping("/account/update/{id}")
    public String update(Account account,Integer[] rolesIds){
        accountService.update(account);
        accountRolesKeyService.update(account,rolesIds);
        logger.info("更新用户{}",account);
        return "redirect:/manager/account";
    }

    @GetMapping("/account/update/{id}")
    public String update(@PathVariable Integer id,Model model){
        Account account = accountService.findById(id);
        model.addAttribute("account",account);
        List<Roles> rolesList = rolesService.findAllRoles();
        model.addAttribute("rolesList",rolesList);
        return "manager/account/update";
    }


    @GetMapping("/account/del/{id}")
    @ResponseBody
    public Result delById(@PathVariable Integer id){
        Account account = accountService.findById(id);
        logger.info("删除用户{}",account);
        accountService.delById(id);
        accountRolesKeyService.delByAccountId(id);
        Result result  = Result.success();
        return result;
    }


    @GetMapping("/account")
    public String home(Model model, @RequestParam(required = false) Integer rolesId,
                                     @RequestParam(required = false) String mobile){
        List<Roles> rolesList = rolesService.findAllRoles();
        model.addAttribute("rolesList",rolesList);
        Map<String,Object> map = new HashMap<>();
        map.put("rolesId",rolesId);
        map.put("mobile",mobile);
        List<Account> accountList = accountService.findAccountWithParam(map);
        model.addAttribute("accountList",accountList);
        return "/manager/account/home";
    }

    @GetMapping("/account/add")
    public String addAccount(Model model){
        List<Roles> rolesList = rolesService.findAllRoles();
        model.addAttribute("rolesList",rolesList);
        return "/manager/account/add";
    }

    @PostMapping("/account/add")
    @ResponseBody
    public Result addAccount(Account account, RedirectAttributes redirectAttributes,Integer[] rolesIds){
        try {
            Account accountNew = accountService.addAccount(account);
            accountRolesKeyService.addAccountRoles(accountNew,rolesIds);
            Result result = Result.success();
            logger.info("添加账户{}",account);
            return result;
        }catch (ServiceException e){
            Result result = Result.error(e.getMessage());
            return result;
        }
    }
}
