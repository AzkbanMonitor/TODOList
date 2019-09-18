package com.az.todo.service;

import com.az.todo.dto.RecordDto;
import com.az.todo.enums.RecordStatus;
import com.github.pagehelper.PageInfo;

public interface IRecordService {

    void addRecord(String title, String text, int userId);

    PageInfo<RecordDto> fuzzyQueryRecordByContent(String key, int userId, int pageSize, int pageNum);

    void updateRecordContent(RecordDto newDto);

    void updateRecordStatus(int id, int userId, RecordStatus newStatus);
}
