package com.vahner.airticketsapp.controller.page;

import com.vahner.airticketsapp.entity.Account;
import com.vahner.airticketsapp.service.interf.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/api/accounts")
@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Account getAccountById(@PathVariable("id") UUID id) {
        return accountService.getAccountById(id);
    }

    @GetMapping
    public List<Account> getAccount() {
        return accountService.getAccount();
    }

    @PostMapping("/createAccount")
    public Account createAccount(@RequestBody Account account){
        return accountService.create(account);
    }
}