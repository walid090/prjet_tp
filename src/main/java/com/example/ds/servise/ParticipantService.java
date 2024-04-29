package com.example.ds.servise;

import com.example.ds.entity.Participant;
import com.example.ds.repositrory.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipantService implements IParticipantService {
    @Autowired
    private  ParticipantRepository participantRepository;

    @Override
    public Participant addParticipant(Participant p){
        return participantRepository.save(p);
    }
    @Override
    public  Participant getbyId(int id){
        return participantRepository.findById(id).orElse(null);
    }
    @Override
    public Participant updateParticipant(Participant p){
        return participantRepository.save(p);
    }
    @Override
    public void deleteParticipant(int id){
        participantRepository.deleteById(id);
    }

    @Override
    public List<Participant> getAllParticipants() {
        return (List<Participant>) participantRepository.findAll();
    }
}
