package com.example.ds.controller;

import com.example.ds.entity.Participant;
import com.example.ds.servise.IParticipantService;
import com.example.ds.servise.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/participants")
public class ParticipantController {
@Autowired
IParticipantService participantService;

@GetMapping("/getall")
    public List<Participant> getParticipants() {
    return participantService.getAllParticipants();
    }
@PostMapping("/add")
public Participant addParticipant(@RequestBody Participant participant) {
    return participantService.addParticipant(participant);
}

@GetMapping("/getbyid/{id}")
    public Participant getParticipant(@PathVariable("id") int id) {
        return participantService.getbyId(id);
}

}
