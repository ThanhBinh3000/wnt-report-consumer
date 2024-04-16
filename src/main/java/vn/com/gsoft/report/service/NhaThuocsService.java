package vn.com.gsoft.report.service;

import vn.com.gsoft.report.entity.NhaThuocs;
import vn.com.gsoft.report.model.dto.NhaThuocsReq;

public interface NhaThuocsService extends BaseService<NhaThuocs, NhaThuocsReq, Long> {
    Boolean isInTheSameStoreChain(String firstStoreCode, String secondStoreCode);

}