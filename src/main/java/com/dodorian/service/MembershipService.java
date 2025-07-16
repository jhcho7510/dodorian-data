package com.dodorian.service;

import com.dodorian.dto.Membership;
import com.dodorian.mapper.MembershipMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MembershipService {

    private final MembershipMapper membershipMapper;

    public List<Membership> getMembershipList() {
        return membershipMapper.getMembershipList();
    }
}
