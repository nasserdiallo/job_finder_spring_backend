package com.genuinecoder.springserver.controller;

import com.genuinecoder.springserver.model.employee.CV;
import com.genuinecoder.springserver.model.employee.CVDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CvController {

    @Autowired
    private CVDao cvDao;

    @GetMapping(path= "/api/cv/all")
    public List<CV> getAll(){ return cvDao.getAllCVs();
    }

    @GetMapping(path= "/api/cv/{id}")
    public CV getCV(@PathVariable int id){ return cvDao.getCV(id);
    }

    @GetMapping(path= "/api/cv/delete/{id}")
    public void delete(@PathVariable int id){ cvDao.delete(id);
    }


    @PostMapping(path = "/api/cv/save")
    public CV save(@RequestBody CV cv){ return cvDao.save(cv);
    }


}
