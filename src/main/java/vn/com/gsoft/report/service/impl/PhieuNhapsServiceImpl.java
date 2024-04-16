package vn.com.gsoft.report.service.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.gsoft.report.entity.PhieuNhaps;
import vn.com.gsoft.report.entity.PhieuXuats;
import vn.com.gsoft.report.model.dto.PhieuNhapsReq;
import vn.com.gsoft.report.repository.PhieuNhapsRepository;
import vn.com.gsoft.report.service.PhieuNhapsService;


@Service
@Log4j2
public class PhieuNhapsServiceImpl extends BaseServiceImpl<PhieuNhaps, PhieuNhapsReq, Long> implements PhieuNhapsService {

    private PhieuNhapsRepository hdrRepo;

    @Autowired
    public PhieuNhapsServiceImpl(PhieuNhapsRepository hdrRepo) {
        super(hdrRepo);
        this.hdrRepo = hdrRepo;
    }

    @Override
    public PhieuNhaps init(Integer maLoaiXuatNhap, Long id) {
        return null;
    }

    @Override
    public PhieuNhaps createByPhieuXuats(PhieuXuats e) {
        return null;
    }

    @Override
    public PhieuNhaps updateByPhieuXuats(PhieuXuats e) {
        return null;
    }


}
