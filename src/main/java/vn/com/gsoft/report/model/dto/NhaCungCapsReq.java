package vn.com.gsoft.report.model.dto;

import lombok.Data;
import vn.com.gsoft.report.model.system.BaseRequest;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class NhaCungCapsReq extends BaseRequest {

    private Integer maNhaCungCap;
    private String tenNhaCungCap;
    private String diaChi;
    private String soDienThoai;
    private String soFax;
    private String maSoThue;
    private String nguoiDaiDien;
    private String nguoiLienHe;
    private String email;
    private BigDecimal noDauKy;
    private String maNhaThuoc;
    private Integer maNhomNhaCungCap;
    private Date created;
    private Date modified;
    private Integer createdByUserId;
    private Integer modifiedByUserId;
    private Boolean active;
    private Integer supplierTypeId;
    private Integer recordStatusID;
    private String barCode;
    private String diaBanHoatDong;
    private String website;
    private Integer archivedId;
    private Integer referenceId;
    private Integer storeId;
    private Integer masterId;
    private Integer metadataHash;
    private Integer preMetadataHash;
    private String code;
    private Integer mappingStoreId;
    private Integer isOrganization;
}

