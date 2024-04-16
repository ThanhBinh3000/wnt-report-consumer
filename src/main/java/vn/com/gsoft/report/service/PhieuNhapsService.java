package vn.com.gsoft.report.service;


import vn.com.gsoft.report.entity.PhieuNhaps;
import vn.com.gsoft.report.entity.PhieuXuats;
import vn.com.gsoft.report.model.dto.PhieuNhapsReq;

public interface PhieuNhapsService extends BaseService<PhieuNhaps, PhieuNhapsReq, Long> {


    PhieuNhaps createByPhieuXuats(PhieuXuats e);

    PhieuNhaps updateByPhieuXuats(PhieuXuats e);

    PhieuNhaps init(Integer maLoaiXuatNhap, Long id);
}