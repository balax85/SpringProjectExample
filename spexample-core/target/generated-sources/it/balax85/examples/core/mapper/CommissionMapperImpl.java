package it.balax85.examples.core.mapper;

import it.balax85.examples.common.dbo.CommissionDbo;
import it.balax85.examples.common.dbo.ItemDbo;
import it.balax85.examples.common.dto.CommissionDto;
import it.balax85.examples.common.dto.ItemDto;
import it.balax85.examples.common.entity.Commission;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2016-11-16T08:35:35+0100",
    comments = "version: 1.0.0.Final, compiler: javac, environment: Java 1.8.0_111 (Oracle Corporation)"
)
@Component
public class CommissionMapperImpl implements CommissionMapper {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public CommissionDto map(CommissionDbo commissionDbo) {
        if ( commissionDbo == null ) {
            return null;
        }

        CommissionDto commissionDto = new CommissionDto();

        commissionDto.setId( commissionDbo.getId() );
        commissionDto.setCommissionDate( commissionDbo.getCommissionDate() );
        commissionDto.setItems( itemMapper.map2Dto( commissionDbo.getItems() ) );

        return commissionDto;
    }

    @Override
    public CommissionDbo map(Commission commission) {
        if ( commission == null ) {
            return null;
        }

        CommissionDbo commissionDbo = new CommissionDbo();

        commissionDbo.setId( commission.getId() );
        commissionDbo.setCommissionDate( commission.getCommissionDate() );

        return commissionDbo;
    }

    @Override
    public Commission map2entity(CommissionDbo commissionDbo) {
        if ( commissionDbo == null ) {
            return null;
        }

        Commission commission = new Commission();

        commission.setId( commissionDbo.getId() );
        commission.setCommissionDate( commissionDbo.getCommissionDate() );

        return commission;
    }

    @Override
    public CommissionDbo map2Dbo(CommissionDto commissionDto) {
        if ( commissionDto == null ) {
            return null;
        }

        CommissionDbo commissionDbo = new CommissionDbo();

        commissionDbo.setId( commissionDto.getId() );
        commissionDbo.setCommissionDate( commissionDto.getCommissionDate() );
        commissionDbo.setItems( itemDtoListToItemDboList( commissionDto.getItems() ) );

        return commissionDbo;
    }

    @Override
    public List<CommissionDto> map2Dto(List<CommissionDbo> commissionDboList) {
        if ( commissionDboList == null ) {
            return null;
        }

        List<CommissionDto> list = new ArrayList<CommissionDto>();
        for ( CommissionDbo commissionDbo : commissionDboList ) {
            list.add( map( commissionDbo ) );
        }

        return list;
    }

    @Override
    public List<CommissionDbo> map2Dbo(List<Commission> commissionList) {
        if ( commissionList == null ) {
            return null;
        }

        List<CommissionDbo> list = new ArrayList<CommissionDbo>();
        for ( Commission commission : commissionList ) {
            list.add( map( commission ) );
        }

        return list;
    }

    protected List<ItemDbo> itemDtoListToItemDboList(List<ItemDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ItemDbo> list_ = new ArrayList<ItemDbo>();
        for ( ItemDto itemDto : list ) {
            list_.add( itemMapper.map2Dbo( itemDto ) );
        }

        return list_;
    }
}
