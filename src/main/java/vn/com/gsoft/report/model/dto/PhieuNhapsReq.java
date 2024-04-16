package vn.com.gsoft.report.model.dto;

import lombok.Data;
import vn.com.gsoft.report.model.system.BaseRequest;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Data
public class PhieuNhapsReq extends BaseRequest {
    private Long soPhieuNhap;
    private Date ngayNhap;
    private Integer vat;
    private String dienGiai;
    private BigDecimal tongTien;
    private BigDecimal daTra;
    private String nhaThuocMaNhaThuoc;
    private Integer loaiXuatNhapMaLoaiXuatNhap;
    private Long nhaCungCapMaNhaCungCap;
    private Long khachHangMaKhachHang;
    private Boolean active;
    private Boolean isModified;
    private Boolean locked;
    private Boolean isDebt;
    private Date preNoteDate;
    private String connectivityNoteID;
    private Long connectivityStatusID;
    private String connectivityResult;
    private Date connectivityDateTime;
    private Long orderId;
    private Long archivedId;
    private Long storeId;
    private Long targetId;
    private Long sourceId;
    private Long sourceStoreId;
    private Long targetStoreId;
    private Long partnerId;
    private UUID uId;
    private String invoiceCode;
    private String invoiceNo;
    private BigDecimal score;
    private BigDecimal preScore;
    private String referenceKey;
    private Date invoiceDate;
    private String invoiceTemplateCode;
    private String invoiceSeries;
    private String invoiceType;
    private Date archivedDate;
    private Long timeTypeId;
    private String noteName;
    private String notes;
    private String reasons;
    private Long synStatusId;
    private Long paymentTypeId;
    private BigDecimal debtPaymentAmount;
    private Long pickUpOrderId;
    private String linkFile;
    private BigDecimal discount;
    private Long targetManagementId;
}
