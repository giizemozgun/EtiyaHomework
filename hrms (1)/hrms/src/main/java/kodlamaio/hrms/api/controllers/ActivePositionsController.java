package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ActivePositionService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.ActivePosition;



@RestController
@RequestMapping("/api/activepositions")
public class ActivePositionsController {

private ActivePositionService activePositionService;

@Autowired
public ActivePositionsController(ActivePositionService activePositionService) {
	super();
	this.activePositionService = activePositionService;
}

@GetMapping("/getall")
public DataResult<List<ActivePosition>> getAll(){
	return this.activePositionService.getAll();
}

@PostMapping("/add")
public Result add(@RequestBody ActivePosition activePosition) {
	return this.activePositionService.add(activePosition);
}
}

