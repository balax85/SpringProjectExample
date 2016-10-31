package it.balax85.examples.core.dao;

import it.balax85.examples.common.dao.ICommissionDao;
import it.balax85.examples.common.dbo.CommissionDbo;
import it.balax85.examples.core.mapper.CommissionMapper;
import it.balax85.examples.core.repository.CommissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by andrea on 27/10/16.
 */
@Repository
public class CommissionDao implements ICommissionDao {

    private CommissionRepository commissionRepository;

    private CommissionMapper commissionMapper;

    @Autowired
    public CommissionDao(CommissionRepository commissionRepository, CommissionMapper commissionMapper) {
        this.commissionRepository = commissionRepository;
        this.commissionMapper = commissionMapper;
    }

    @Override
    public CommissionDbo insertCommission(CommissionDbo commission) {
        return commissionMapper.map(commissionRepository.save(commissionMapper.map2entity(commission)));
    }

    @Override
    public CommissionDbo findById(Long id) {
        return commissionMapper.map(commissionRepository.findById(id));
    }

    @Override
    public List<CommissionDbo> getCommissions() {
        return commissionMapper.map2Dbo(commissionRepository.findAll());
    }

    @Override
    public void deleteCommission(Long id) {
        commissionRepository.delete(id);
    }
}
