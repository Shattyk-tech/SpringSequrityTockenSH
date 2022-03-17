package peaksoft.springsequritytocken.mapper;

import org.springframework.stereotype.Component;
import peaksoft.springsequritytocken.dto.CompanyRequest;
import peaksoft.springsequritytocken.entity.Company;


@Component
public class CompanyEditMapper {

    public Company create(CompanyRequest companyRequest){
        if (companyRequest == null){
            return null;
        }
        Company company = new Company();
        company.setCompanyName(companyRequest.getCompanyName());
        company.setAddress(companyRequest.getAddress());
        company.setEmail(companyRequest.getEmail());
        company.setNumber(companyRequest.getNumber());

        return company;
    }
        public void update(Company company,CompanyRequest companyRequest){

        company.setCompanyName(companyRequest.getCompanyName());
        company.setEmail(companyRequest.getEmail());
        company.setNumber(companyRequest.getNumber());
        company.setAddress(companyRequest.getAddress());

        }


}
