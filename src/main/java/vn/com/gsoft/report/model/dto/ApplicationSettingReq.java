package vn.com.gsoft.report.model.dto;

import lombok.Data;
import vn.com.gsoft.report.model.system.BaseRequest;

@Data
public class ApplicationSettingReq extends BaseRequest {
    private String settingKey;
    private String settingValue;
    private String settingDisplayName;
    private Boolean isReadOnly;
    private String drugStoreId;
    private String description;
    private Boolean activated;
    private Long roleId;
    private Long typeId;
}
