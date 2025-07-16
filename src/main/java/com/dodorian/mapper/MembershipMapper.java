package com.dodorian.mapper;

import com.dodorian.dto.Membership;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface MembershipMapper {
    public List<Membership> getMembershipList();
}
