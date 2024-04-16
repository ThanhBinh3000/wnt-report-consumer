package vn.com.gsoft.report.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.com.gsoft.report.entity.Inventory;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Long> {

}
