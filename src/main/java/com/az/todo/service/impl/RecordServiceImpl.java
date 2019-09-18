package com.az.todo.service.impl;

import com.az.todo.dao.entity.RecordEntity;
import com.az.todo.dao.mapper.RecordMapper;
import com.az.todo.dao.mapper.UserInfoMapper;
import com.az.todo.dto.RecordDto;
import com.az.todo.enums.RecordStatus;
import com.az.todo.service.IRecordService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RecordServiceImpl implements IRecordService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Autowired
    RecordMapper recordMapper;

    @Override
    public void addRecord(String title, String text, int userId) {
        RecordEntity recordEntity = RecordEntity.builder().text(title).status(RecordStatus.TODO).userId(userId).build();
        recordMapper.saveRecord(recordEntity);
    }

    @Override
    public PageInfo<RecordDto> fuzzyQueryRecordByContent(String key, int userId, int pageSize, int pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        Page<RecordEntity> recordEntityPage = recordMapper.fuzzyQueryRecordListByIdAndKey(userId, key);
        Page<RecordDto> recordDtoPage = new Page<>();
        BeanUtils.copyProperties(recordEntityPage, recordDtoPage);
        for (RecordEntity entity : recordEntityPage) {
            RecordDto dto = new RecordDto();
            BeanUtils.copyProperties(entity, dto);
            recordDtoPage.add(dto);
        }
        PageInfo<RecordDto> recordDtoPageInfo = new PageInfo<>(recordDtoPage);
        return recordDtoPageInfo;
    }

    @Override
    public void updateRecordContent(RecordDto newDto) {
        RecordEntity entity = new RecordEntity();
        BeanUtils.copyProperties(newDto, entity);
        recordMapper.updateRecord(entity);
    }

    @Override
    public void updateRecordStatus(int id, int userId, RecordStatus newStatus) {
        recordMapper.updateRecordStatus(id, userId, newStatus);
    }
}
