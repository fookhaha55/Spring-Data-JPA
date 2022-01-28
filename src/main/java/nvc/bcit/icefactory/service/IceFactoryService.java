package nvc.bcit.icefactory.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import groovy.util.Factory;
import nvc.bcit.icefactory.repository.IcefactoryRepository;

// import nvc.it.employee.model.Employee;
// import nvc.it.employee.repository.EmployeeRepository;

@Service
public class IceFactoryService {
    
    @Autowired
    public List<Factory>findAll(){
        return IcefactoryRepository.findAll();
    }
   

    
}

    

