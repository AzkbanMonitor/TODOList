package com.az.todo.dao.mapper;

import com.az.todo.dao.entity.RecordEntity;
import com.az.todo.enums.RecordStatus;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordMapper {

    Page<RecordEntity> fuzzyQueryRecordListByIdAndKey(@Param("id") int id, @Param("key") String key);

    int saveRecord(RecordEntity entity);

    void updateRecord(RecordEntity newEntity);

    void updateRecordStatus(@Param("id") int id, @Param("userId") int userId,
                            @Param("status") RecordStatus recordStatus);
}
