package com.example.ds.servise;

import com.example.ds.entity.Participant;

import java.util.List;

public interface IParticipantService {
    public Participant addParticipant(Participant p);
    public  Participant getbyId(int id);
    public Participant updateParticipant(Participant p);
    public void deleteParticipant(int id);
    public List<Participant> getAllParticipants();

}
