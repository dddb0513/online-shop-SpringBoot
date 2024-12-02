package scut.javawebonlineshop.service.imp;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scut.javawebonlineshop.mapper.RecordsMapper;
import scut.javawebonlineshop.pojo.Result;
import scut.javawebonlineshop.pojo.Records;
import scut.javawebonlineshop.service.RecordsService;

import java.util.List;

@Service
@Slf4j
public class RecordsServiceImp implements RecordsService{
    @Autowired
    private RecordsMapper recordsMapper;

    @Override
    public void addRecord(Records records) {
        recordsMapper.addRecord(records);
    }
    @Override
    public List<Records> getBrowseRecordList(){
        return recordsMapper.getBrowseRecordList();
    }

    @Override
    public List<Records> getBuyRecordList(){
        return recordsMapper.getBuyRecordList();
    }
}
