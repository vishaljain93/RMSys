package cyb.rms.rest.controller;

import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cyb.rms.entities.Employee;
import cyb.rms.entities.Project;
import cyb.rms.exceptions.DaoException;
import cyb.rms.services.IEmployeeService;

@RestController
@RequestMapping(path="/project")
public class ProjectController {
	
	private static final Logger LOG = Logger.getLogger(Project.class);
	
	@RequestMapping(method=RequestMethod.PUT)
	public Project addProject(@RequestBody Project project)
	{
		return project;
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, path="/projID")
	public void removeProject(@PathVariable long projID)
	{
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Project updateProject(@RequestBody Project project)
	{
		return project;
		
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public Set<Project> getAllProjects()
	{
		return null;
		
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/projId")
	public Project getProjectById(@PathVariable long projid)
	{
		return null;
	}

}
