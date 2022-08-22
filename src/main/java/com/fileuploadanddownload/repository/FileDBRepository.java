package com.fileuploadanddownload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fileuploadanddownload.model.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {
	
}