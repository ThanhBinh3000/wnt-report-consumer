package vn.com.gsoft.report.service.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.gsoft.report.entity.PhieuXuatChiTiets;
import vn.com.gsoft.report.model.dto.PhieuXuatChiTietsReq;
import vn.com.gsoft.report.repository.PhieuXuatChiTietsRepository;
import vn.com.gsoft.report.service.PhieuXuatChiTietsService;


@Service
@Log4j2
public class PhieuXuatChiTietsServiceImpl extends BaseServiceImpl<PhieuXuatChiTiets, PhieuXuatChiTietsReq, Long> implements PhieuXuatChiTietsService {

    private PhieuXuatChiTietsRepository hdrRepo;

    @Autowired
    public PhieuXuatChiTietsServiceImpl(PhieuXuatChiTietsRepository hdrRepo) {
        super(hdrRepo);
        this.hdrRepo = hdrRepo;
    }

}
