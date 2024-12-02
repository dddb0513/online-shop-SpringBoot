package scut.javawebonlineshop.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import scut.javawebonlineshop.pojo.Records;
import scut.javawebonlineshop.pojo.Users;

import java.util.List;

@Mapper
public interface RecordsMapper {
    @Insert("insert into records(user_name,pro_name,record_type) values(#{userName},#{proName},#{recordType})")
    void addRecord(Records records);

    @Select("select * from records where record_type=0")
    List<Records> getBrowseRecordList();

    @Select("select * from records where record_type=1")
    List<Records> getBuyRecordList();

}
