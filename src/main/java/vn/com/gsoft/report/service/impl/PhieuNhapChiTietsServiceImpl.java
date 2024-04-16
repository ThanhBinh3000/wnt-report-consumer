package vn.com.gsoft.report.service.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.gsoft.report.entity.PhieuNhapChiTiets;
import vn.com.gsoft.report.model.dto.PhieuNhapChiTietsReq;
import vn.com.gsoft.report.repository.PhieuNhapChiTietsRepository;
import vn.com.gsoft.report.service.PhieuNhapChiTietsService;


@Service
@Log4j2
public class PhieuNhapChiTietsServiceImpl extends BaseServiceImpl<PhieuNhapChiTiets, PhieuNhapChiTietsReq, Long> implements PhieuNhapChiTietsService {

    private PhieuNhapChiTietsRepository hdrRepo;

    @Autowired
    public PhieuNhapChiTietsServiceImpl(PhieuNhapChiTietsRepository hdrRepo) {
        super(hdrRepo);
        this.hdrRepo = hdrRepo;
    }

}
