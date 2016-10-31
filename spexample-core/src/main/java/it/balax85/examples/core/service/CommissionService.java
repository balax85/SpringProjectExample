package it.balax85.examples.core.service;

import it.balax85.examples.common.dto.CommissionDto;
import it.balax85.examples.common.service.ICommissionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by andrea on 23/10/16.
 */
@Service
public class CommissionService implements ICommissionService {

    @Override
    public CommissionDto insertCommission(CommissionDto commission) {
        return null;
    }

    @Override
    public CommissionDto findById(Long id) {
        return null;
    }

    @Override
    public List<CommissionDto> getCommissions() {
        return null;
    }

    @Override
    public void deleteCommission(Long id) {

    }
}
