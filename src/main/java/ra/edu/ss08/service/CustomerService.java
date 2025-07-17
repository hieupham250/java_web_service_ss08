package ra.edu.ss08.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.edu.ss08.model.entity.Employee;
import ra.edu.ss08.repository.EmployeeRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CustomerService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee update(Long id, Employee employee) {
        Employee existing = employeeRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Khong tim thay nhan vien voi id: " + id));
        existing.setId(id);
        return employeeRepository.save(existing);
    }

    public void delete(Long id) {
        if (!employeeRepository.existsById(id)) {
            throw new NoSuchElementException("Nhan vien khong ton tai");
        }
        employeeRepository.deleteById(id);
    }
}
