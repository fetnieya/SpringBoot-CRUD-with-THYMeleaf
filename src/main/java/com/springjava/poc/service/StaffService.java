package com.springjava.poc.service;

import java.util.List;

public interface StaffService<Staff> {
    void save(com.springjava.poc.entity.Staff staff);

    void save(Staff staff);
    List<Staff> getAll();
    com.springjava.poc.entity.Staff getById(Integer id);
    void delete(Staff staff);

    void delete(com.springjava.poc.entity.Staff staff);
}