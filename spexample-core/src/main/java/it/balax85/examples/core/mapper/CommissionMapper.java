package it.balax85.examples.core.mapper;

import it.balax85.examples.common.dbo.CommissionDbo;
import it.balax85.examples.common.dto.CommissionDto;
import it.balax85.examples.common.entity.Commission;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Created by andrea on 28/10/16.
 */
@Mapper(uses = ItemMapper.class)
public interface CommissionMapper {

    CommissionDto map(CommissionDbo commissionDbo);

    CommissionDbo map(Commission commission);

    @InheritInverseConfiguration
    Commission map2entity(CommissionDbo commissionDbo);

    @InheritInverseConfiguration
    CommissionDbo map2Dbo(CommissionDto commissionDto);

    @InheritInverseConfiguration
    List<CommissionDto> map2Dto(List<CommissionDbo> commissionDboList);

    @InheritInverseConfiguration
    List<CommissionDbo> map2Dbo(List<Commission> commissionList);

}
