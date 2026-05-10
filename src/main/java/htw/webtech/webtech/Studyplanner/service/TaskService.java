package htw.webtech.webtech.Studyplanner.service;

import htw.webtech.webtech.rest.model.TaskDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    public List<TaskDTO> getAllTasks(){
        return List.of(
                new TaskDTO("M1", "Webtechnologie"),
                new TaskDTO("HA1", "Angewandte Programmierung")
        );
    }
}
