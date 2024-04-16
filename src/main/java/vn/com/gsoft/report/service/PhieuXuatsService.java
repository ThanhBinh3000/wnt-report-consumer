package vn.com.gsoft.report.service;


import vn.com.gsoft.report.entity.PhieuXuats;
import vn.com.gsoft.report.model.dto.PhieuXuatsReq;

public interface PhieuXuatsService extends BaseService<PhieuXuats, PhieuXuatsReq, Long> {


    PhieuXuats init(Integer maLoaiXuatNhap, Long id) throws Exception;
}