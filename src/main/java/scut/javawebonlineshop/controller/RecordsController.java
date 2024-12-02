package scut.javawebonlineshop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import scut.javawebonlineshop.pojo.Result;
import scut.javawebonlineshop.pojo.Records;
import scut.javawebonlineshop.service.RecordsService;


@CrossOrigin
@Slf4j
@RestController
public class RecordsController {
    @Autowired
    private RecordsService recordsService;

    @PostMapping("/addRecord")
    public Result addRecord(@RequestBody Records records){
        recordsService.addRecord(records);
        return Result.success();
    }

    @PostMapping("/getBrowseRecordList")
    public Result getBrowseRecordList(){
        return Result.success(recordsService.getBrowseRecordList());
    }

    @PostMapping("/getBuyRecordList")
    public Result getBuyRecordList(){
        return Result.success(recordsService.getBuyRecordList());
    }
}
