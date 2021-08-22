package com.dio.pontoeacesso.repository;

import com.dio.pontoeacesso.model.TipoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDataRepository extends JpaRepository<TipoData,Long> {
}
