package com.genuinecoder.springserver.model.employee;

import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CVDao {

      private CVRepository repository;

      public CVDao(CVRepository repository) {
          this.repository = repository;
      }

      public CV save(CV cv) {
          return repository.save(cv);
      }

      public CV getCV(int id) {
          return repository.findById(id);
      }

      public List<CV> getAllCVs() {
          List<CV> cvs = new ArrayList<>();
          Streamable.of(repository.findAll())
                  .forEach(cvs::add);
          return cvs;
      }

      public void delete(int id) {
          repository.deleteById(id);
      }
}
