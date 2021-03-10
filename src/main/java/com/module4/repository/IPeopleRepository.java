package com.module4.repository;

import com.module4.model.Detail;
import com.module4.model.People;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPeopleRepository extends PagingAndSortingRepository<People,Integer> {
////tìm kiếm theo detail
//    List<People> findAllByDetail(Detail detail);

}
