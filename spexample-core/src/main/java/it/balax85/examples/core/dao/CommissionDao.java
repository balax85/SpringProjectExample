package it.balax85.examples.core.dao;

import it.balax85.examples.common.dao.ICommissionDao;
import it.balax85.examples.common.dbo.CommissionDbo;
import it.balax85.examples.core.mapper.CommissionMapper;
import it.balax85.examples.core.repository.CommissionRepository;
import it.balax85.examples.core.test.CommissionRepositoryA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by andrea on 27/10/16.
 */
@Repository
public class CommissionDao implements ICommissionDao {

    private CommissionRepository commissionRepository1;

    private CommissionRepositoryA commissionRepository2;

    private CommissionMapper commissionMapper;

    @Autowired
    public CommissionDao(CommissionRepository commissionRepository1, CommissionRepositoryA commissionRepository2, CommissionMapper commissionMapper) {
        this.commissionRepository1 = commissionRepository1;
        this.commissionRepository2 = commissionRepository2;
        this.commissionMapper = commissionMapper;
    }

    @Override
    public CommissionDbo insertCommission(CommissionDbo commission) {
        return commissionMapper.map(commissionRepository1.save(commissionMapper.map2entity(commission)));
    }

    @Override
    public CommissionDbo findById(Long id) {
        return commissionMapper.map(commissionRepository1.findById(id));
    }

    @Override
    public List<CommissionDbo> getCommissions() {
        return commissionMapper.map2Dbo(commissionRepository1.findAll());
    }

    @Override
    public void deleteCommission(Long id) {
        commissionRepository1.delete(id);
    }
}
