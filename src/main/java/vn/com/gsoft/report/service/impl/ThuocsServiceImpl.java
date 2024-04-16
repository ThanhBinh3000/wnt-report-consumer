package vn.com.gsoft.report.service.impl;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.gsoft.report.entity.Thuocs;
import vn.com.gsoft.report.model.dto.ThuocsReq;
import vn.com.gsoft.report.repository.ThuocsRepository;
import vn.com.gsoft.report.service.ThuocsService;

@Service
@Log4j2
public class ThuocsServiceImpl extends BaseServiceImpl<Thuocs, ThuocsReq, Long> implements ThuocsService {

    private ThuocsRepository hdrRepo;

    @Autowired
    public ThuocsServiceImpl(ThuocsRepository hdrRepo) {
        super(hdrRepo);
        this.hdrRepo = hdrRepo;
    }


}
