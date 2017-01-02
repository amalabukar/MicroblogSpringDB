package com.theironyard;

import org.springframework.data.repository.CrudRepository;


public interface MicroblogRepository extends CrudRepository<Message, Integer>{
}