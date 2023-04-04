package com.example.service;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.example.eneitty.ReportDataSource;
import com.example.eneitty.ReportDataSourceItem;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

@SpringBootTest
class ReportDataSourceBizServiceTest {
    @Autowired
    private ReportDataSourceBizService reportDataSourceBizService;

    @Autowired
    private ReportDataSourceItemBizService reportDataSourceItemBizService;

    @Test
    void test() {
        List<ExcelEntity> objects = EasyExcel.read(new File("/Users/licocon/Downloads/数据报告展示清单.xlsx"), ExcelEntity.class, new ReadListener<ExcelEntity>() {
            @Override
            public void invoke(ExcelEntity data, AnalysisContext context) {

            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext context) {

            }
        }).doReadAllSync();
        List<ReportDataSourceItem> reportDataSourceItemList = new CopyOnWriteArrayList<>();
        AtomicLong atomicLong = new AtomicLong();
        for (ExcelEntity entity : objects) {
            String one = StringUtils.trim(entity.getOne());
            String two = StringUtils.trim(entity.getTwo());
            String three = StringUtils.trim(entity.getThree());
            String four = StringUtils.trim(entity.getFour());
            String five = StringUtils.trim(entity.getFive());
            String six = StringUtils.trim(entity.getSix());
            if (StringUtils.isNotBlank(one) && StringUtils.isBlank(two)) {
                String[] split = one.split(";");
                ReportDataSource reportDataSource = new ReportDataSource();
                reportDataSource.setDataSourceField(split[0]);
                reportDataSource.setDataSourceName(split[1]);
                reportDataSourceBizService.save(reportDataSource);
                reportDataSourceItemBizService.saveBatch(reportDataSourceItemList);
                atomicLong.set(reportDataSource.getId());
                reportDataSourceItemList.clear();
            } else {
                ReportDataSourceItem reportDataSourceItem = new ReportDataSourceItem();
                reportDataSourceItem.setDataSourceId(atomicLong.get());
                reportDataSourceItem.setDataSourceItemName(two);
                reportDataSourceItem.setDataSourceItemField(one);
                if (StringUtils.isNotBlank(four)) {
                    reportDataSourceItem.setDataSourceItemName(four);
                }
                reportDataSourceItem.setDefaultSelect(StringUtils.equals("√", six) ? 1 : 0);
                reportDataSourceItem.setItemEnable(StringUtils.equals("√", five) ? 1 : 0);
                reportDataSourceItemList.add(reportDataSourceItem);
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {


        System.out.println();

    }

    @Data
    public static class ExcelEntity {
        private String one;
        private String two;
        private String three;
        private String four;
        private String five;
        private String six;


    }

}