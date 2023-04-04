package com.example.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.eneitty.ReportDataSourceItem;
import com.example.mapper.ReportDataSourceItemMapper;
import org.springframework.stereotype.Service;

/**
 * @author licocon
 * @since 2023/1/29 14:17
 */
@Service
public class ReportDataSourceItemBizService extends ServiceImpl<ReportDataSourceItemMapper, ReportDataSourceItem> implements WrapperInterface<ReportDataSourceItem> {

}
