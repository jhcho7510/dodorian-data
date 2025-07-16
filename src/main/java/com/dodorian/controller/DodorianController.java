package com.dodorian.controller;

import com.dodorian.dto.Membership;
import com.dodorian.service.MembershipService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dodorian")
public class DodorianController {

    private final MembershipService membershipService;
    @GetMapping("/membershipList")
    public List<Membership> sample() {
        System.out.println(":::: Dodorian ::::");
        List<Membership> membershipList = membershipService.getMembershipList();
        membershipList.stream().forEach(System.out::println);

        return membershipList;
    }
}
