package com.example.eneitty;

import lombok.Data;

import java.util.Date;

/**
 * 报告数据源配置表
 *
 * @author licocon
 */
@Data
public class ReportDataSourceItem {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 报告数据源配置表ID
     */
    private Long dataSourceId;

    /**
     * 字段中文名称
     */
    private String dataSourceItemName;

    /**
     * 字段英文名称
     */
    private String dataSourceItemField;

    /**
     * 是否默认选中:0否，1是
     */
    private Integer defaultSelect;

    /**
     * 字段是否在数据模版启用
     */
    private Integer itemEnable;

    /**
     * 创建人ID
     */
    private Long createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人ID
     */
    private Long updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;
}
