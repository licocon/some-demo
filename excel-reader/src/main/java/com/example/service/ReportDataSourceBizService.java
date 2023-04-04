package com.example.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.eneitty.ReportDataSource;
import com.example.mapper.ReportDataSourceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author licocon
 * @since 2023/1/28 15:39
 */
@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ReportDataSourceBizService extends ServiceImpl<ReportDataSourceMapper, ReportDataSource> implements WrapperInterface<ReportDataSource> {


}
