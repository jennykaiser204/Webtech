package htw.webtech.webtech;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pl")
public class ClassController {

    private final ClassService classService;

    public ClassController(ClassService classService) { this.classService = classService;}

    @GetMapping("/classes")
    public ResponseEntity<List<ClassDTO>> getClasses(){

        return ResponseEntity.ok(classService.getAllClasses());
    }
}
