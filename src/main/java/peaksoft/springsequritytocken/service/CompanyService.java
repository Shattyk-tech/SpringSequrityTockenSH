package peaksoft.springsequritytocken.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.springsequritytocken.dto.CompanyRequest;
import peaksoft.springsequritytocken.dto.CompanyResponse;
import peaksoft.springsequritytocken.entity.Company;
import peaksoft.springsequritytocken.mapper.CompanyEditMapper;
import peaksoft.springsequritytocken.mapper.CompanyViewMapper;
import peaksoft.springsequritytocken.repository.CompanyRepository;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyEditMapper editMapper;
    private final CompanyViewMapper viewMapper;
    private final CompanyRepository repository;


    public CompanyResponse create(CompanyRequest companyRequest){
        return viewMapper.viewCompany(repository.save(editMapper.create(companyRequest)));

    }
       public CompanyResponse update(Long id,CompanyRequest companyRequest){
        Company company = repository.findById(id).get();
        editMapper.update(company,companyRequest);
        return viewMapper.viewCompany(repository.save(company));
       }
       public CompanyResponse getCompany(long id){
        return viewMapper.viewCompany(repository.findById(id).get());
       }
       public CompanyResponse deletaById(long id){
        Company company = repository.findById(id).get();
        repository.deleteById(id);
        return viewMapper.viewCompany(company);

       }

}
