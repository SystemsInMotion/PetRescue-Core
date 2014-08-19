package com.systemsinmotion.petrescue.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.systemsinmotion.petrescue.entity.PetRecord;
import com.systemsinmotion.petrescue.entity.type.StatusType;

@NoRepositoryBean
@Repository("repository")
public interface PetRepository extends JpaRepository<PetRecord, Integer> {

	List<PetRecord> findByStatus(StatusType status);

}
