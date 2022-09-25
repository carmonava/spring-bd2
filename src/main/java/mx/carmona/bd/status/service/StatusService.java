package mx.carmona.bd.status.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import mx.carmona.bd.status.models.StatusModel;


@Service
public class StatusService {

	public List<StatusModel> getStatusService() {
		StatusModel jerarquia = new StatusModel();
		jerarquia.setIdStatus(10);
		jerarquia.setStatus("principal");

		List<StatusModel> rango = new ArrayList<>();
		rango.add(jerarquia);

		return rango;
	}

}
