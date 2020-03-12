package com.oj.onlinejudge.dao;

import com.oj.onlinejudge.entity.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestCaseDao extends JpaRepository<TestCase,Long> {
}
