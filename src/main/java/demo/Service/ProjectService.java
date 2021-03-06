package demo.Service;

import demo.Model.Project;
import demo.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public void testProject(){
        Project project=new Project();
        project.setDescription("Mi Proyecto");

        projectRepository.save(project);
        Project project2 = projectRepository.findOne(1L);

        System.out.println(project2);


    }

}
