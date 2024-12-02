package scut.javawebonlineshop.service;

import scut.javawebonlineshop.pojo.Records;

import java.util.List;

public interface RecordsService {
    void addRecord(Records records);

    List<Records> getBrowseRecordList();

    List<Records> getBuyRecordList();
}
