package com.az.todo.dao.entity;

import com.az.todo.enums.RecordStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RecordEntity {
    private int id;

    private String text;

    private String record;

    private RecordStatus status;

    private int userId;
}
