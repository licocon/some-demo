package com.example.eneitty;

import lombok.Data;

import java.util.Date;

/**
 * @author licocon
 */
@Data
public class ReportDataSource {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 数据源中文名称
     */
    private String dataSourceName;

    /**
     * 数据源英文字段
     */
    private String dataSourceField;

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

