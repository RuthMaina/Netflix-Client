package com.example.netflix;

import com.example.netflix.config.FeignConfig;
import com.example.netflix.models.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="netflix-client", url="http://localhost", configuration = FeignConfig.class)
public interface FeignRestClient {

    @RequestMapping(method = RequestMethod.GET, value = "users")
    Users findAll();

//    @RequestMapping(method= RequestMethod.POST, value="students")
//    Student createStudent(@RequestBody Student student);
//
//    @RequestMapping(method = RequestMethod.POST, value = "matches")
//    String getMatch(@RequestParam("studentId") Long studentId, @RequestParam(name = "gender") String gender);
//
//    @RequestMapping(method = RequestMethod.PATCH, value = "matches")
//    Reject rejectMatch(@PathVariable("blindDateId") Long id, @RequestBody String reject);

//    @RequestMapping(method = RequestMethod.POST, value="matches")
//    Match getMatch(@RequestBody Match match);

//    @RequestMapping(method = RequestMethod.GET, value = "students")
//    Student getById(@RequestParam(name = "studentNumber") String studentNumber);

//    @RequestMapping(method = RequestMethod.GET, value = "lecturers")
//    List<Lecturer> getAllLecturers();

//    @RequestMapping(method = RequestMethod.POST, value="appointments")
//    Appointments createAppointment(@RequestBody Appointments appointments);

//    @RequestMapping(method=RequestMethod.PATCH, value="appointments/{id}")
//    Appointments confirmAppointment(@RequestParam("studentId") Long studentId, @PathVariable(name = "id") Long appointmentId);



}
