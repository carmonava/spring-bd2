package mx.carmona.bd.status.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.carmona.bd.status.service.StatusService;
import mx.carmona.bd.status.models.*;


@RestController
@RequestMapping("/status")
public class StatusController {
	
	@Autowired
	StatusService statusService;
	

	@GetMapping("/statusl")
	public List<StatusModel> getStatus(){
	   return statusService.getStatusService();
	}
	
}
