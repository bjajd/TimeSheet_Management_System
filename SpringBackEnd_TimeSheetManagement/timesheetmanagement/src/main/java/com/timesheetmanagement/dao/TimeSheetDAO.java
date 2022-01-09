package com.timesheetmanagement.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.timesheetmanagement.model.TimeSheet;

@Repository
public interface TimeSheetDAO extends CrudRepository<TimeSheet, Integer> {

}
