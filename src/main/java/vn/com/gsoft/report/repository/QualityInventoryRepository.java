package vn.com.gsoft.report.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.com.gsoft.report.entity.QualityInventory;

@Repository
public interface QualityInventoryRepository extends CrudRepository<QualityInventory, Long> {

}
