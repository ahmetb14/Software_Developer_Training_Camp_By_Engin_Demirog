package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.core.utilites.results.DataResult;
import kodlamaio.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/jobtitle")
@CrossOrigin
public class JobTitlesController {

	private JobTitleService jobTitleService;

	public JobTitlesController(JobTitleService jobTitleService) {

		super();
		this.jobTitleService = jobTitleService;

	}

	@GetMapping("/getall")
	public DataResult<List<JobTitle>> getAll() {

		return this.jobTitleService.getAll();

	}

	@PostMapping("add")
	public DataResult<JobTitle> add(@RequestBody JobTitle title) {

		return this.jobTitleService.add(title);

	}

}
