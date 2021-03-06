package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilites.results.DataResult;

import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerService {

	DataResult<Employer> add(Employer employer);

	DataResult<List<Employer>> getAll();

	Employer findByEmployerId(int id);

	Employer update(Employer employer);

}
