package htw.webtech.webtech;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {

    public List<ClassDTO> getAllClasses(){
        return List.of(
                new ClassDTO("Webtech", "Nasaltev"),
                new ClassDTO("Prog", "Wider")
        );
    }
}
