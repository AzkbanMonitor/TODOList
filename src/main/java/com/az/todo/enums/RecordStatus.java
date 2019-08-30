package com.az.todo.enums;

public enum RecordStatus {
    TODO("todo"), DONE("done"), DELETED("deleted");

    private String recordStatus;

    RecordStatus(String status) {
        this.recordStatus = status;
    }
}
